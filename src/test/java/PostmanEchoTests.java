import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTests {

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = "https://postman-echo.com";
    }

    @Test
    public void testPostmanEchoGetRequest() {
        Response response = given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .extract()
                .response();

        printResponse(response);
    }

    @Test
    public void testPostmanEchoPostRawTextRequest() {
        String requestBody = "This is expected to be sent back as part of response body.";

        Response response = given()
                .contentType("text/plain")
                .body(requestBody)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo(requestBody))
                .extract()
                .response();

        printResponse(response);
    }

    @Test
    public void testPostmanEchoPostFormDataRequest() {
        Response response = given()
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"))
                .extract()
                .response();

        printResponse(response);
    }

    @Test
    public void testPostmanEchoPutRequest() {
        String requestBody = "This is expected to be sent back as part of response body.";

        Response response = given()
                .contentType("application/json")
                .body(requestBody)
                .when()
                .put("/put")
                .then()
                .statusCode(200)
                .body("data", equalTo(requestBody))
                .extract()
                .response();

        printResponse(response);
    }

    @Test
    public void testPostmanEchoPatchRequest() {
        String requestBody = "This is expected to be sent back as part of response body.";

        Response response = given()
                .contentType("application/json")
                .body(requestBody)
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .body("data", equalTo(requestBody))
                .extract()
                .response();

        printResponse(response);
    }

    @Test
    public void testPostmanEchoDeleteRequest() {
        Response response = given()
                .when()
                .delete("/delete")
                .then()
                .statusCode(200)
                .extract()
                .response();

        printResponse(response);
    }

    private void printResponse(Response response) {
        System.out.println("Response: " + response.asString());
    }
}