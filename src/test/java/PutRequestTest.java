import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PutRequestTest extends TestPostmanEchoBase {
    @Test
    public void testPutRequest() {
        System.out.println("--- Начало testPutRequest ---");

        given()
                .log().all()
                .contentType("application/json")
                .body("{\"text\":\"Random text\"}")
                .when()
                .put("/put")
                .then()
                .log().status()
                .log().ifError()
                .log().ifValidationFails()
                .statusCode(200)
                .body("data.text", equalTo("Random text"))
                .body("json.text", equalTo("Random text"))
                .body("url", containsString("/put"));

        System.out.println("--- Конец testPutRequest ---");
        System.out.println(" ");
    }
}
