package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class ReqresBaseUrl {


    protected RequestSpecification spec;

    @Before//Her @Test methodu öncesi çalışır
    public void setUp() {

        spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.JSON).setBaseUri("https://reqres.in/api/users/").build();
    }
}