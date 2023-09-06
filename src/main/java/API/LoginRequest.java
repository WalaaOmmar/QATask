package API;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class LoginRequest {
    @Test
    public void testLogin() {
        // Base URL for the API
        RestAssured.baseURI = "https://pay2.foodics.dev/cp_internal";

        // Request body with username and password
        String requestBody = "{ " +
                "\"email\": \"merchant@foodics.com\"," +
                " \"password\": \"123456\" ," +
                " \"token\": \"Lyz22cfYKMetFhKQybx5HAmVimF1i0xO\"}";

        // Send the POST request to the login endpoint
        String token=RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/login")
                .then()
                .assertThat()
                .statusCode(200) // Assuming a successful login should return 200 status code
                .extract()
                .response().then().log().all().extract().jsonPath().getString("token");
    }

    @Test
    public void testLoginWithNoEmailSend() {
        // Base URL for the API
        RestAssured.baseURI = "https://pay2.foodics.dev/cp_internal";

        // Request body with username and password
        String requestBody = "{ " +
                " \"password\": \"123456\" ," +
                " \"token\": \"Lyz22cfYKMetFhKQybx5HAmVimF1i0xO\"}";

        // Send the POST request to the login endpoint
        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/login")
                .then()
                .assertThat()
                .statusCode(302) // Assuming a successful login should return 200 status code
                .extract()
                .response();
    }
    @Test
    public void testLoginWithNoPasswordSend() {
        // Base URL for the API
        RestAssured.baseURI = "https://pay2.foodics.dev/cp_internal";

        // Request body with username and password
        String requestBody = "{ " +
                "\"email\": \"merchant@foodics.com\"," +
                " \"token\": \"Lyz22cfYKMetFhKQybx5HAmVimF1i0xO\"}";

        // Send the POST request to the login endpoint
        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/login")
                .then()
                .assertThat()
                .statusCode(302) // Assuming a successful login should return 200 status code
                .extract()
                .response();
    }
}