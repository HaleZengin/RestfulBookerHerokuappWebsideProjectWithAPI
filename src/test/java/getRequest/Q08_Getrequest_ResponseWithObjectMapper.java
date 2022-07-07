package getRequest;

import baseUrl.RestfulBookerHerokuappUrl;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import utilities.JsonUtil;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Q08_Getrequest_ResponseWithObjectMapper extends RestfulBookerHerokuappUrl {

    // Q03' teki sorguyu Object Mapper ile dogrulayin

    @Test
    public void test() {

        spec01.pathParam("bir", "25");

        String jsonData = "{\n" +
                "    \"firstname\": \"Emilie\",\n" +
                "    \"lastname\": \"Kristensen\",\n" +
                "    \"totalprice\": 593,\n" +
                "    \"depositpaid\": true,\n" +
                "    \"bookingdates\": {\n" +
                "        \"checkin\": \"2022-07-06\",\n" +
                "        \"checkout\": \"2022-07-13\"\n" +
                "    },\n" +
                "    \"additionalneeds\": \"Newspaper\"\n" +
                "}";


        // Json formadindaki datalarimizi Hashmap' e cevirelim

        HashMap<String, Object> expectedData = JsonUtil.convertJsonToJava(jsonData, HashMap.class);

        Response response = given().spec(spec01).when().get("/{bir}");

        // actual datayi Hashmap'e cevirelim

        HashMap<String, Object> actualData = JsonUtil.convertJsonToJava(response.asString(), HashMap.class);

        Assert.assertEquals(expectedData.get("firstname"), actualData.get("firstname"));
        Assert.assertEquals(expectedData.get("lastname"), actualData.get("lastname"));
        Assert.assertEquals(expectedData.get("totalprice"), actualData.get("totalprice"));
        Assert.assertEquals(expectedData.get("depositpaid"), actualData.get("depositpaid"));
        Assert.assertEquals(((Map)expectedData.get("bookingdates")).get("checkin"), ((Map)actualData.get("bookingdates")).get("checkin"));
        Assert.assertEquals(((Map)expectedData.get("bookingdates")).get("checkout"), ((Map)actualData.get("bookingdates")).get("checkout"));
        Assert.assertEquals(expectedData.get("additionalneeds"), actualData.get("additionalneeds"));

    }
}
