package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class RestfulBookerHerokuappUrl {

    protected RequestSpecification spec01;

    @Before
    public void setUp(){
        spec01 = new RequestSpecBuilder().setBaseUri("https://restful-booker.herokuapp.com/booking").build();

    }

}
