package getRequest;

import baseUrl.RestfulBookerHerokuappUrl;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Q02_GetRequest_ResponseHeader extends RestfulBookerHerokuappUrl {

    // herokuapp sayfasindaki response' nin Header kismini dogrulayin

    @Test
    public void test(){

        Response response = given().spec(spec01).when().get();

        response.then().assertThat()
                .statusCode(200)
                .header("Server", "Cowboy")
                .header("Connection", "keep-alive")
                .header("Content-Type", "application/json; charset=utf-8")
                .header("Via", "1.1 vegur");



    }


}
