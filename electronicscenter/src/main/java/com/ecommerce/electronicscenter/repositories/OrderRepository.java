//package com.ecommerce.electronicscenter.repositories;
//
//import com.ecommerce.electronicscenter.entity.Order;
//import com.ecommerce.electronicscenter.entity.OrderStatus;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//@Repository
//public interface OrderRepository extends JpaRepository<Order, String> {
//    List<Order> findByBasketId(String basketId);
//    List<Order> findByOrderStatus(OrderStatus orderStatus);
//    List<Order> findByOrderDateBetween(LocalDateTime startdate, LocalDateTime endDate);
//    @Query("SELECT o FROM Order o JOIN o.orderItems oi WHERE oi.itemOrdered.name LIKE %:productName%")
//    List<Order> findByProductNameInOrderItems(@Param("productName") String productName);
//    @Query("SELECT o FROM Order o WHERE o.shippingAddress.city = :city")
//    List<Order> findByShippingAddressCity(@Param("city") String city);
//}
