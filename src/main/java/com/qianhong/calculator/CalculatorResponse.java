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
 * @param xToInject
 * @param yToInject
 * @param resultToInject
 */
    public CalculatorResponse(final int xToInject, final int yToInject, final int resultToInject) {
        this.x = xToInject;
        this.y = yToInject;
        this.result = resultToInject;
        time = new Date().toString();
    }

/**.
* Getteur de x
* @return x
*/
    public int getX() {
        return x;
    }

/**.
 * Getteur de y
 * @return y
 */
    public int getY() {
        return y;
    }

/**.
 * Getteur de result
 * @return result
 */
    public int getResult() {
        return result;
    }

/**.
 * Getteur de time
 * @return time
 */
    public String getTime() {
        return time;
    }
}
