package com.nomupay.InternationalTaxCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
	String India = "in";

	@Test
    public void taxCalculation() {
    	TaxCalculator calculator= new App();
    	assertEquals(27500.0,27500,calculator.calculate(650000,India));
	}
}
