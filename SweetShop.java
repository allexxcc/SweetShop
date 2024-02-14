
// Singleton шаблон
public class SweetShop {

        private static SweetShop instance;
        private int servingCounter;

        private SweetShop() {
            servingCounter = 0;
        }

        public static SweetShop getInstance() {
            if (instance == null) {
                instance = new SweetShop();
            }
            return instance;
        }

        public void serveIcecream(IceCream iceCream) {
            servingCounter++;
            System.out.println("Serving ice cream: " + iceCream.getDescription());
        }

        public int getServingCounter() {
            return servingCounter;
        }
    }

