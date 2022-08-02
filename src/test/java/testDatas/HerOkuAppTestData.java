package testDatas;

import com.google.gson.JsonObject;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class HerOkuAppTestData {

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
     */

    public JSONObject setupTestAndRequest(){

        JSONObject bookingdates= new JSONObject();
        bookingdates.put("checkin", "2018-01-01");
        bookingdates.put("checkout", "2019-01-01");

        JSONObject expectedRequest=new JSONObject();
        expectedRequest.put("firstname", "Jim");
        expectedRequest.put("lastname", "Brown");
        expectedRequest.put("totalprice", 111);
        expectedRequest.put("depositpaid", true);
        expectedRequest.put("bookingdates", bookingdates);
        expectedRequest.put("additionalneeds", "Breakfast");

        return expectedRequest;

    }
}
