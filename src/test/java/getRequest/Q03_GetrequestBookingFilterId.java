package getRequest;

import baseUrl.RestfulBookerHerokuappUrl;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Q03_GetrequestBookingFilterId extends RestfulBookerHerokuappUrl {

    // herokuapp sayfasindaki response' nin id' si 25 olan bilgileri getir.

    @Test
    public void test(){

        spec01.pathParam("bir", "25");
        Response response = given().spec(spec01).when().get("/{bir}");

        response.prettyPrint();


    }


}
