package getRequest;

import baseUrl.RestfulBookerHerokuappUrl;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Q06_GetRequest_ResponseWithDe_Serialization extends RestfulBookerHerokuappUrl {

    // Q03' teki sorguyu De-Serialization ile dogrulayin

    @Test
    public void test() {

        spec01.pathParam("bir", "25");

        // expected datalari bir Hashmap'e koyalim
        HashMap<String, Object> expectedData = new HashMap<>();
        expectedData.put("firstname", "Emilie");
        expectedData.put("lastname", "Kristensen");
        expectedData.put("totalprice", 593);
        expectedData.put("depositpaid", true);
        expectedData.put("additionalneeds", "Newspaper");
        // burada get("bookingdates")).get("checkin") yapilamiyor bunun icin bir ayri bir class yapip test data' si olusturulabilir ve casting yapilarak datalar okunur



        Response response = given().spec(spec01).when().get("/{bir}");
        // response.prettyPrint();

        // response' daki json formatindaki datalari bir Hashmap' in icine koyalim
        HashMap<String, Object> actualData = response.as(HashMap.class);

        Assert.assertEquals(expectedData.get("firstname"), actualData.get("firstname"));
        Assert.assertEquals(expectedData.get("lastname"), actualData.get("lastname"));
        Assert.assertEquals(expectedData.get("totalprice"), actualData.get("totalprice"));
        Assert.assertEquals(expectedData.get("depositpaid"), actualData.get("depositpaid"));
        Assert.assertEquals("2022-07-06", ((Map)actualData.get("bookingdates")).get("checkin"));    // casting yaptik
        Assert.assertEquals("2022-07-13", ((Map)actualData.get("bookingdates")).get("checkout"));
        Assert.assertEquals(expectedData.get("additionalneeds"), actualData.get("additionalneeds"));


    }
}
