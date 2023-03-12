package basics;

import files.Payload;
import io.restassured.path.json.JsonPath;

public class Basics06_ComplexJsonParse {
    public static void main(String[] args) {

        JsonPath js = new JsonPath(Payload.coursePrice());
        int count = js.getInt("courses.size()"); //Number of courses by API
        System.out.println(count);

        int totalAmount = js.getInt("dashboard.purchaseAmount"); //Get purchase amount
        System.out.println(totalAmount);

        String titleFirstCourse = js.get("courses[0].title"); //Title of first course
        System.out.println(titleFirstCourse);

        String titleSecondCourse = js.getString("courses[2].title"); //Title of second course
        System.out.println(titleSecondCourse);

        //Get all courses title and price
        for (int i = 0; i < count; i++) {
            String title = js.get("courses[" + i + "].title");
            int price = js.get("courses[" + i + "].price");
            System.out.println(title + " : " + price);
        }

        //Get number of copy any course
        for (int i = 0; i < count; i++) {
            String title = js.get("courses[" + i + "].title");
            if(title.equalsIgnoreCase("RPA")) {
                int copies = js.get("courses[" + i + "].copies");
                System.out.println(title + " copies : " + copies);
            }
        }
    }
}
