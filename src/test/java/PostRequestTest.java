import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostRequestTest extends TestPostmanEchoBase {
    @Test
    public void testPostRequest() {
        System.out.println("--- Начало testPostRequest ---");

       given()
               .log().all()
               .header("Content-Type", "application/json")
               .body("{\"name\":\"Nick\",\"age\":28}")
               .when()
               .post("/post")
               .then()
               .log().status()
               .log().ifError()
               .log().ifValidationFails()
               .statusCode(200)
               .body("data.name", equalTo("Nick"))
               .body("data.age", equalTo(28))
               .body("json.name", equalTo("Nick"))
               .body("json.age", equalTo(28))
               .body("headers.content-type", containsString("application/json"));

        System.out.println("--- Конец testPostRequest ---");
        System.out.println(" ");
    }
}
