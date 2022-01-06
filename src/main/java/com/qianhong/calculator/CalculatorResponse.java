package com.qianhong.calculator;

import java.util.Date;

public class CalculatorResponse {

/**.
 * Description de l'attribut privé
 */
    private int x; 
    private int y;
    private int result;
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
