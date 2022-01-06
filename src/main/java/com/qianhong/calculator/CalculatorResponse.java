package com.qianhong.calculator;

import java.util.Date;

public class CalculatorResponse {

/**.
 * Premier nombre du calcul
 */
    private int x;
/**.
 * Deuxième nombre du calcul
 */
    private int y;
/**.
 * Resultat du calcul
 */
    private int result;
/**.
 * Description de l'heure
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
