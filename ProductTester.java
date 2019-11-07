public class ProductTester {
    public static void main(String[] args) {
        Product Product1 = new Product("Lipstick", 200.00);
        Product Product2 = new Product("Rouge", 145.00);

        System.out.println("Initial price of lipstsick: " + Product1.getPrice());
        System.out.println("Initial price of rouge: " + Product2.getPrice());

        Product1.reducePrice(0.85);
        Product2.reducePrice(0.85);

        System.out.println("The final price of lipstick: " + Product1.getPrice());
        System.out.println("The final price of rouge: " + Product2.getPrice());



    }
}
