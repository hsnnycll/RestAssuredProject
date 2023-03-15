package files;

public class Payload {

    public static String addPlace() {
        return "{\n" +
                "  \"location\": {\n" +
                "    \"lat\": 30.383494,\n" +
                "    \"lng\": 43.427362\n" +
                "  },\n" +
                "  \"accuracy\": 50,\n" +
                "  \"name\": \"Hsn Ycl\",\n" +
                "  \"phone_number\": \"(+90) 558 893 39 37\",\n" +
                "  \"address\": \"29, side layout, cohen 09\",\n" +
                "  \"types\": [\n" +
                "    \"shoe park\",\n" +
                "    \"shop\"\n" +
                "  ],\n" +
                "  \"website\": \"https://hsnnycll.com\",\n" +
                "  \"language\": \"French-IN\"\n" +
                "}";
    }

    public static String coursePrice() {
        return "{\n" +
                "\"dashboard\": {\n" +
                "\"purchaseAmount\": 910,\n" +
                "\"website\": \"rahulshettyacademy.com\"\n" +
                "},\n" +
                "\"courses\": [\n" +
                "{\n" +
                "\"title\": \"Selenium Python\",\n" +
                "\"price\": 50,\n" +
                "\"copies\": 6\n" +
                "},\n" +
                "{\n" +
                "\"title\": \"Cypress\",\n" +
                "\"price\": 40,\n" +
                "\"copies\": 4\n" +
                "},\n" +
                "{\n" +
                "\"title\": \"RPA\",\n" +
                "\"price\": 45,\n" +
                "\"copies\": 10\n" +
                "}\n" +
                "]\n" +
                "}";
    }

    public static String addBook(String isbn, String aisle){
        return "{\n" +
                "\"name\":\"Learn Appium Automation Java Language\",\n" +
                "\"isbn\":\"" + isbn + "\",\n" +
                "\"aisle\":\"" + aisle + "\",\n" +
                "\"author\":\"John foee\"\n" +
                "}";
    }
}
