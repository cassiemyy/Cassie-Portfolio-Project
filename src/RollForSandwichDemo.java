/**
 * Demonstration of the RollForSandwich.
 */
public final class RollForSandwichDemo {

    /**
     * Private constructor.
     */
    private RollForSandwichDemo() {
    }

    /**
     * Main method.
     *
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        RollForSandwich sandwich = new RollForSandwich1();

        sandwich.rollAll();
        System.out.println(sandwich.fullSandwich());
        System.out.println(sandwich.rateSandwich());

        sandwich.eatsWhole();
        System.out.println("After eating the sandwich:");
        System.out.println(sandwich.fullSandwich());
    }
}
