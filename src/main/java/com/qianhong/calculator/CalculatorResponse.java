package com.qianhong.calculator;

import java.util.Date;

public class CalculatorResponse {

    private int x; // premier nombre
    private int y; // deuxieme nombre
    private int result; //resultat après opération
    private String time; // date actuel

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
