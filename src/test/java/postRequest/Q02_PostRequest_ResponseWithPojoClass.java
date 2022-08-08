package postRequest;

import baseUrl.RestfulBookerHerokuappUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import pojos.PostRequestBookingdatesPojo;
import pojos.PostRequestPojo;
import pojos.PostRequest_ResponsePojo;

import static io.restassured.RestAssured.given;

public class Q02_PostRequest_ResponseWithPojoClass extends RestfulBookerHerokuappUrl {

      /*
    {
    "firstname" : "Hale",
    "lastname" : "Hale",
    "totalprice" : 250,
    "depositpaid" : false,
    "bookingdates" : {
        "checkin" : "2022-08-28",
        "checkout" : "2022-09-03"
    },
    "additionalneeds" : "Breakfast"
    }
     */

    @Test
    public void test(){



    PostRequestBookingdatesPojo bookingdatesPojo= new PostRequestBookingdatesPojo("2022-08-28", "2022-09-03");

    PostRequestPojo expectedData = new PostRequestPojo("Hale", "Hale", 250, false, bookingdatesPojo, "Breakfast");

        Response response = given()
                .contentType(ContentType.JSON)
                .spec(spec01)
                .auth().basic("admin", "password123")
                .body(expectedData.toString())
                .when()
                .post();

        response.prettyPeek();
/*
        PostRequest_ResponsePojo actualData = response.as(PostRequest_ResponsePojo.class);

        Assert.assertEquals(expectedData.getFirstname(), actualData.getBooking().getFirstname());
        Assert.assertEquals(expectedData.getLastname(), actualData.getBooking().getLastname());
        Assert.assertEquals(expectedData.getTotalprice(), actualData.getBooking().getTotalprice());
        Assert.assertEquals(expectedData.isDepositpaid(), actualData.getBooking().isDepositpaid());
        Assert.assertEquals(expectedData.getBookingdatesPojo().getCheckin(), actualData.getBooking().getBookingdatesPojo().getCheckin());
        Assert.assertEquals(expectedData.getBookingdatesPojo().getCheckout(), actualData.getBooking().getBookingdatesPojo().getCheckout());
        Assert.assertEquals(expectedData.getAdditionalneeds(), actualData.getBooking().getAdditionalneeds());
*/





    }

}
