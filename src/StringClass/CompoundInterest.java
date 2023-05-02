package StringClass;

import java.util.Scanner;

public class CompoundInterest {
	public static void main (String args[]){
	     // double principle, rate, time, compound_interest;
	     // System.out.println("Required packages have been imported");
	     // Scanner sc= new Scanner(System.in);
	     // System.out.println(rinciple number : ");
	      //principle = sc.nextInt();
//	      double principle = 25000;
//	      double rate = 12;
////	      time = sc.nextInt();
//	     double time = 15;
//	     double compound_interest = principle * Math.pow((1 + rate / 100), time);
//	      System.out.println("The Compound Interest is : " + compound_interest);
	      //double sip=principle((1+rate));
	      double investment = 5000; //principal amount
	      double annualRate = 12; 
	      double monthlyRate = (annualRate / 12 )/ 100;  //Rate of interest
	      double years = 15; 
	      double months = years * 12;  //Time period 
	      double futureValue = 0; //Final Value

	      futureValue = investment * (Math.pow(1 + monthlyRate, months) - 1)/ monthlyRate;
	System.out.println(futureValue);
   }
	
}
