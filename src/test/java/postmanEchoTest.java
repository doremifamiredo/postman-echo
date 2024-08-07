import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

class postmanEchoTest {
    @Test
    void test() {
        var text = "Hi";
        given()
                .baseUri ("https://postman-echo.com")
                .body(text)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Hi!"))
                ;
    }
}
