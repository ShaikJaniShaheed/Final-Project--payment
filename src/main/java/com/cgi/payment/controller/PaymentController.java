package com.cgi.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.payment.entity.Payment;
import com.cgi.payment.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	private PaymentService paymentService;
	
	@PostMapping("/save")
	public Payment savePayment(@RequestBody Payment payment)
	{
		System.out.println(payment);
		return this.paymentService.savePayment11(payment);
	}
	
	@GetMapping("/{id}")
	public Payment getPaymentById(@PathVariable("id") Long id)
	{
		return this.paymentService.getPaymentById(id);
	}
}