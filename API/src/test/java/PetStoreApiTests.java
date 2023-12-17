import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PetStoreApiTests {
    private static final String BASE_URI = "https://petstore.swagger.io/v2";

    @Test(priority = 1)
    public void createPet() {
            String requestBody = "{\n" +
                    "  \"id\": 855,\n" +
                    "  \"category\": {\n" +
                    "    \"id\": 856,\n" +
                    "    \"name\": \"Dog\"\n" +
                    "  },\n" +
                    "  \"name\": \"Bob\",\n" +
                    "  \"photoUrls\": [\n" +
                    "    \"string\"\n" +
                    "  ],\n" +
                    "  \"tags\": [\n" +
                    "    {\n" +
                    "      \"id\": 1,\n" +
                    "      \"name\": \"string\"\n" +
                    "    }\n" +
                    "  ],\n" +
                    "  \"status\": \"available\"\n" +
                    "}";

            given()
                    .when()
                    .contentType("application/json")
                    .body(requestBody)
                    .post(BASE_URI + "/pet")
                    .then()
                    .statusCode(200);
        }

    @Test(priority = 2)
    public void getPetById() {
        int petId = 855;
        Response response = RestAssured.get(BASE_URI + "/pet/" + petId);
        response.then().statusCode(200);
    }

    @Test(priority = 3)
    public void updatePet() {
        int petId = 855;

        String requestBody = "{\n" +
                "  \"id\": " + petId + ",\n" +
                "  \"category\": {\n" +
                "    \"id\": 856,\n" +
                "    \"name\": \"dog\"\n" +
                "  },\n" +
                "  \"name\": \"Sam\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";
        given()
                .when()
                .contentType("application/json")
                .body(requestBody)
                .post(BASE_URI + "/pet")
                .then()
                .statusCode(200);
    }

    @Test(priority = 4)
    public void deletePet() {
        int petId = 855;
        Response response = RestAssured.delete(BASE_URI + "/pet/" + petId);
        response.then().statusCode(200);
    }

    @Test(priority = 5)
    public void createPetWithoutBody() {
        String requestBody = "{\n" +  "  \"category\": [\n" +
                "}";

        given()
                .when()
                .contentType("application/json")
                .body(requestBody)
                .post(BASE_URI + "/pet")
                .then()
                .statusCode(405);
    }

    @Test(priority = 6)
    public void deleteNonexistingPet() {
        int petId = 855;

        Response response = RestAssured.delete(BASE_URI + "/pet/" + petId);
        response.then().statusCode(404);
    }

    @Test(priority = 7)
    public void getNonexistPetById() {
        int petId = 855;

        Response response = RestAssured.get(BASE_URI + "/pet/" + petId);
        response.then().statusCode(404);
    }

    @Test(priority = 8)
    public void updateNonexistPet() {
        int petId = 855;

        String requestBody = "{\n" +
                "  \"id\": " + petId + ",\n" +
                "  \"category\": {\n" +
                "    \"id\": 2,\n" +
                "    \"name\": \"Cat\"\n" +
                "  },\n" +
                "  \"name\": \"Sam\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";

        Response response = given()
                .contentType("application/json")
                .body(requestBody)
                .post(BASE_URI + "/pet" + petId);
        response.then().statusCode(404);
    }
}
