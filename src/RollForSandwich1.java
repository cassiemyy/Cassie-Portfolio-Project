import java.util.Random;

/**
 * Concrete implementation of RollForSandwich using the secondary class.
 *
 * @author Cassie Yuan
 *
 * @convention bread, protein, cheese, wildCard, sauce are not null. the empty
 *             string "" represents no selection for each component.
 *
 * @correspondence this.bread = bread, this.protein = protein, this.cheese =
 *                 cheese, this.wildCard = wildCard
 */
public class RollForSandwich1 extends RollForSandwichSecondary {

    /**
     * Representation fields.
     */

    /**
     * Bread choice.
     */
    private String bread;

    /**
     * Protein choice.
     */
    private String protein;

    /**
     * Cheese choice.
     */
    private String cheese;

    /**
     * Wild card choice.
     */
    private String wildCard;

    /**
     * Sauce choice.
     */
    private String sauce;

    /**
     * Random number generator used by rollCategory.
     */
    private final Random rand;

    /**
     * Private helper to initialize the representation fields.
     */
    private void createNewRep() {
        this.bread = "";
        this.protein = "";
        this.cheese = "";
        this.wildCard = "";
        this.sauce = "";
    }

    /**
     * Default constructor.
     *
     * @ensures this = new RollForSandwich1 with all components unselected
     */
    public RollForSandwich1() {
        this.rand = new Random();
        this.createNewRep();
    }

    /**
     * Kernel methods.
     */

    @Override
    public String rollCategory(String[] options) {
        assert options != null
                && options.length > 0 : "Violation of: options is not null and not empty";
        int index = this.rand.nextInt(options.length);
        return options[index];
    }

    /**
     * Clear the sandwich using the representation helper.
     */
    @Override
    public void eatsWhole() {
        this.createNewRep();
    }

    /**
     * A sandwich is complete if all parts are non-empty strings.
     *
     * @return true iff all components are not empty
     */
    @Override
    public boolean isComplete() {
        return !this.bread.equals("") && !this.protein.equals("")
                && !this.cheese.equals("") && !this.wildCard.equals("")
                && !this.sauce.equals("");
    }

    /**
     * Set bread choice.
     *
     * @param bread
     */
    @Override
    public void setBread(String bread) {
        assert bread != null : "Violation of: bread is not null";
        this.bread = bread;
    }

    /**
     * Get bread choice.
     *
     * @return bread
     */
    @Override
    public String getBread() {
        return this.bread;
    }

    /**
     * Set protein choice.
     *
     * @param protein
     */
    @Override
    public void setProtein(String protein) {
        assert protein != null : "Violation of: protein is not null";
        this.protein = protein;
    }

    /**
     * Get protein choice.
     *
     * @return protein
     */
    @Override
    public String getProtein() {
        return this.protein;
    }

    /**
     * Set cheese choice.
     *
     * @param cheese
     */
    @Override
    public void setCheese(String cheese) {
        assert cheese != null : "Violation of: cheese is not null";
        this.cheese = cheese;
    }

    /**
     * Get cheese choice.
     *
     * @return cheese
     */
    @Override
    public String getCheese() {
        return this.cheese;
    }

    /**
     * Set wild card choice.
     *
     * @param wildCard
     */
    @Override
    public void setWildCard(String wildCard) {
        assert wildCard != null : "Violation of: wildCard is not null";
        this.wildCard = wildCard;
    }

    /**
     * Get wild card choice.
     *
     * @return wildCard
     */
    @Override
    public String getWildCard() {
        return this.wildCard;
    }

    /**
     * Set sauce choice.
     *
     * @param sauce
     */
    @Override
    public void setSauce(String sauce) {
        assert sauce != null : "Violation of: sauce is not null";
        this.sauce = sauce;
    }

    /**
     * Get sauce choice.
     *
     * @return sauce
     */
    @Override
    public String getSauce() {
        return this.sauce;
    }

    //standard methods

    /**
     * Clear the sandwich.
     */
    @Override
    public void clear() {
        this.createNewRep();
    }

    /**
     * Make a new instance of RollForSandwich1.
     *
     * @return new RollForSandwich1
     */
    @Override
    public RollForSandwich newInstance() {
        return new RollForSandwich1();
    }

    /**
     * Transfer from source to this.
     *
     * @param source
     */
    @Override
    public void transferFrom(RollForSandwich source) {
        assert source != null : "Violation of: source is not null";
        assert source != this : "Violation of: source is not this";
        assert source instanceof RollForSandwich1 : ""
                + "Violation of: source is of dynamic type RollForSandwich1";

        RollForSandwich1 localSource = (RollForSandwich1) source;

        this.bread = localSource.bread;
        this.protein = localSource.protein;
        this.cheese = localSource.cheese;
        this.wildCard = localSource.wildCard;
        this.sauce = localSource.sauce;

        localSource.createNewRep();

    }
}
