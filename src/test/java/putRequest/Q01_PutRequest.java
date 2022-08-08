package putRequest;

import baseUrl.RestfulBookerHerokuappUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.PutRequestBookingdatesPojo;
import pojos.PutRequestPojo;

import static io.restassured.RestAssured.given;

public class Q01_PutRequest extends RestfulBookerHerokuappUrl {

    /*
    https://restful-booker.herokuapp.com/booking/1127 adresibdeki bilgileri asagidaki gibi degistirelim

    {
    "firstname" : "Hale",
    "lastname" : "Hale",
    "totalprice" : 1000,
    "depositpaid" : false,
    "bookingdates" : {
        "checkin" : "2022-08-18",
        "checkout" : "2022-08-20"
    },
    "additionalneeds" : "Breakfast"
}


    degisiklik yapmadan onceki veriler
    {
    "firstname": "Sally",
    "lastname": "Brown",
    "totalprice": 111,
    "depositpaid": true,
    "bookingdates": {
        "checkin": "2013-02-23",
        "checkout": "2014-10-23"
    },
    "additionalneeds": "Breakfast"
    }
     */

    @Test
    public void test(){

        spec01.pathParam("bir", "1127");

        PutRequestBookingdatesPojo bookingdatesPojo= new PutRequestBookingdatesPojo("2022-08-18", "2022-08-20");

        PutRequestPojo expectedData = new PutRequestPojo("Hale", "Hale", 1000, false, bookingdatesPojo, "Breakfast" );

        Response response = given()
                .spec(spec01)
                .contentType("application/json; charset=utf-8")
                .auth().basic("admin", "password123")
                .body(expectedData.toString())
                .when().put("/{bir}");

        response.prettyPeek();

    }






}
