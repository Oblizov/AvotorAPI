package test_suite;

import org.junit.Test;
import settings.MethodsSettings;

import static settings.Bodies.*;

public class TestProduct {

    MethodsSettings post;
    MethodsSettings get;

    @Test
    public void _1_1_createProductTest(){

        post = new MethodsSettings();

        post.correctCreateProduct();
    }

    @Test
    public void _2_1_getProductTest() {

        get = new MethodsSettings();

        get.correctGetProduct();
    }

    @Test
    public void _3_1_postHasNotTypeTest(){

        post = new MethodsSettings();

        String fieldCheck = "type";

        post.hasNotRequiredField(bodyHasNotType, fieldCheck);
    }

    @Test
    public void _3_2_postHasNotTaxTest(){

        post = new MethodsSettings();

        String fieldCheck = "tax";

        post.hasNotRequiredField(bodyHasNotTax, fieldCheck);
    }

    @Test
    public void _4_1_incorrectFieldTypeTest(){

        post = new MethodsSettings();

        String fieldType = "type";

        post.incorrectFieldCreateProduct(bodyInvalidType, fieldType);
    }

    @Test
    public void _4_2_incorrectFieldPriceTest(){

        post = new MethodsSettings();

        String fieldType = "price";

        post.incorrectFieldCreateProduct(bodyInvalidPrice, fieldType);
    }

    @Test
    public void _5_1_invalidAuthorizationCreateTest(){

        post = new MethodsSettings();

        post.invalidAuthorizationCreateProduct("ff424gfd5v");
    }

    @Test
    public void _5_2_invalidAuthorizationGetTest(){

        get = new MethodsSettings();

        get.invalidAuthorizationGetProduct("gfdgfd32aa44ag");
    }

    @Test
    public void _6_1_invalidStoreIdCreateProductTest(){

        post = new MethodsSettings();

        post.invalidStoreIdPostProduct("201fsd014-B61E-4026-8062-C72AfsF63DF");
    }

    @Test
    public void _6_2_invalidProductIdGetProductTest(){

        get = new MethodsSettings();

        get.invalidProductIdOrStoreIdGetProduct
                ("20191014-B61E-4026-8062-C72AD0FF63DF", "7ffgf0b5-565f-4084-aa21-40dffda");
    }
}
