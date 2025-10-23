import components.standard.Standard;

/**
 * RollForSandwichKernel defines the behaviors in order to generate and reset a
 * sandwich using random components.
 *
 * @author Cassie Yuan ensures <pre>
 * The sandwich can be built with all ingredients, cleared of all ingredients,
 * and checked for completeness (all topping categories are filled).
 * </pre>
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
     * @clears this
     * @ensures this.isComplete() = false
     */

    void eatsWhole();

    /**
     * Checks if the sandwich is full assembled with all toppings.
     *
     * @return true if all categories have been rolled, false if not
     * @ensures isComplete = [true iff all components are not empty]
     */

    boolean isComplete();

}
