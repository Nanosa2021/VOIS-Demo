package StepClasses;

import CommonClasses.Property;
import CommonClasses.RestAssuredHelper;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.util.*;

import static io.restassured.RestAssured.given;

/**
 * Common Steps class which invokes the RestAssuredHelper class and enables
 * rest api calls to be configured and invoked from cucumber features along
 * with detailed response validation.
 */
public class RestAssuredSteps {

    RequestSpecification request = given();
    Response response;


    public void resetRest() {
        request = given();
    }

    @Given("^a rest api \"(.*)\"$")
    public void setAPI(String api) {
        String envURI = Property.getProperty(api);
        RestAssuredHelper.setBaseURI(request, envURI);
    }

    @And("^total number of users should be (.*)$")
    public void getResponseBody(int numOfUsers){
        int size = RestAssuredHelper.getResponseSize(response);
        Assertions.assertEquals(numOfUsers,size);
    }

    @And("^retrieving All Users (.*) (.*)$")
    public void getAllUsers(String apiMethod , String path){
        //request.get(Property.getProperty("APIURL")+path).then().log()
        //    .all();
        response = RestAssuredHelper.callAPI(request, apiMethod, path);
        response.print();
    }

    @And("^retrieving Specific User (.*) (.*)$")
    public void getSpecificUserBody(String apiMethod , String path){
        response = RestAssuredHelper.callAPI(request, apiMethod, path);
        response.print();
    }

    @Then("^user Title should be (.*)$")
    public void userTitleShouldBe(String expectedTitle){
        //response = RestAssuredHelper
        String jsonResponseTitle= RestAssuredHelper.getTitle(response);
        //String jsonResponse = response.jsonPath().getString("title");
        Assertions.assertEquals(expectedTitle,jsonResponseTitle);
        System.out.println(jsonResponseTitle);
    }

    @Then("^user Body should be (.*)$")
    public void userBodyShouldBe(String expectedBody){
        //response = RestAssuredHelper
        String jsonResponseBody= RestAssuredHelper.getBody(response);
        System.out.println(jsonResponseBody);
        String expectedBodyNoLines=expectedBody.replace('\n',' ');
        String jsonResponseBodyNoLines=jsonResponseBody.replace('\n',' ');
        Assertions.assertEquals(expectedBodyNoLines,jsonResponseBodyNoLines);

    }

    @And("^create new user (.*) and (.*) and (.*)$")
    public void createNewUser(String userID , String title , String body){
        JSONObject requestParams = new JSONObject();
        requestParams.put("userId", userID);
        requestParams.put("title", title);
        requestParams.put("body", body);
        request.body(requestParams.toString());
        response = request.post("/posts");
        response.print();
        int statusCode = response.getStatusCode();
        System.out.println(statusCode);
        Assertions.assertEquals(201, statusCode);
    }
    @Given("^a header$")
    public void setHeader(Map<String, String> map) {
        map.forEach((key, val) -> {
            RestAssuredHelper.setHeader(request, key, val);
        });
    }

//    @And("^a request body \"(.*)\"$")
//    public void requestBody(String data) throws Exception {
//        String jsonData = RestAssuredHelper.createJson(data);
//        RestAssuredHelper.setBody(request, jsonData);
//    }

    @Then("^the response code is (\\d+)$")
    public void verify_status_code(int code) throws NumberFormatException, IOException {
        RestAssuredHelper.checkStatus(response, code);
    }
}