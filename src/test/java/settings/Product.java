package settings;

public class Product {

    final String baseUrl = "https://api.evotor.ru";

    final String startPathUrl = "/stores/";

    final String endPathUrl = "/products/";

    private String keyAutorization = "b3b26179-ccb4-4ade-a533-d9dc9700826b";

    public String getKeyAutorization (){
        return keyAutorization;
    }

    public void setKeyAurorization(String keyAutorization){
        this.keyAutorization = keyAutorization;
    }

    private String invalidAutorization = "b3bdfrde79-cfsfsb4-4sdde-a533-d9sfsfsf00826b";

    public String getInvalidAutorization (){
        return invalidAutorization;
    }

    public void setInvalidAutorization(String invalidAutorization){
        this.invalidAutorization = invalidAutorization;
    }

    private String storeId = "20191014-B61E-4026-8062-C72AD0FF63DF";

    public String getStoreId(){
        return storeId;
    }

    public void setStoreId(String storeId){
        this.storeId = storeId;
    }

    private String productId = "7fdd50b5-565f-4084-aa21-40ddea3f850c";

    public String getProductId(){
        return productId;
    }

    public void setProductId(String productId){
        this.productId = productId;
    }
}
