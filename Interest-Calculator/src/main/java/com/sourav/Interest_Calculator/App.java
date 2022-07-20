package com.sourav.Interest_Calculator;

import java.util.Scanner;

import com.sourav.Interest_Calculator.Service.CalculatorService;



/**
 * Hello world!
 *
 */
public class App 
{

	//private static double rate = 0;
	//static int SrNo;

	public static void main( String[] args )
    {
        CalculatorService c = new CalculatorService();
   
        char ch = 'Y';
		while(ch == 'Y' || ch == 'y')
		{
			System.out.println("***** Interest Caculator *****");
			System.out.println("Enter the bank");
			System.out.println("1) Bank of India\n2) Bank of Maharashtra\n3) Central Bank\n4) view Calculations");
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			switch(option) {
			case 1:
				c.addBOI();
				break;
				
			case 2:
				c.addBOM();
				break;
				
			case 3:
				c.addCentralBank();
				break;
				
			case 4:
				System.out.println("Enter bank");
				String bank = sc.next();
				c.viewCalculator(bank);
			}
			System.out.println("Enter Y to continue...");
			ch = sc.next().charAt(0);
		}
		System.out.println("Thank you for using...");
        
    }
}
