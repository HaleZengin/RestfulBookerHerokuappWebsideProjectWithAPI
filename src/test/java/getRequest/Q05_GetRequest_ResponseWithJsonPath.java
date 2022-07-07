package getRequest;

import baseUrl.RestfulBookerHerokuappUrl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Q05_GetRequest_ResponseWithJsonPath extends RestfulBookerHerokuappUrl {

    // Q03' teki sorguyu Json Path ile dogrulayin

    @Test
    public void test() {

        spec01.pathParam("bir", "25");
        Response response = given().spec(spec01).when().get("/{bir}");

        JsonPath json = response.jsonPath();

        Assert.assertEquals("Emilie", json.getString("firstname"));
        Assert.assertEquals("Kristensen", json.getString("lastname"));
        Assert.assertEquals("593", json.getString("totalprice"));
        Assert.assertEquals("true", json.getString("depositpaid"));
        Assert.assertEquals("2022-07-06", json.getString("bookingdates.checkin"));
        Assert.assertEquals("2022-07-13", json.getString("bookingdates.checkout"));
        Assert.assertEquals("Newspaper", json.getString("additionalneeds"));




    }

}
