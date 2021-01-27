package br.com.ddtechrj.hrpayroll.services;

import org.springframework.stereotype.Service;

import br.com.ddtechrj.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(Long workerId, int days) { 
		 return new Payment(null, "Bob", 200.0, days);
	}

}
