package apicalls;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class RAssured {

    public Response rGet(String apiUrl){
        return given().
                when().get(apiUrl);
    }

    public Response rPost(String apiUrl, String jsonData){

        return given().contentType(ContentType.JSON)
                .body(jsonData)
                .post(apiUrl);
    }


}
