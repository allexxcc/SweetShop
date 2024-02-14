// Factory шаблон
public class IceCreamFactory {
        public static IceCream createIceCream(String flavor) {
            switch (flavor) {
                case "cream":
                    return new CreamIceCream();
                case "chocolate":
                    return new ChocolateIceCream();
                case "fruit":
                    return new FruitIceCream();
                default:
                    return null;
            }
        }
    }


