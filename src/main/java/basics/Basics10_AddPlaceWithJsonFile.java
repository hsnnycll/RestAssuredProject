package basics;

import io.restassured.RestAssured;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

public class Basics10_AddPlaceWithJsonFile {
    public static void main(String[] args) throws IOException {

        RestAssured.baseURI = "https://rahulshettyacademy.com";
        given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
                .body(new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir") + "/src/main/java/files/AddPlace.json"))))
                .when().post("maps/api/place/add/json")
                .then().log().all().assertThat().statusCode(200);
    }
}
