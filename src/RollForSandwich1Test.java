import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Tests for RollForSandwich1 class.
 */
public class RollForSandwich1Test {

    /**
     * Tests that the constructor creates an empty sandwich.
     */
    @Test
    public void testConstructorEmptySandwich() {
        RollForSandwich1 sandwich1 = new RollForSandwich1();
        assertEquals("", sandwich1.getBread());
        assertEquals("", sandwich1.getProtein());
        assertEquals("", sandwich1.getCheese());
        assertEquals("", sandwich1.getWildCard());
        assertEquals("", sandwich1.getSauce());
        assertFalse(sandwich1.isComplete());
    }

    /**
     * Tests isComplete() when all components are used.
     */
    @Test
    public void testIsCompleteTrue() {
        RollForSandwich1 sandwich1 = new RollForSandwich1();
        sandwich1.setBread("Naan");
        sandwich1.setProtein("Turkey");
        sandwich1.setCheese("Brie");
        sandwich1.setWildCard("Pickles");
        sandwich1.setSauce("Ranch");
        assertTrue(sandwich1.isComplete());
    }

    /**
     * Tests isComplete() when sauce is missing.
     */
    @Test
    public void testCompleteFalse() {
        RollForSandwich1 sandwich1 = new RollForSandwich1();
        sandwich1.setBread("Naan");
        sandwich1.setProtein("Turkey");
        sandwich1.setCheese("Brie");
        sandwich1.setWildCard("Pickles");
        sandwich1.setSauce("");
        assertFalse(sandwich1.isComplete());
    }

    /**
     * Test eatsWhole() method.
     */
    @Test
    public void testEatsWhole() {
        RollForSandwich1 sandwich1 = new RollForSandwich1();
        sandwich1.setBread("Naan");
        sandwich1.setProtein("Turkey");
        sandwich1.setCheese("Brie");
        sandwich1.setWildCard("Pickles");
        sandwich1.setSauce("Ranch");

        sandwich1.eatsWhole();

        assertEquals("", sandwich1.getBread());
        assertEquals("", sandwich1.getProtein());
        assertEquals("", sandwich1.getCheese());
        assertEquals("", sandwich1.getWildCard());
        assertEquals("", sandwich1.getSauce());
        assertFalse(sandwich1.isComplete());
    }

    /**
     * Test transferFrom() method.
     */
    @Test
    public void testTransferFrom() {
        RollForSandwich1 sandwich1 = new RollForSandwich1();
        RollForSandwich1 sandwich2 = new RollForSandwich1();

        sandwich2.setBread("Naan");
        sandwich2.setProtein("Turkey");
        sandwich2.setCheese("Brie");
        sandwich2.setWildCard("Pickles");
        sandwich2.setSauce("Ranch");

        sandwich1.transferFrom(sandwich2);

        assertEquals("Naan", sandwich1.getBread());
        assertEquals("Turkey", sandwich1.getProtein());
        assertEquals("Brie", sandwich1.getCheese());
        assertEquals("Pickles", sandwich1.getWildCard());
        assertEquals("Ranch", sandwich1.getSauce());

        assertEquals("", sandwich2.getBread());
        assertEquals("", sandwich2.getProtein());
        assertEquals("", sandwich2.getCheese());
        assertEquals("", sandwich2.getWildCard());
        assertEquals("", sandwich2.getSauce());
        assertFalse(sandwich2.isComplete());
    }

    /**
     * Test newInstance() method.
     */
    @Test
    public void testNewInstance() {
        RollForSandwich1 sandwich1 = new RollForSandwich1();
        RollForSandwich newSandwich = sandwich1.newInstance();

        assertFalse(newSandwich.isComplete());

        assertEquals("", newSandwich.getBread());
        assertEquals("", newSandwich.getProtein());
        assertEquals("", newSandwich.getCheese());
        assertEquals("", newSandwich.getWildCard());
        assertEquals("", newSandwich.getSauce());
    }

}
