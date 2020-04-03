package test_suite;

import org.junit.Test;
import settings.Bodies;
import settings.MethodsSettings;
import settings.Product;

public class TestProduct {

    MethodsSettings post;
    MethodsSettings get;

    @Test
    public void post_1_1_CreateProductTest(){

        post = new MethodsSettings();

        Bodies body_1_1 = new Bodies();

        post.correctCreateProduct(body_1_1.getCorrectBody());
    }

    @Test
    public void get_2_1_GetProductTest() {

        get = new MethodsSettings();

        get.correctGetProduct();
    }

    @Test
    public void post_2_1_HasNotTypeTest(){

        post = new MethodsSettings();

        String fieldCheck = "type";

        Bodies body_2_1 = new Bodies();

        post.hasNotRequiredField(body_2_1.getBodyHasNotType(), fieldCheck);
    }

    @Test
    public void post_2_6_HasNotTaxTest(){

        post = new MethodsSettings();

        String fieldCheck = "tax";

        Bodies body_2_6 = new Bodies();

        post.hasNotRequiredField(body_2_6.getBodyHasNotTax(), fieldCheck);
    }

    @Test
    public void post_3_1_IncorrectFieldTypeTest(){

        post = new MethodsSettings();

        String fieldType = "type";

        Bodies body_3_1 = new Bodies();

        post.incorrectFieldCreateProduct(body_3_1.getBodyInvalidType(), fieldType);
    }

    @Test
    public void post_3_2_IncorrectFieldPriceTest(){

        post = new MethodsSettings();

        String fieldType = "price";

        Bodies body_3_2 = new Bodies();

        post.incorrectFieldCreateProduct(body_3_2.getBodyInvalidPrice(), fieldType);
    }

    @Test
    public void post_4_3_InvalidAuthorizationCreateTest(){

        post = new MethodsSettings();

        Bodies body_4_3 = new Bodies();

        post.invalidAuthorizationCreateProduct(body_4_3.getCorrectBody());
    }

    @Test
    public void get_3_2_InvalidAuthorizationGetProductTest(){

        get = new MethodsSettings();

        get.invalidAuthorizationGetProduct();
    }

    @Test
    public void post_5_1_InvalidStoreIdCreateProductTest(){

        Product product_5_1 = new Product();
        product_5_1.setStoreId("201fsd014-B61E-4026-8062-C72AfsF63DF");

        post = new MethodsSettings();

        Bodies body_5_1 = new Bodies();

        post.invalidStoreIdPostProduct(product_5_1.getStoreId(), body_5_1.getCorrectBody());
    }

    @Test
    public void get_2_2_InvalidProductIdGetProductTest(){

        Product product_2_2 = new Product();
        product_2_2.setProductId("7ffgf0b5-565f-4084-aa21-40dffda");

        get = new MethodsSettings();

        get.invalidProductIdOrStoreIdGetProduct
                (product_2_2.getStoreId(), product_2_2.getProductId());
    }
}
