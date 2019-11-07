public class DieTester {
    public static void main(String[] args) {
        Die die1 = new Die();
        Die die2 = new Die();

        System.out.println("This is a dice simulator");

        die1.roll();
        die2.roll();

        System.out.println("Die 1: " + die1.getFace());
        System.out.println("Die 2: " + die2.getFace());

    }
}
