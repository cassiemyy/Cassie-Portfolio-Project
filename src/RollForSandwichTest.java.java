import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Tests for RollForSandwich class interface using RollForSandwich1 implementation.
 */
public class RollForSandwichTest {
    /**
     * Creates and returns a new RollForSandwich1 object.
     * @return new RollForSandwich1 object
     */
    private RollForSandwich createFromArgs() {
        return new RollForSandwich1();
    }

    /**
     * Tests that a newly created RollForSandwich object is not complete.
     */
    @Test
    public void testNotCompleteInitially() {
        RollForSandwich sandwich = this.createFromArgs();
        assertFalse(sandwich.isComplete());
        assertEquals("", sandwich.getBread());
        assertEquals("", sandwich.getProtein());
        assertEquals("", sandwich.getCheese());
        assertEquals("", sandwich.getWildCard());
        assertEquals("", sandwich.getSauce());
    }

    /**
     * Tests the setters and getters of RollForSandwich.
     */
    @Test
    public void testSettersGetters() {
        RollForSandwich sandwich = this.createFromArgs();
        sandwich.setBread("Naan");
        sandwich.setProtein("Turkey");
        sandwich.setCheese("Cheddar");
        sandwich.setWildCard("Fries");
        sandwich.setSauce("Mayo");

        assertEquals("Naan", sandwich.getBread());
        assertEquals("Turkey", sandwich.getProtein());
        assertEquals("Cheddar", sandwich.getCheese());
        assertEquals("Fries", sandwich.getWildCard());
        assertEquals("Mayo", sandwich.getSauce());
        assertTrue(sandwich.isComplete());
    }

    /**
     * Tests that rollAll makes a complete sandwich.
     */
    @Test
    public void testRollAllComplete() {
        RollForSandwich sandwich = this.createFromArgs();
        sandwich.rollAll();
        assertTrue(sandwich.isComplete());

        //everything non-empty
        assertFalse(sandwich.getBread().isEmpty());
        assertFalse(sandwich.getProtein().isEmpty());
        assertFalse(sandwich.getCheese().isEmpty());
        assertFalse(sandwich.getWildCard().isEmpty());
        assertFalse(sandwich.getSauce().isEmpty());
    }

    /**
     * Tests the fullSandwich method.
     */
    @Test
    public void testFullSandwich() {
        RollForSandwich sandwich = this.createFromArgs();
        sandwich.setBread("Naan");
        sandwich.setProtein("Turkey");
        sandwich.setCheese("Brie");
        sandwich.setWildCard("Pickles");
        sandwich.setSauce("Ranch");

        String description = sandwich.fullSandwich();
        String expected = "Your sandwich has Naan bread, Turkey protein, "
        + "Brie cheese, Pickles as a wild card, and Ranch sauce.";
        assertEquals(expected, description);
    }

    /**
     * Tests rateSandwich method when sandwich is incomplete.
     */
    @Test
    public void testRateSandwichIncomplete() {
        RollForSandwich sandwich = this.createFromArgs();
        String rating = sandwich.rateSandwich();
        String expected = "Finish building your sandwich!";
        assertEquals(expected, rating);
    }

    /**
     * Tests clear method.
     */
    @Test
    public void testClearSandwich() {
        RollForSandwich sandwich = this.createFromArgs();
        sandwich.rollAll();
        sandwich.clear();
        assertEquals("", sandwich.getBread());
        assertEquals("", sandwich.getProtein());
        assertEquals("", sandwich.getCheese());
        assertEquals("", sandwich.getWildCard());
        assertEquals("", sandwich.getSauce());
        assertFalse(sandwich.isComplete());
    }



}
