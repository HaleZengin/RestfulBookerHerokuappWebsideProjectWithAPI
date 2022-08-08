package postRequest;

import baseUrl.JsonPlaceHolderUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.PostRequest_jsonplaceholderPojo;

import static io.restassured.RestAssured.given;

public class Q03_PostRequestJsonPlaceHolder extends JsonPlaceHolderUrl {

     /*
    https://jsonplaceholder.typicode.com/todos url ‘ine bir request gönderildiğinde
    Request body
    {
    "userId": 1001,
    "id": 10001,
    "title": "a clean room",
    "completed": true
    }
    */

    @Test
    public void test(){

        spec02.pathParam("param", "todos");

        PostRequest_jsonplaceholderPojo jsonplaceholderPojo = new PostRequest_jsonplaceholderPojo(1001, 10001, "a clean room", true);

        Response response = given().contentType(ContentType.JSON).spec(spec02).body(jsonplaceholderPojo).when().post("{param}");

        response.prettyPeek();
    }

}
