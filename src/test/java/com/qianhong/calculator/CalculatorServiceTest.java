package com.qianhong.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;

public class CalculatorServiceTest {

    @Test
    public void testPing() {
        assertThat(new CalculatorService().ping(), containsString("Welcome to Java Maven Calculator Web App!!!"));
    }

    @Test
    public void testAdd() {
        assertEquals(34, new CalculatorService().add(8, 26).getResult());
    }

    @Test
    public void testSub() {
        assertEquals(4, new CalculatorService().sub(12, 8).getResult());
    }

    @Test
    public void testMul() {
        assertEquals(88, new CalculatorService().mul(11, 8).getResult());
    }

    @Test
    public void testDiv() {
        assertEquals(1, new CalculatorService().div(12, 12).getResult());
    }
    
    @Test
    public void testGet() {
    	CalculatorResponse calculatorResponse = new CalculatorResponse(1, 1, 1);
    	assertEquals(1, calculatorResponse.getX());
    	assertEquals(1, calculatorResponse.getY());
    	assertEquals(1, calculatorResponse.getResult());
    }
    
}
