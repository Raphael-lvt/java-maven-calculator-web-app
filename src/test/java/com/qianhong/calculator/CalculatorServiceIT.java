package com.qianhong.calculator;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import static org.hamcrest.CoreMatchers.*;

public class CalculatorServiceIT {
	Logger logger = Logger.getLogger(CalculatorServiceIT.class);

    @Test
    public void testPing(){
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://localhost:9999/calculator/api/calculator/ping");
        HttpResponse response;
		try {
			response = httpclient.execute(httpGet);
	        assertEquals(200, response.getStatusLine().getStatusCode());
	        assertThat(EntityUtils.toString(response.getEntity()), containsString("Welcome to Java Maven Calculator Web App!!!"));
		} catch (IOException e) {
			logger.info(e);
		}
    }

    @Test
    public void testAdd(){
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://localhost:9999/calculator/api/calculator/add?x=8&y=26");
        try {
        	HttpResponse response = httpclient.execute(httpGet);
            assertEquals(200, response.getStatusLine().getStatusCode());
            assertThat(EntityUtils.toString(response.getEntity()), containsString("\"result\":34"));
        }catch (IOException e) {
			e.printStackTrace();
		} 
    }

    @Test
    public void testSub(){
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://localhost:9999/calculator/api/calculator/sub?x=12&y=8");
        try {
            HttpResponse response = httpclient.execute(httpGet);
            assertEquals(200, response.getStatusLine().getStatusCode());
            assertThat(EntityUtils.toString(response.getEntity()), containsString("\"result\":4"));       	
        }catch (IOException e) {
        	logger.info(e);
		} 
    }

    @Test
    public void testMul(){
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://localhost:9999/calculator/api/calculator/mul?x=11&y=8");
        try {
            HttpResponse response = httpclient.execute(httpGet);
            assertEquals(200, response.getStatusLine().getStatusCode());
            assertThat(EntityUtils.toString(response.getEntity()), containsString("\"result\":88"));        	
        }catch (IOException e) {
        	logger.info(e);
		}
    }

    @Test
    public void testDiv(){
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://localhost:9999/calculator/api/calculator/div?x=12&y=12");
        try {
            HttpResponse response = httpclient.execute(httpGet);
            assertEquals(200, response.getStatusLine().getStatusCode());
            assertThat(EntityUtils.toString(response.getEntity()), containsString("\"result\":1"));
        }catch (IOException e) {
        	logger.info(e);
		}
    }
}
