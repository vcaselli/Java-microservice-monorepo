package br.com.ddtechrj.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ddtechrj.hrpayroll.entities.Payment;
import br.com.ddtechrj.hrpayroll.entities.Worker;
import br.com.ddtechrj.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	
	
	public Payment getPayment(Long workerId, int days) {
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		
		return new Payment(null, worker.getName(), worker.getDailyIncome(), days);
	}

}
