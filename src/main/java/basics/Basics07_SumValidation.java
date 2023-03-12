package basics;

import files.Payload;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Basics07_SumValidation {

    @Test
    public void sumOfCourses(){
        JsonPath js = new JsonPath(Payload.coursePrice());

        int count = js.getInt("courses.size()");
        int sum = 0;
        for (int i = 0; i < count; i++) {
            String title = js.get("courses[" + i + "].title");
            int price = js.getInt("courses[" + i + "].price");
            int copies = js.getInt("courses[" + i + "].copies");
            int amount = price * copies;
            System.out.println(title + ": " + amount);
            sum = sum + amount;
        }
        System.out.println("Total : " + sum);
        int purchaseAmount = js.getInt("dashboard.purchaseAmount");
        Assert.assertEquals(sum, purchaseAmount);
    }
}
