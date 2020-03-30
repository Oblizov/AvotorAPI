package test_suite;

import org.junit.Test;
import settings.MethodsSettings;

import static settings.Bodies.*;

public class TestProduct {

    MethodsSettings post;
    MethodsSettings get;

    @Test
    public void post_1_1_CreateProductTest(){

        post = new MethodsSettings();

        post.correctCreateProduct();
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

        post.hasNotRequiredField(bodyHasNotType, fieldCheck);
    }

    @Test
    public void post_2_6_HasNotTaxTest(){

        post = new MethodsSettings();

        String fieldCheck = "tax";

        post.hasNotRequiredField(bodyHasNotTax, fieldCheck);
    }

    @Test
    public void post_3_1_IncorrectFieldTypeTest(){

        post = new MethodsSettings();

        String fieldType = "type";

        post.incorrectFieldCreateProduct(bodyInvalidType, fieldType);
    }

    @Test
    public void post_3_2_IncorrectFieldPriceTest(){

        post = new MethodsSettings();

        String fieldType = "price";

        post.incorrectFieldCreateProduct(bodyInvalidPrice, fieldType);
    }

    @Test
    public void post_4_3_InvalidAuthorizationCreateTest(){

        post = new MethodsSettings();

        post.invalidAuthorizationCreateProduct("ff424gfd5v");
    }

    @Test
    public void get_3_2_InvalidAuthorizationGetProductTest(){

        get = new MethodsSettings();

        get.invalidAuthorizationGetProduct("gfdgfd32aa44ag");
    }

    @Test
    public void post_5_1_InvalidStoreIdCreateProductTest(){

        post = new MethodsSettings();

        post.invalidStoreIdPostProduct("201fsd014-B61E-4026-8062-C72AfsF63DF");
    }

    @Test
    public void get_2_2_InvalidProductIdGetProductTest(){

        get = new MethodsSettings();

        get.invalidProductIdOrStoreIdGetProduct
                ("20191014-B61E-4026-8062-C72AD0FF63DF", "7ffgf0b5-565f-4084-aa21-40dffda");
    }
}
