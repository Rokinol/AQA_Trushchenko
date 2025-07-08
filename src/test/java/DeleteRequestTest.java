import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DeleteRequestTest extends TestPostmanEchoBase {
    @Test
    public void testDeleteRequest(){
        System.out.println("--- Начало testDeleteRequest ---");

        given()
                .log().all()
                .queryParam("id", "111")
                .when()
                .delete("/delete")
                .then()
                .log().status()
                .log().ifError()
                .log().ifValidationFails()
                .statusCode(200)
                .body("args.id", equalTo("111"))
                .body("url", containsString("/delete"));

        System.out.println("--- Конец testDeleteRequest ---");
        System.out.println(" ");
    }
}
