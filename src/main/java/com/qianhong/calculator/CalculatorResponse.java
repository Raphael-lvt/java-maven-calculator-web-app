package com.qianhong.calculator;

import java.util.Date;

public class CalculatorResponse {

    int x;
    int y;
    int result;
    String time;

    public CalculatorResponse(int x, int y, int result) {
        x = x;
        y = y;
        result = result;
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
