package br.com.ddtechrj.hrpayroll.entities;

import java.io.Serializable;

public class Payment implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id; 
	private String name; 
	private Double dailyIncome; 
	private Integer days; 
	
	public Payment() { 
		
	}

	public Payment(Long id, String name, Double dailyIncome, Integer days) {
		super();
		this.id = id;
		this.name = name;
		this.dailyIncome = dailyIncome;
		this.days = days;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}
	
	
	public double getTotal() { 
		return days * dailyIncome;
	}

}
