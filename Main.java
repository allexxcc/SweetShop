import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Инициализация на сладкарницата
        SweetShop shop = SweetShop.getInstance();

        // Приготвяне и сервиране на сладоледи
        List<String> flavors = new ArrayList<>();
        flavors.add("cream");
        flavors.add("chocolate");
        flavors.add("fruit");

        for (String flavor : flavors) {
            IceCream iceCream = IceCreamFactory.createIceCream(flavor);
            shop.serveIcecream(iceCream);
        }

        System.out.println("Total ice creams served: " + shop.getServingCounter());
    }
}