import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PatchRequestTest extends TestPostmanEchoBase {
    @Test
    public void testPatchRequest() {
        System.out.println("--- Начало testPatchRequest ---");

        given()
                .log().all()
                .contentType("application/json")
                .body("{\"status\":\"updated\"}")
                .when()
                .patch("/patch")
                .then()
                .log().status()
                .log().ifError()
                .log().ifValidationFails()
                .statusCode(200)
                .body("data.status", equalTo("updated"))
                .body("json.status", equalTo("updated"));

        System.out.println("--- Конец testPatchRequest ---");
        System.out.println(" ");
    }
}
