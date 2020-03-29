package settings;

import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.hasKey;
import static settings.Bodies.correctBody;
import static settings.ParamSettings.*;
import static settings.ParamSettings.productId;

public class MethodsSettings {

    public void correctCreateProduct(){

        JsonPath responceJson = given()
                .baseUri(baseUrl)
                .basePath(pathUrl)
                .contentType("application/vnd.evotor.v2+json; charset=UTF-8")
                .header("x-authorization", keyAutorization)
                .header("accept", "application/vnd.evotor.v2+json")
                .body(correctBody)
                .when()
                .post()
                .then()
                .statusCode(200)
                .body("type", equalTo("NORMAL"))
                .body("name", equalTo("pig"))
                .body("code", equalTo("5166409114"))
                .body("price", equalTo(5601.74F))
                .body("cost_price", equalTo(3530.38F))
                .body("quantity", equalTo(357.553F))
                .body("measure_name", equalTo("шт"))
                .body("tax", equalTo("VAT_10_110"))
                .body("allow_to_sell", equalTo(true))
                .body("description", equalTo("Description"))
                .body("article_number", equalTo("Article"))
                .body("store_id", equalTo(storeId))
                .body("$", hasKey("id"))
                .body("$", hasKey("user_id"))
                .body("$", hasKey("created_at"))
                .body("$", hasKey("updated_at"))
                .extract()
                .jsonPath();

        productId = responceJson.getString("id");
    }

    public void correctGetProduct(){

        given()
                .baseUri(baseUrl)
                .basePath(pathUrl + productId)
                .contentType("application/json; charset=UTF-8")
                .header("x-authorization", keyAutorization)
                .header("accept", "application/vnd.evotor.v2+json;charset=UTF-8")
                .when()
                .get()
                .then()
                .statusCode(200)
                .body("type", equalTo("NORMAL"))
                .body("name", equalTo("pig"))
                .body("code", equalTo("5166409114"))
                .body("price", equalTo(5601.74F))
                .body("cost_price", equalTo(3530.38F))
                .body("quantity", equalTo(357.553F))
                .body("measure_name", equalTo("шт"))
                .body("tax", equalTo("VAT_10_110"))
                .body("allow_to_sell", equalTo(true))
                .body("description", equalTo("Description"))
                .body("article_number", equalTo("Article"))
                .body("id", equalTo(productId))
                .body("store_id", equalTo(storeId))
                .body("$", hasKey("user_id"))
                .body("$", hasKey("created_at"))
                .body("$", hasKey("updated_at"));
    }

    public void hasNotRequiredField(String bodyFields, String hasNotField){
        given()
                .baseUri(baseUrl)
                .basePath(pathUrl)
                .contentType("application/vnd.evotor.v2+json; charset=UTF-8")
                .header("x-authorization", keyAutorization)
                .header("accept", "application/vnd.evotor.v2+json")
                .body(bodyFields)
                .when()
                .post()
                .then()
                .statusCode(400)
                .body("violations.reason[0]", equalTo("must not be null"))
                .body("violations.subject[0]", equalTo(hasNotField));
    }

    public void incorrectFieldCreateProduct(String bodyFields, String checkField){
        given()
                .baseUri(baseUrl)
                .basePath(pathUrl)
                .contentType("application/vnd.evotor.v2+json; charset=UTF-8")
                .header("x-authorization", keyAutorization)
                .header("accept", "application/vnd.evotor.v2+json")
                .body(bodyFields)
                .when()
                .post()
                .then()
                .statusCode(400)
                .body("message", equalTo("invalid value format for field"))
                .body("violations.subject[0]", equalTo(checkField));
    }

    public void invalidAuthorizationCreateProduct(String invalidAuthotiz){
        given()
                .baseUri(baseUrl)
                .basePath(pathUrl)
                .contentType("application/vnd.evotor.v2+json; charset=UTF-8")
                .header("x-authorization", invalidAuthotiz)
                .header("accept", "application/vnd.evotor.v2+json")
                .body(correctBody)
                .when()
                .post()
                .then()
                .statusCode(401);
    }

    public void invalidAuthorizationGetProduct(String invalidAuthotiz){

        given()
                .baseUri(baseUrl)
                .basePath(pathUrl + productId)
                .contentType("application/json; charset=UTF-8")
                .header("x-authorization", invalidAuthotiz)
                .header("accept", "application/vnd.evotor.v2+json;charset=UTF-8")
                .when()
                .get()
                .then()
                .statusCode(401);
    }

    public void invalidProductIdOrStoreIdGetProduct(String store, String product){
        given()
                .baseUri(baseUrl)
                .basePath("/stores/" + store + "/products/" + product)
                .contentType("application/json; charset=UTF-8")
                .header("x-authorization", keyAutorization)
                .header("accept", "application/vnd.evotor.v2+json;charset=UTF-8")
                .when()
                .get()
                .then()
                .statusCode(404);
    }

    public void invalidStoreIdPostProduct(String store){
        given()
                .baseUri(baseUrl)
                .basePath("/stores/" + store + "/products/")
                .contentType("application/vnd.evotor.v2+json; charset=UTF-8")
                .header("x-authorization", keyAutorization)
                .header("accept", "application/vnd.evotor.v2+json")
                .body(correctBody)
                .when()
                .post()
                .then()
                .statusCode(404);
    }
}
