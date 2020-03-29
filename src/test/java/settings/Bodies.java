package settings;

public class Bodies {

    public static final String correctBody = "{\n" +
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

    public static final String bodyHasNotType = "{\n" +
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

    public static final String bodyHasNotTax = "{\n" +
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

    public static final String bodyInvalidType = "{\n" +
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

    public static final String bodyInvalidPrice = "{\n" +
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
}
