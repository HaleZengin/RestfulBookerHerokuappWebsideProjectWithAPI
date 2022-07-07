package getRequest;

import baseUrl.RestfulBookerHerokuappUrl;
import com.google.gson.Gson;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Q07_GetRequest_ResponseWithSerialization extends RestfulBookerHerokuappUrl {

    // Q03' teki sorguyu Serialization ile dogrulayin

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


        //hashmap' teki datalari json formatina cevirelim
        Gson gson = new Gson();
        String jsonFromJava = gson.toJson(expectedData);
        System.out.println(jsonFromJava);

        Response response = given().spec(spec01).when().get("/{bir}");

        response.prettyPrint();

    }
}
