import components.standard.Standard;

/**
 * RollForSandwichKernel defines the behaviors in order to generate and reset a
 * sandwich using random components.
 *
 * @author Cassie Yuan
 * @ensures The sandwich can be built with all ingredients, cleared of all
 *          ingredients, and checked for completeness (all topping categories
 *          are filled).
 */
public interface RollForSandwichKernel extends Standard<RollForSandwich> {

    /**
     * Randomly "rolls" (selects) one choice from a given array of options.
     *
     * @param options
     *            the array of available food toppings
     * @return the randomly selected choice
     * @ensures rollCategory = [one random element from options]
     */

    String rollCategory(String[] options);

    /**
     * Clears components of the sandwich to empty by "eating" the sandwich.
     *
     * @updates this
     * @ensures this.isComplete() = false
     */

    void eatsWhole();

    /**
     * Checks if the sandwich is fully assembled with all toppings.
     *
     * @return true if all categories have been rolled; false otherwise
     * @ensures isComplete = [true iff all components are not empty]
     */
    boolean isComplete();

    /**
     * Set the bread choice.
     *
     * @param b
     *            bread string (not empty)
     * @updates this
     * @requires b != null
     * @ensures getBread() = b
     */
    void setBread(String b);

    /**
     * Report the chosen bread.
     *
     * @return bread choice
     * @ensures getBread = [bread or null]
     */
    String getBread();

    /**
     * Set the protein choice.
     *
     * @param protein
     *            protein string (not empty)
     * @updates this
     * @requires protein != null
     * @ensures getProtein() = protein
     */
    void setProtein(String protein);

    /**
     * Report the chosen protein.
     *
     * @return protein choice
     * @ensures getProtein = [protein or empty string]
     */
    String getProtein();

    /**
     * Set the cheese choice.
     *
     * @param cheese
     *            cheese string (not empty)
     * @updates this
     * @requires cheese != null
     * @ensures getCheese() = cheese
     */
    void setCheese(String cheese);

    /**
     * Report the chosen cheese.
     *
     * @return cheese choice
     * @ensures getCheese = [cheese or null]
     */
    String getCheese();

    /**
     * Set the wild card choice.
     *
     * @param wildCard
     *            wild card string (not empty)
     * @updates this
     * @requires wildCard != null
     * @ensures getWildCard() = wildCard
     */
    void setWildCard(String wildCard);

    /**
     * Report the chosen wild card.
     *
     * @return wild card choice
     * @ensures getWildCard = [wild card or null]
     */
    String getWildCard();

    /**
     * Set the sauce choice.
     *
     * @param sauce
     *            sauce string (not empty)
     * @updates this
     * @requires sauce != null
     * @ensures getSauce() = sauce
     */
    void setSauce(String sauce);

    /**
     * Report the chosen sauce.
     *
     * @return sauce choice
     * @ensures getSauce = [sauce or null]
     */
    String getSauce();
}
