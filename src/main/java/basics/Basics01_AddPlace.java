package basics;

import files.Payload;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Basics01_AddPlace {
    public static void main(String[] args) {

        //given - all input details
        //when - submit the API + resource, http method
        //then - validate the response

        RestAssured.baseURI = "https://rahulshettyacademy.com";
        given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
                .body(Payload.addPlace())
                .when().post("maps/api/place/add/json")
                .then().log().all().assertThat().statusCode(200);
    }
}
