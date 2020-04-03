package settings;

public class Bodies {

    private final String correctBody = "{\n" +
            "\"type\": \"NORMAL\",\n" +
            "\"name\": \"pig\",\n" +
            "\"code\": \"5166409114\",\n" +
            "\"price\": 5601.74,\n" +
            "\"cost_price\": 3530.38,\n" +
            "\"quantity\": 357.553,\n" +
            "\"measure_name\": \"шт\",\n" +
            "\"tax\": \"VAT_10_110\",\n" +
            "\"allow_to_sell\": true,\n" +
            "\"description\": \"Description\",\n" +
            "\"article_number\": \"Article\"\n" +
            "}";

    public String getCorrectBody(){
        return correctBody;
    }

    private final String bodyHasNotType = "{\n" +
            "\"name\": \"pig\",\n" +
            "\"code\": \"5166409114\",\n" +
            "\"price\": 5601.74,\n" +
            "\"cost_price\": 3530.38,\n" +
            "\"quantity\": 357.553,\n" +
            "\"measure_name\": \"шт\",\n" +
            "\"tax\": \"VAT_10_110\",\n" +
            "\"allow_to_sell\": true,\n" +
            "\"description\": \"Описание\",\n" +
            "\"article_number\": \"валидное\"\n" +
            "}";

    public String getBodyHasNotType(){
        return bodyHasNotType;
    }

    private final String bodyHasNotTax = "{\n" +
            "\"type\": \"NORMAL\",\n" +
            "\"name\": \"pig\",\n" +
            "\"code\": \"5166409114\",\n" +
            "\"price\": 5601.74,\n" +
            "\"cost_price\": 3530.38,\n" +
            "\"quantity\": 357.553,\n" +
            "\"measure_name\": \"шт\",\n" +
            "\"allow_to_sell\": true,\n" +
            "\"description\": \"Описание\",\n" +
            "\"article_number\": \"валидное\"\n" +
            "}";

    public String getBodyHasNotTax(){
        return bodyHasNotTax;
    }

    private final String bodyInvalidType = "{\n" +
            "\"type\": \"NORMAS\",\n" +
            "\"name\": \"pig\",\n" +
            "\"code\": \"5166409114\",\n" +
            "\"price\": 5601.74,\n" +
            "\"cost_price\": 3530.38,\n" +
            "\"quantity\": 357.553,\n" +
            "\"measure_name\": \"шт\",\n" +
            "\"tax\": \"VAT_10_110\",\n" +
            "\"allow_to_sell\": true,\n" +
            "\"description\": \"Описание\",\n" +
            "\"article_number\": \"валидное\"\n" +
            "}";

    public String getBodyInvalidType(){
        return bodyInvalidType;
    }

    private final String bodyInvalidPrice = "{\n" +
            "\"type\": \"NORMAL\",\n" +
            "\"name\": \"pig\",\n" +
            "\"code\": \"5166409114\",\n" +
            "\"price\": \"сто\",\n" +
            "\"cost_price\": 3530.38,\n" +
            "\"quantity\": 357.553,\n" +
            "\"measure_name\": \"шт\",\n" +
            "\"tax\": \"VAT_10_110\",\n" +
            "\"allow_to_sell\": true,\n" +
            "\"description\": \"Описание\",\n" +
            "\"article_number\": \"валидное\"\n" +
            "}";

    public String getBodyInvalidPrice(){
        return bodyInvalidPrice;
    }
}
