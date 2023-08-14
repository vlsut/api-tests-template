package org.example;

import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiTest {
    // API test using ugly way of sending request and evaluating response
    @Test
    public void requestShouldReturnData() throws IOException {
        URL url = new URL("https://jsonplaceholder.typicode.com/todos/1");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();

        Assert.assertEquals(responseCode, 200);
    }

    // API test using RestAssured library which makes API test more readable and maintainable
    @Test
    public void requestShouldReturnDataRestAssured() {
        RestAssured.when()
                .get("https://jsonplaceholder.typicode.com/todos/1")
                .then()
                .statusCode(200);
    }
}
