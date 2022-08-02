package getRequest;

import baseUrl.RestfulBookerHerokuappUrl;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import pojos.GetrequestBookingdatesPojo;
import pojos.GetrequestIdPojo;

import static io.restassured.RestAssured.given;

public class Q09_GetRequest_ResponseWithPojo extends RestfulBookerHerokuappUrl {

    // Q03' teki sorguyu pojo class kullanarak dogrulayin

    @Test
    public void test() {

        spec01.pathParam("bir", "25");

        GetrequestBookingdatesPojo bookingdatesPojo = new GetrequestBookingdatesPojo("2022-07-06", "2022-07-13");

        GetrequestIdPojo expectedPojo = new GetrequestIdPojo("Emilie", "Kristensen", 593, true, bookingdatesPojo, "Newspaper");

        Response response = given().spec(spec01).when().get("/{bir}");

        GetrequestIdPojo actualData = response.as(GetrequestIdPojo.class);

        Assert.assertEquals(expectedPojo.getFirstname(), actualData.getFirstname());
        Assert.assertEquals(expectedPojo.getLastname(), actualData.getLastname());
        Assert.assertEquals(expectedPojo.getTotalprice(), actualData.getTotalprice());
        Assert.assertEquals(expectedPojo.isDepositpaid(), actualData.isDepositpaid());
        Assert.assertEquals(expectedPojo.getBookingdates().getCheckin(), actualData.getBookingdates().getCheckin());
        Assert.assertEquals(expectedPojo.getBookingdates().getCheckout(), actualData.getBookingdates().getCheckout());
        Assert.assertEquals(expectedPojo.getAdditionalneeds(), actualData.getAdditionalneeds());

    }

}
