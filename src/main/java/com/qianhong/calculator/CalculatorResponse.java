package com.qianhong.calculator;

import java.util.Date;

public class CalculatorResponse {

	/*
	 * Attributs nécessaires au calcul
	 */
    private int x; 
	/*
	 * Attributs nécessaires au calcul
	 */
    private int y;
	/*
	 * Attributs nécessaires au calcul
	 */
    private int result;
	/*
	 * Attributs nécessaires au calcul
	 */
    private String time; 

    public CalculatorResponse(int x, int y, int result) {
        this.x = x;
        this.y = y;
        this.result = result;
        time = new Date().toString();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getResult() {
        return result;
    }

    public String getTime() {
        return time;
    }
}
