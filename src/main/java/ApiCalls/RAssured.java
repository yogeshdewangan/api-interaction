package ApiCalls;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class RAssured {

    public Response rGet(String apiUrl){
        return given().
                when().get(apiUrl);
    }


}
