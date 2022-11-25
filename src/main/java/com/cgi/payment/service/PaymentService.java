package com.cgi.payment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.payment.entity.Payment;
import com.cgi.payment.repository.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	private PaymentRepository paymentRepository;

	public Payment savePayment11(Payment payment) {
		// TODO Auto-generated method stub
		return this.paymentRepository.save(payment);
	}

	public Payment getPaymentById(Long id) {
		// TODO Auto-generated method stub
		Optional <Payment> op= this.paymentRepository.findById(id);
		if(op.isPresent()) {
			return op.get();
	}
	else {
		return null;
	}
	
	}

	public Payment savePayment1(Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}

	public Payment savePayment(Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}
}