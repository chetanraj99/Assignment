package com.cts.springtransactionsdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.springtransactionsdemo.entity.PassengerInfo;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long> {
}
