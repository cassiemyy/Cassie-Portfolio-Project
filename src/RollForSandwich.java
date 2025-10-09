import java.util.Random;

/**
 * RollForSandwich randomly generates different components of a sandwich.
 */
public class RollForSandwich {
    //Filling options
    /**
     * Types of bread.
     */
    private String[] breadOptions = { "Focaccia", "Sourdough", "Brioche",
            "Naan" };
    /**
     * Types of protein.
     */
    private String[] proteinOptions = { "Dino nuggets", "Turkey", "Tuna",
            "Pepperoni" };
    /**
     * Types of cheese.
     */
    private String[] cheeseOptions = { "Cheese curds", "Provolone", "Brie",
            "Cheddar" };
    /**
     * Types of wild card options.
     */
    private String[] wildCardOptions = { "Cauliflower", "Doritos", "Fries",
            "Pickles" };
    /**
     * Types of sauces.
     */
    private String[] sauceOptions = { "Chili oil", "Mayo", "Ranch",
            "Hot honey" };

    /**
     * Bread.
     */
    private String bread;
    /**
     * Protein.
     */
    private String protein;
    /**
     * Cheese.
     */
    private String cheese;
    /**
     * Wild card.
     */
    private String wildCard;
    /**
     * Sauce.
     */
    private String sauce;
    /**
     * Random.
     */
    private Random rand;

    /**
     * Create constructor.
     */
    public RollForSandwich() {
        this.rand = new Random();
        this.reset();
    }

    /**
     * Randomly selects one option from the given array of choices.
     *
     * @param options
     *            is the array of strings that represent the different
     *            categories.
     * @return options of the categories
     */
    public String rollCategory(String[] options) {
        return options[this.rand.nextInt(options.length)];
    }

    /**
     * Clear all categories and sandwich is reset to empty state.
     */
    public void reset() {
        this.bread = null;
        this.protein = null;
        this.cheese = null;
        this.wildCard = null;
        this.sauce = null;
    }

    /**
     * Boolean for if the sandwich is complete or not.
     *
     * @return complete or not.
     */
    public boolean isComplete() {
        return this.bread != null && this.protein != null && this.cheese != null
                && this.wildCard != null && this.sauce != null;
    }

    /**
     * Roll all the options at once.
     */
    public void rollAll() {
        this.bread = this.rollCategory(this.breadOptions);
        this.protein = this.rollCategory(this.proteinOptions);
        this.cheese = this.rollCategory(this.cheeseOptions);
        this.wildCard = this.rollCategory(this.wildCardOptions);
        this.sauce = this.rollCategory(this.sauceOptions);
    }

    /**
     * Returns a string of the current sandwich.
     *
     * @return a string listing the bread, protein, cheese, topping, and sauce.
     */
    public String fullSandwich() {
        return "Sandwich: " + this.bread + " bread, " + this.protein
                + " protein, " + this.cheese + " cheese, " + this.wildCard
                + " topping, " + this.sauce + " sauce";
    }

    /**
     * Generate a random silly rating for the current sandwich.
     *
     * @return a string representing the sandwich rating and a brief remark
     */
    public String rateSandwich() {
        if (!this.isComplete()) {
            return "Finish building your sandwich!";
        }

        //rating from 1-10 so +1
        final int ten = 10;
        int rating = this.rand.nextInt(ten) + 1;
        String sillyComment;
        final int eight = 8;
        final int six = 6;
        final int four = 4;

        if (rating >= eight) {
            sillyComment = "Perfect! So yummy and buss.";
        } else if (rating >= six) {
            sillyComment = "Pretty good. I would give this a 6 or a 7.";
        } else if (rating >= four) {
            sillyComment = "Mid";
        } else {
            sillyComment = "Ew...you should not make sandwiches, time to get a j*b";
        }
        return "Rating: " + rating + "/10 " + sillyComment;
    }
}
