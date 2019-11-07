public class Product {
    private String object;
    private double price;

    public Product (String theObject, double thePrice){
        object = theObject;
        price = thePrice;
    }

    public double getPrice() {
        return price;
    }
    public void reducePrice(double r) {
        price = (double) (price * r);
    }
    public String toString(){
        String result = "Final price: " + price;
        return result;
    }
}
