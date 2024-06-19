package com.cts.springtransactionsdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.springtransactionsdemo.entity.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,String> {
}
