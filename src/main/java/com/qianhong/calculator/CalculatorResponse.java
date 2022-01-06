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

/**.
 * Constructeur de la classe
 */
    public CalculatorResponse(final int xToInject, final int yToInject, final int resultToInject) {
        this.x = xToInject;
        this.y = yToInject;
        this.result = resultToInject;
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
