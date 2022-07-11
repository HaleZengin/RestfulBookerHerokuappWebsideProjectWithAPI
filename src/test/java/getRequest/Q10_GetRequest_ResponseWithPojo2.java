package getRequest;

import baseUrl.RestfulBookerHerokuappUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import pojos.GetRequestBookingdatesPojo2;
import pojos.GetRequestIdPojo2;
import pojos.GetrequestIdPojo;

import static io.restassured.RestAssured.given;

public class Q10_GetRequest_ResponseWithPojo2 extends RestfulBookerHerokuappUrl {


    // herokuapp sayfasindaki response' nin id' si 108 olan bilgileri dogrulayin.

    @Test
    public void test(){

        spec01.pathParam("bir", "108");


        GetRequestBookingdatesPojo2 bookingdatesPojo2 = new GetRequestBookingdatesPojo2("2022-03-22", "2023-04-18");


        GetRequestIdPojo2 expecteData = new GetRequestIdPojo2("Millie", "Mohr", 1000, false, bookingdatesPojo2);

        Response response = given().spec(spec01).contentType(ContentType.JSON).when().get("/{bir}");
        response.prettyPrint();

        GetRequestIdPojo2 actualData = response.as(GetRequestIdPojo2.class);

        Assert.assertEquals(expecteData.getFirstname(), actualData.getFirstname());
        Assert.assertEquals(expecteData.getLastname(), actualData.getLastname());
        Assert.assertEquals(expecteData.getTotalprice(), actualData.getTotalprice());
        Assert.assertEquals(expecteData.isDepositpaid(), actualData.isDepositpaid());




    }



}
