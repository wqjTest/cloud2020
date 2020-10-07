package com.atom.springcloud.service;

import com.atom.springcloud.domain.Order;

public interface OrderService {
    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}
