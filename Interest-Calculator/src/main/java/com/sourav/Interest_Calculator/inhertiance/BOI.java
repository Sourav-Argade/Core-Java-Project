package com.sourav.Interest_Calculator.inhertiance;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BOI extends Bank{
	//private String bank;
	private double principal;
	private double rate;
	private int time;
	private double interest;
	private int age;
	
	public BOI(double principal, double rate, double interest, int age, int time) {
		super();
		setBank("BOI");
		// TODO Auto-generated constructor stub
	}
	
	public BOI(String bank, double principal, double rate, int time, double interest, int age) {
		super(bank);
		//this.bank = bank;
		this.principal = principal;
		this.rate = rate;
		this.time = time;
		this.interest = interest;
		this.age = age;
	}
	@Id
	public String getBank() {
		return super.getBank();
	}
	/*public void setBank(String bank) {
		this.bank = bank;
	}*/
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(float rate) {
		if(age>60) {
			rate=(float) 0.02;
		}else {
			rate=(float) 0.16;
		}
		this.rate = rate;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		interest = (principal*time*rate)/100;
		this.interest = interest;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "BOI [principal=" + principal + ", rate=" + rate + ", time=" + time + ", interest=" + interest + ", age="
				+ age + "]";
	}
	
}
