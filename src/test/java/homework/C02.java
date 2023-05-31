package homework;


import base_urls.ReqresBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class C02 extends ReqresBaseUrl {



   /*
        Given
            https://reqres.in/api/users/23
        When
            User send a GET Request to the url
        Then
            HTTP Status code should be 404
        And
            Status Line should be HTTP/1.1 404 Not Found
        And
            Server is "cloudflare"
        And
            Response body should be empty
     */


    @Test
    public void C02() {


        spec.pathParams("first","users","second",6);

        Response response =given().spec(spec).when().get("{first}/{second}");
        response.prettyPrint();



        assertEquals(404,response.statusCode());
        assertEquals("HTTP/1.1 404 Not Found",response.statusLine());
        assertEquals("cloudflare",response.getHeader("Server"));
        assertTrue(response.as(HashMap.class).isEmpty());

    }
}
