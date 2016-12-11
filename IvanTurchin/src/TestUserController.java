import java.awt.*;
import java.util.ArrayList;

public class TestUserController {

    public static void main(String[] args) {

        System.out.println("testSendProductRequest() --> " + testSendProductRequest());
    }

    private static boolean testSendProductRequest() {

        DataBase db = new DataBase();
        UserController controller = new UserController(db);

        for (int i = 0; i < 10; i++) {
            controller.sendProductRequest(new Product());
        }

        for (int i = 0; i < 10; i++) {
            if (!db.getProductRequests.get(i).equals(new Product())) {
                return false;
            }
        }

        controller.sendProductRequest(null);

        ArrayList products = db.getProductRequests();
        return products.get(products.size() - 1) != null;
    }



    private static boolean whereIsMyProduct() {

        DataBase db = new DataBase();
        UserController controller = new UserController(db);

        controller.whereIsMyProduct();

        return false;
    }
}
