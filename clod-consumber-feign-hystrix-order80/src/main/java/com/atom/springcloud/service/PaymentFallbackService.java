package com.atom.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_Ok(Integer id) {
        return "-------PaymentFallbackService fall back-paymentInfo_ok ,哈哈";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService fall all back-paymentInfo_TimeOut";
    }
}
