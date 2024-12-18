package com.ecommerce.electronicscenter.services;

import com.ecommerce.electronicscenter.models.OrderDto;
import com.ecommerce.electronicscenter.models.OrderResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface OrderService {
    OrderResponse getOrderById(String orderId);
    List<OrderResponse> getAllOrders();
    Page<OrderResponse> getAllOrders(Pageable pageable);
    String createOrder(OrderDto order);
    void deleteOrder(String orderId);
}
