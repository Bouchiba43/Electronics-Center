package com.ecommerce.electronicscenter.services;

import com.ecommerce.electronicscenter.entity.Product;
import com.ecommerce.electronicscenter.models.ProductResponse;
import com.ecommerce.electronicscenter.repositories.ProductRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductResponse getProductById(String productId) {
        log.info("fetching Product by Id: {}", productId);
        Product product = productRepository.findById(productId)
                .orElseThrow(()->new RuntimeException("Product doesn't exist"));
        ProductResponse productResponse = convertToProductResponse(product);
        log.info("Fetched Product by Product Id: {}", productId);
        return productResponse;
    }

    private ProductResponse convertToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .pictureURL(product.getPictureURL())
                .productBrand(product.getBrand().getName())
                .productType(product.getType().getName())
                .build();
    }

    @Override
    public Page<ProductResponse> getProducts(Pageable pageable, String brandId, String typeId, String keyword) {
        log.info("Fetching Products...");
        Specification<Product> spec = Specification.where(null);
        if(brandId != null){
            spec = spec.and((root, query, criteriaBuilder) ->
                    criteriaBuilder.equal(root.get("brand").get("id"), brandId));
        }
        if(typeId != null){
            spec = spec.and((root, query, criteriaBuilder) ->
                    criteriaBuilder.equal(root.get("type").get("id"), typeId));
        }
        if(keyword != null){
            spec = spec.and((root, query, criteriaBuilder) ->
                    criteriaBuilder.like(root.get("name"), "%"+keyword+"%"));
        }
        log.info("Fetched All Products");
        return productRepository.findAll(spec, pageable)
                .map(this::convertToProductResponse);
    }
}
