public class CarClient{
  public static void main (String[] args){
    Car myCar1 = new Car("Toyota", "Prius", 30, 18);
    Car myCar2 = new Car("Ford", "Expedition", 20, 30);
    Car myCar3 = new Car("Peugeot", "407", 25, 20);

    System.out.println(myCar1);
    myCar1.drive(100);
    System.out.println("new stats after driving hunned miles\n" + myCar1);

    System.out.println("\n" + myCar2);
    myCar2.drive(80);
    myCar2.addFuel(0.70);
    System.out.println("new stats after driving ate-tea miles and then getting gas\n" + myCar2);

    System.out.println("\n" + myCar3);
    myCar3.drive(400);
    System.out.println("new stats after driving 400 miles\n" + myCar3);

  }
}
