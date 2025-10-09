import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Test RollForSandwich.
 */
public final class RollForSandwichMain {
    /**
     * Private constructor.
     */
    private RollForSandwichMain() {
    }

    /**
     * Main method to test.
     *
     * @param args
     *            arguments.
     */
    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();

        RollForSandwich sandwich = new RollForSandwich();

        out.println("Building your sandwich now...");
        //test the roll all for the different sandwich components
        sandwich.rollAll();
        out.println(sandwich.fullSandwich());

        //test rate sandwich
        out.println(sandwich.rateSandwich());

        out.println("Do better. Emptying your sandwich...");

        //test reset
        sandwich.reset();
        out.println("Sandwich is reset and empty.");

        //check if sandwich is complete
        out.println("Is sandwich complete?: " + sandwich.isComplete());

        out.println("Building you a new sandwich...");
        sandwich.rollAll();
        out.println(sandwich.fullSandwich());
        out.println("Is sandwich complete?: " + sandwich.isComplete());

        // close streams
        in.close();
        out.close();
    }
}
