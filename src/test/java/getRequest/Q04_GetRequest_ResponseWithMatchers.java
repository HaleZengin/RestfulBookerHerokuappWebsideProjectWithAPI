package getRequest;

import baseUrl.RestfulBookerHerokuappUrl;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Q04_GetRequest_ResponseWithMatchers extends RestfulBookerHerokuappUrl {

    // Q03' teki sorguyu Matchers class ile dogrulayin

    @Test
    public void test(){

        spec01.pathParam("bir", "25");
        Response response = given().spec(spec01).when().get("/{bir}");

        response.then().assertThat()
                .body("firstname", equalTo("Emilie")
                , "lastname", equalTo("Kristensen")
                , "totalprice", equalTo(593)
                , "depositpaid", equalTo(true)
                , "bookingdates.checkin", equalTo("2022-07-06")
                , "bookingdates.checkout", equalTo("2022-07-13")
                , "additionalneeds", equalTo("Newspaper"));


    }
}
