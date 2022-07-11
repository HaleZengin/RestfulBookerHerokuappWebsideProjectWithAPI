package getRequest;

import baseUrl.RestfulBookerHerokuappUrl;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.GetRequestBookingdatesPojo2;
import pojos.GetRequestIdPojo2;

import static io.restassured.RestAssured.given;

public class Q10_GetRequest_ResponseWithPojo2 extends RestfulBookerHerokuappUrl {


    // herokuapp sayfasindaki response' nin id' si 108 olan bilgileri dogrulayin.

    @Test
    public void test(){

        spec01.pathParam("bir", "108");
        Response response = given().spec(spec01).when().get("/{bir}");

        GetRequestBookingdatesPojo2 bookingdatesPojo2 = new GetRequestBookingdatesPojo2("2022-03-22", "2023-04-18");

        GetRequestIdPojo2 expected = new GetRequestIdPojo2("Millie", "Mohr", 1000, false, bookingdatesPojo2);
        GetRequestIdPojo2 expecteData = new GetRequestIdPojo2("Millie", "Mohr", 1000, false, bookingdatesPojo2);

        GetRequestIdPojo2 actualData = response.as(GetRequestIdPojo2.class);





    }



}
