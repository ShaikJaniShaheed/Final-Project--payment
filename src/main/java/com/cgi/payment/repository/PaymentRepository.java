package com.cgi.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cgi.payment.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long>{

}