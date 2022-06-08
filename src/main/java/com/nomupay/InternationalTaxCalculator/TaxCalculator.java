package com.nomupay.InternationalTaxCalculator;

public interface TaxCalculator {
		
	public double calculateForIndia(double i);
	public double calculateForNepal(double i);
	public double calculate(double i, String cc);
}
