package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class JsonPlaceHolderUrl {

    protected RequestSpecification spec02;

    @Before
    public void setUp(){
        spec02 = new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com/").build();

    }

}
