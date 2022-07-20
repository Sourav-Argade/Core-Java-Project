package com.sourav.Interest_Calculator.Service;

import java.util.Scanner;

import com.sourav.Interest_Calculator.DAO.CalculatorDAO;
import com.sourav.Interest_Calculator.inhertiance.BOI;
import com.sourav.Interest_Calculator.inhertiance.BOM;
import com.sourav.Interest_Calculator.inhertiance.Bank;
import com.sourav.Interest_Calculator.inhertiance.CentralBank;

public class CalculatorService {
	CalculatorDAO cdao = new CalculatorDAO();
	Scanner sc = new Scanner(System.in);
	private double rate;
	
	public boolean addBOI() {
		System.out.println("Enter the Principal Amount");
		double principal = sc.nextDouble();
		System.out.println("Enter No. of days");
		int time =sc.nextInt();
		System.out.println("Enter age");
		int age = sc.nextInt();
		if(age>60) {
			rate=0.02;
			}else {
			rate=0.16;
			}
		double interest = (principal*rate*time)/100;
		System.out.println("Interest as per given data is "+interest);
		
		BOI b = new BOI(principal,rate,interest,age,time);
		cdao.addBOI(b);
	//	@Id
		//public super.getBank("BOI"); {
		//	return super.getBank();
		//}
		return true;
		
	}
	
	public boolean addBOM() {
		System.out.println("Enter the Principal Amount");
		double principal = sc.nextDouble();
		System.out.println("Enter No. of days");
		int time =sc.nextInt();
		System.out.println("Enter age");
		int age = sc.nextInt();
		if(age>60) {
			rate=0.01;
			}else {
			rate=0.15;
			}
		double interest = (principal*rate*time)/100;
		System.out.println("Interest as per given data is "+interest);
		
		BOM m = new BOM(principal,rate,interest,age,time);
		cdao.addBOM(m);
		return true;
		
	}
	
	public boolean addCentralBank() {
		System.out.println("Enter the Principal Amount");
		double principal = sc.nextDouble();
		System.out.println("Enter No. of days");
		int time =sc.nextInt();
		System.out.println("Enter age");
		int age = sc.nextInt();
		if(age>60) {
			rate=0.02;
			}else {
			rate=0.16;
			}
		double interest = (principal*rate*time)/100;
		System.out.println("Interest as per given data is "+interest);
		
		CentralBank r = new CentralBank(principal,rate,interest,age,time);
		cdao.addCentralBank(r);
		return true;
		
	}

	public Bank viewCalculator(String bank) {
		return cdao.getCalculatorRecord(bank);
		
		
	}

}
