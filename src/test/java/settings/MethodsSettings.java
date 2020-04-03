package settings;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.hasKey;

public class MethodsSettings {

    Product product;

    public void correctCreateProduct(String bodyQwery){

        product = new Product();

        given()
                .baseUri(product.baseUrl)
                .basePath(product.startPathUrl + product.getStoreId() + product.endPathUrl)
                .contentType("application/vnd.evotor.v2+json; charset=UTF-8")
                .header("x-authorization", product.getKeyAutorization())
                .header("accept", "application/vnd.evotor.v2+json")
                .body(bodyQwery)
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
                .body("store_id", equalTo(product.getStoreId()))
                .body("$", hasKey("id"))
                .body("$", hasKey("user_id"))
                .body("$", hasKey("created_at"))
                .body("$", hasKey("updated_at"));
    }

    public void correctGetProduct(){

        product = new Product();

        given()
                .baseUri(product.baseUrl)
                .basePath(product.startPathUrl + product.getStoreId() + product.endPathUrl + product.getProductId())
                .contentType("application/json; charset=UTF-8")
                .header("x-authorization", product.getKeyAutorization())
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
                .body("id", equalTo(product.getProductId()))
                .body("store_id", equalTo(product.getStoreId()))
                .body("$", hasKey("user_id"))
                .body("$", hasKey("created_at"))
                .body("$", hasKey("updated_at"));
    }

    public void hasNotRequiredField(String bodyQwery, String hasNotField){

        product = new Product();

        given()
                .baseUri(product.baseUrl)
                .basePath(product.startPathUrl + product.getStoreId() + product.endPathUrl)
                .contentType("application/vnd.evotor.v2+json; charset=UTF-8")
                .header("x-authorization", product.getKeyAutorization())
                .header("accept", "application/vnd.evotor.v2+json")
                .body(bodyQwery)
                .when()
                .post()
                .then()
                .statusCode(400)
                .body("violations.reason[0]", equalTo("must not be null"))
                .body("violations.subject[0]", equalTo(hasNotField));
    }

    public void incorrectFieldCreateProduct(String bodyQwery, String checkField){

        product = new Product();

        given()
                .baseUri(product.baseUrl)
                .basePath(product.startPathUrl + product.getStoreId() + product.endPathUrl)
                .contentType("application/vnd.evotor.v2+json; charset=UTF-8")
                .header("x-authorization", product.getKeyAutorization())
                .header("accept", "application/vnd.evotor.v2+json")
                .body(bodyQwery)
                .when()
                .post()
                .then()
                .statusCode(400)
                .body("message", equalTo("invalid value format for field"))
                .body("violations.subject[0]", equalTo(checkField));
    }

    public void invalidAuthorizationCreateProduct(String bodyQwery){

        product = new Product();

        given()
                .baseUri(product.baseUrl)
                .basePath(product.startPathUrl + product.getStoreId() + product.endPathUrl)
                .contentType("application/vnd.evotor.v2+json; charset=UTF-8")
                .header("x-authorization", product.getInvalidAutorization())
                .header("accept", "application/vnd.evotor.v2+json")
                .body(bodyQwery)
                .when()
                .post()
                .then()
                .statusCode(401);
    }

    public void invalidAuthorizationGetProduct(){

        product = new Product();

        given()
                .baseUri(product.baseUrl)
                .basePath(product.startPathUrl + product.getStoreId() + product.endPathUrl + product.getProductId())
                .contentType("application/json; charset=UTF-8")
                .header("x-authorization", product.getInvalidAutorization())
                .header("accept", "application/vnd.evotor.v2+json;charset=UTF-8")
                .when()
                .get()
                .then()
                .statusCode(401);
    }

    public void invalidProductIdOrStoreIdGetProduct(String storeId, String productId){

        product = new Product();

        given()
                .baseUri(product.baseUrl)
                .basePath(product.startPathUrl + storeId + product.endPathUrl + productId)
                .contentType("application/json; charset=UTF-8")
                .header("x-authorization", product.getKeyAutorization())
                .header("accept", "application/vnd.evotor.v2+json;charset=UTF-8")
                .when()
                .get()
                .then()
                .statusCode(404);
    }

    public void invalidStoreIdPostProduct(String storeId, String bodyQwery){

        product = new Product();

        given()
                .baseUri(product.baseUrl)
                .basePath(product.startPathUrl + storeId + product.endPathUrl)
                .contentType("application/vnd.evotor.v2+json; charset=UTF-8")
                .header("x-authorization", product.getKeyAutorization())
                .header("accept", "application/vnd.evotor.v2+json")
                .body(bodyQwery)
                .when()
                .post()
                .then()
                .statusCode(404);
    }
}
