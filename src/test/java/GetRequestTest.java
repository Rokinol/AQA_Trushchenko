import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetRequestTest extends TestPostmanEchoBase {
    @Test
    public void testGetRequestWithParameters() {
        System.out.println("--- Начало testGetRequestWithParameters ---");

        given()
                .log().all()
                .param("foo1", "bar1")
                .param("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .log().status()
                .log().ifError()
                .log().ifValidationFails()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("url", startsWith("https://postman-echo.com/get"));

        System.out.println("--- Конец testGetRequestWithParameters ---");
        System.out.println(" ");
    }

    @Test
    public void testGetRequestWithoutParameters() {
        System.out.println("--- Начало testGetRequestWithoutParameters ---");

        given()
                .log().all()
                .when()
                .get("https://postman-echo.com/get")
                .then()
                .log().status()
                .log().ifError()
                .log().ifValidationFails()
                .statusCode(200)
                .body("url", startsWith("https://postman-echo.com/get"));

        System.out.println("--- Конец testGetRequestWithoutParameters --- ");
        System.out.println(" ");
    }
}
