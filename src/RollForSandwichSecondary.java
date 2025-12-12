import java.util.Objects;
import java.util.Random;

/**
 * Abstract secondary for RollForSandwich. Implements secondary methods using
 * only the kernel operations.
 *
 * @author Cassie Yuan
 */
public abstract class RollForSandwichSecondary implements RollForSandwich {

    // option lists for all categories

    /**
     * Bread options.
     */
    private static final String[] BREAD_OPTIONS = { "Focaccia", "Sourdough",
            "Brioche", "Naan" };

    /**
     * Protein options.
     */
    private static final String[] PROTEIN_OPTIONS = { "Dino nuggets", "Turkey",
            "Tuna", "Pepperoni" };

    /**
     * Cheese options.
     */
    private static final String[] CHEESE_OPTIONS = { "Cheese curds",
            "Provolone", "Brie", "Cheddar" };

    /**
     * Wild card options.
     */
    private static final String[] WILD_OPTIONS = { "Cauliflower", "Doritos",
            "Fries", "Pickles" };

    /**
     * Sauce options.
     */
    private static final String[] SAUCE_OPTIONS = { "Chili oil", "Mayo",
            "Ranch", "Hot honey" };

    /**
     * Rolls all components by using the kernel's rollCategory and setters. Uses
     * kernel methods to mutate the component.
     */
    @Override
    public void rollAll() {
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
     * Return a description built using kernel getters.
     */
    @Override
    public String fullSandwich() {
        String b = this.getBread();
        String p = this.getProtein();
        String c = this.getCheese();
        String w = this.getWildCard();
        String s = this.getSauce();

        String description = "Your sandwich has " + b + " bread, " + p
                + " protein, " + c + " cheese, " + w + " as a wild card, and "
                + s + " sauce.";
        return description;
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

        final int maxRating = 10;
        final int eight = 8;
        final int six = 6;
        final int four = 4;

        Random rand = new Random();
        int rating = rand.nextInt(maxRating) + 1;

        String comment;
        if (rating >= eight) {
            comment = "Perfect! So yummy and buss.";
        } else if (rating >= six) {
            comment = "Pretty good.";
        } else if (rating >= four) {
            comment = "Mid.";
        } else {
            comment = "Not great.";
        }
        return "Rating: " + rating + "/10: " + comment;
    }

    /**
     * toString implemented via fullSandwich().
     */
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
        if (this == obj) {
            return true;
        }
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

    /**
     * HashCode implemented via kernel getters.
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.getBread(), this.getProtein(),
                this.getCheese(), this.getWildCard(), this.getSauce());
    }
}
