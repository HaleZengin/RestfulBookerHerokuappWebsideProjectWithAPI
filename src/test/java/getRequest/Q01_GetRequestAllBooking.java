package getRequest;

import baseUrl.RestfulBookerHerokuappUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Q01_GetRequestAllBooking extends RestfulBookerHerokuappUrl {


    // 1) tum get listesini getir

    @Test
    public void test(){

        Response response = given().spec(spec01).contentType(ContentType.JSON).when().get();

        response.prettyPeek();

    }



}
