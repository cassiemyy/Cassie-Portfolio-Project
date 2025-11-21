import java.util.Objects;
import java.util.Random;

/**
 * Abstract secondary for RollForSandwich. Implements secondary methods.
 */

public abstract class RollForSandwichSecondary implements RollForSandwich {

    /*
     * Option lists
     */
    private static final String[] BREAD_OPTIONS = { "Focaccia", "Sourdough",
            "Brioche", "Naan" };
    private static final String[] PROTEIN_OPTIONS = { "Dino nuggets", "Turkey",
            "Tuna", "Pepperoni" };
    private static final String[] CHEESE_OPTIONS = { "Cheese curds",
            "Provolone", "Brie", "Cheddar" };
    private static final String[] WILD_OPTIONS = { "Cauliflower", "Doritos",
            "Fries", "Pickles" };
    private static final String[] SAUCE_OPTIONS = { "Chili oil", "Mayo",
            "Ranch", "Hot honey" };

    /**
     * Rolls all components by using the kernel's rollCategory and setters. Uses
     * kernel methods only to mutate the component.
     */
    @Override
    public void rollAll() {
        // Use kernel rollCategory to pick, then use kernel setters to store
        String b = this.rollCategory(BREAD_OPTIONS);
        this.setBread(b);

        String p = this.rollCategory(PROTEIN_OPTIONS);
        this.setProtein(p);

        String c = this.rollCategory(CHEESE_OPTIONS);
        this.setCheese(c);

        String w = this.rollCategory(WILD_OPTIONS);
        this.setWildCard(w);

        String s = this.rollCategory(SAUCE_OPTIONS);
        this.setSauce(s);
    }

    /**
     * Return a human-readable description built using kernel getters.
     */
    @Override
    public String fullSandwich() {
        String b = this.getBread();
        String p = this.getProtein();
        String c = this.getCheese();
        String w = this.getWildCard();
        String s = this.getSauce();

    @Override
    public String toString() {
        return "Sandwich: " + partToString(b, "bread") + ", "
                + partToString(p, "protein") + ", " + partToString(c, "cheese")
                + ", " + partToString(w, "topping") + ", "
                + partToString(s, "sauce");
    }

    private String partToString(String part, String label) {
        return (part == null) ? "<no " + label + ">" : part + " " + label;
    }

    /**
     * Rate the sandwich randomly. Checks completeness using kernel's
     * isComplete().
     */
    @Override
    public String rateSandwich() {
        if (!this.isComplete()) {
            return "Finish building your sandwich!";
        }
        Random rand = new Random();
        int rating = rand.nextInt(10) + 1;
        String comment;
        if (rating >= 8) {
            comment = "Perfect! So yummy and buss.";
        } else if (rating >= 6) {
            comment = "Pretty good.";
        } else if (rating >= 4) {
            comment = "Mid.";
        } else {
            comment = "Not great.";
        }
        return "Rating: " + rating + "/10 — " + comment;
    }

    @Override
    public String toString() {
        return this.fullSandwich();
    }

    /**
     * Equals implemented via kernel getters (component-wise equality). Two
     * RollForSandwich are equal iff all five categories are equal (including
     * null).
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof RollForSandwich)) {
            return false;
        }
        RollForSandwich other = (RollForSandwich) obj;
        return Objects.equals(this.getBread(), other.getBread())
                && Objects.equals(this.getProtein(), other.getProtein())
                && Objects.equals(this.getCheese(), other.getCheese())
                && Objects.equals(this.getWildCard(), other.getWildCard())
                && Objects.equals(this.getSauce(), other.getSauce());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBread(), getProtein(), getCheese(),
                getWildCard(), getSauce());
    }
}