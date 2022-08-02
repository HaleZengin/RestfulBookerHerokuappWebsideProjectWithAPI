package postRequest;

import baseUrl.RestfulBookerHerokuappUrl;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import testDatas.HerOkuAppTestData;

import static io.restassured.RestAssured.given;

public class Q01_PostRequest_ResponseWithJsonObject extends RestfulBookerHerokuappUrl {

    /*
    {
    "firstname" : "Jim",
    "lastname" : "Brown",
    "totalprice" : 111,
    "depositpaid" : true,
    "bookingdates" : {
        "checkin" : "2018-01-01",
        "checkout" : "2019-01-01"
    },
    "additionalneeds" : "Breakfast"
    }
    gonderildiginde status code 200 mu ve bilgiler yukaridaki gibi mi dogrulayin
     */


    @Test
    public void test(){

        HerOkuAppTestData herOkuAppTestData = new HerOkuAppTestData();

        JSONObject expectedRequestData = herOkuAppTestData.setupTestAndRequest();

        Response response = given().
                contentType(ContentType.JSON).
                auth().basic("admin", "password123").
                spec(spec01).
                body(expectedRequestData.toString()).
                when().
                post();

        response.prettyPrint();

        // dogrulama
        JsonPath jsonPath = response.jsonPath();

        response.then().assertThat().statusCode(200);

        Assert.assertEquals(expectedRequestData.getString("firstname"), jsonPath.getString("booking.firstname"));
        Assert.assertEquals(expectedRequestData.getString("lastname"), jsonPath.getString("booking.lastname"));
        Assert.assertEquals(expectedRequestData.getInt("totalprice"), jsonPath.getInt("booking.totalprice"));
        Assert.assertEquals(expectedRequestData.getBoolean("depositpaid"), jsonPath.getBoolean("booking.depositpaid"));
        Assert.assertEquals(expectedRequestData.getJSONObject("bookingdates").getString("checkin"), jsonPath.getString("booking.bookingdates.checkin"));
        Assert.assertEquals(expectedRequestData.getJSONObject("bookingdates").getString("checkout"), jsonPath.getString("booking.bookingdates.checkout"));


    }

}
