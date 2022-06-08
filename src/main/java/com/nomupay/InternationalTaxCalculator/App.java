package com.nomupay.InternationalTaxCalculator;

import java.util.Scanner;
public class App implements TaxCalculator {
	
    public double calculateForIndia(double i) {
        double tax = 0;
        if(i<=250000)tax=0;
        else if( i>250000 && i<=500000) tax= 0.05*(i-250000);
        else if(i<=750000) tax= 0.10*(i-500000)+12500;
        else if(i<=1000000) tax= 0.15*(i-750000)+37500;
        else if(i<=1250000) tax= 0.20*(i-1000000)+75000;
        else if(i<=1500000) tax= 0.25*(i-1250000)+ 125000;
        else tax= 0.3*(i-1500000)+187500;
        return tax;
        
    }
    public double calculateForNepal(double i) {
    	double tax=0;
    	if(i<=500000)tax= 0;
    	else if(i<=700000) tax= 0.10*(i-500000);
    	else if(i<=800000) tax= 0.20*(i-700000);
    	else if(i<=1500000) tax= 0.30*(i-800000);
    	else tax=0.36*(i-1500000);
    	return tax;
    }
    
    public double calculate(double i, String cc) {
    	switch(cc) {
    	case ("in"):{
    		return calculateForIndia(i);
    	}
    	case ("np"):{
    		return calculateForNepal(i);
    	}
    	}
    	return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String newResponse = "";
        TaxCalculator tc= new App();
       
        do {
        	 System.out.print("Please enter your income: ");
             double income = sc.nextDouble();
             sc.nextLine();
             
             System.out.print("Please enter country code : ");
             String countryCode = sc.next();
             countryCode.toLowerCase();
             sc.nextLine();
             
            System.out.println("Tax : " +tc.calculate(income, countryCode));
            
            System.out.println("Process another response?. Please enter 'y' for yes, or 'n' for no: ");
            newResponse = sc.next();
            sc.nextLine();
            
        } while (newResponse.equals("y"));

    }
}