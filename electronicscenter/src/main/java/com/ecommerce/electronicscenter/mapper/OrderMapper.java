//package com.ecommerce.electronicscenter.mapper;
//
//import com.ecommerce.electronicscenter.entity.Order;
//import com.ecommerce.electronicscenter.models.OrderDto;
//import com.ecommerce.electronicscenter.models.OrderResponse;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//import org.mapstruct.MappingTarget;
//import org.mapstruct.factory.Mappers;
//
//import java.util.List;
//
//@Mapper
//public interface OrderMapper {
//
//    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
//
//    @Mapping(source = "id", target = "id")
//    @Mapping(source = "basketId", target = "basketId")
//    @Mapping(source = "shippingAddress", target = "shippingAddress")
//    @Mapping(source = "subTotal", target = "subTotal")
//    @Mapping(source = "deliveryFee", target = "deliveryFee")
//    @Mapping(target = "total", expression = "java(order.getSubTotal() + order.getDeliveryFee())")
//    @Mapping(target = "orderDate", expression = "java(java.time.LocalDateTime.now())") // Ensure this is handled correctly
//    @Mapping(target = "orderStatus", constant = "Pending") // Reference enum constant directly
//    OrderResponse OrderToOrderResponse(Order order);
//
//    @Mapping(target = "orderDate", expression = "java(orderDto.getOrderDate())") // Ensure correct mapping from DTO
//    @Mapping(target = "orderStatus", constant = "Pending") // Reference enum constant directly
//    Order orderResponseToOrder(OrderDto orderDto);
//
//    List<OrderDto> ordersToOrderResponses(List<Order> orders);
//
//    void updateOrderFromOrderResponse(OrderDto orderDto, @MappingTarget Order order);
//}
