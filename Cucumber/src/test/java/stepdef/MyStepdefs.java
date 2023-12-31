package stepdef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import java.util.List;
import java.util.Map;

public class MyStepdefs {

    private static final String BASE_URL = "https://petstore.swagger.io/v2";
    private String petData;
    private Response response;

    @Given("I have valid pet data")
    public void i_have_valid_pet_data(DataTable dataTable) {
        List<Map<String, String>> petDetailsList = dataTable.asMaps(String.class, String.class);

        Map<String, String> petDetails = petDetailsList.get(1);

        petData = String.format("{\"id\": %s, \"name\": \"%s\", \"status\": \"%s\"}",
                petDetails.get("id"), petDetails.get("name"), petDetails.get("status"));
    }

    @When("I send a POST request to the {string} endpoint")
    public void i_send_a_post_request_to_the_endpoint(String string) {
        response = RestAssured.given()
                .baseUri(BASE_URL)
                .contentType("application/json")
                .body(petData)
                .post(BASE_URL + "/pet");
    }

    @Then("the response status code should be {int}")
    public void the_response_status_code_should_be(Integer expectedStatusCode) {
        int actualStatusCode = response.getStatusCode();
        assert actualStatusCode == expectedStatusCode :
                "Expected status code: " + expectedStatusCode + ", but found: " + actualStatusCode;
    }

    @Given("there is an existing pet with ID {int}")
    public void thereIsAnExistingPetWithID(int petId) {
        Response response = RestAssured.get(BASE_URL + "/pet/" + petId);
    }

    @When("I send a GET request to the {string} endpoint")
    public void iSendAGETRequestToTheEndpoint(String s) {
        response = RestAssured.given()
                .baseUri(BASE_URL)
                .get(BASE_URL + "/pet/2");
    }

}
