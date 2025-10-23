/**
 * RollForSandwich extends RollForSandwichKernel and has more functionality and
 * rolls all components, views full sandwich, and rates it.
 *
 * @author Cassie Yuan
 */

public interface RollForSandwich extends RollForSandwichKernel {
    /**
     * Rolls all of the sandwich components at the same time.
     *
     * @updates this
     * @ensures each category's option is randomly selected, including bread,
     * protein, cheese, wild card, sauce)
     */
    void rollAll();

    /**
     * Prints the description of the current sandwich.
     *
     * @return string that summarizes all the components of the sandwich
     * @ensures fullSandwich = [string listing all components of the current sandwich]
     */
    String fullSandwich();

    /**
     * Randomly rates the sandwich with a score + fun comment, not literally.
     *
     * @return string that is the sandwich rating (number out of 10)
     * @ensures rateSandwich = [random rating + message]
     */
    String rateSandwich();
}
