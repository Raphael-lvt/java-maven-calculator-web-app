/*
 *  03.05.2016
 *  Copyright (c) 2016 FOO-COMPANY. All Rights Reserved.
 */

package com.qianhong.calculator;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Date;

@Path("/calculator")
public class CalculatorService {

/**.
 * Ping
 * @return message de bienvenue
 */
    @GET
    @Path("ping")
    @Produces(MediaType.TEXT_PLAIN)
    public String ping() {
        return "Welcome to Java Maven Calculator Web App!!!\n" + new Date().toString();
    }

/**.
 * Operation adition
 * @param x
 * @param y
 * @return CalculatorResponse
 */
    @GET
    @Path("add")
    @Produces(MediaType.APPLICATION_JSON)
    public CalculatorResponse add(@QueryParam("x") final int x, @QueryParam("y") final int y) {
        return new CalculatorResponse(x, y, x + y);
    }

/**.
 * Operation soustraction
 * @param x
 * @param y
 * @return CalculatorResponse
 */
    @GET
    @Path("sub")
    @Produces(MediaType.APPLICATION_JSON)
    public CalculatorResponse sub(@QueryParam("x") final int x, @QueryParam("y") final int y) {
        return new CalculatorResponse(x, y, x - y);
    }

/**.
 * Operation multiplication
 * @param x
 * @param y
 * @return CalculatorResponse
 */
    @GET
    @Path("mul")
    @Produces(MediaType.APPLICATION_JSON)
    public CalculatorResponse mul(@QueryParam("x") final int x, @QueryParam("y") final int y) {
        return new CalculatorResponse(x, y, x * y);
    }

/**.
 * Operation division
 * @param x
 * @param y
 * @return CalculatorResponse
 */
    @GET
    @Path("div")
    @Produces(MediaType.APPLICATION_JSON)
    public CalculatorResponse div(@QueryParam("x") final int x, @QueryParam("y") final int y) {
        return new CalculatorResponse(x, y, x / y);
    }
}
