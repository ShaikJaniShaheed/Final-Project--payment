package com.cgi.payment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long paymentId;
	private double Amount;
	
	public Payment() {
		System.out.println("payment object created");
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double Amount) {
		this.Amount = Amount;
	}


	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", Amount=" + Amount + "]";
	}

	
	
}