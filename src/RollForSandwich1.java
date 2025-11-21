import java.util.Objects;

/*
 * Representation invariant:
 *   - bread, protein, cheese, wildCard, and sauce are never null
 *   - Strings may be empty to represent no selection
 *
 * Abstraction function:
 *   a sandwich roll with the specified bread, protein, cheese, wildCard, and sauce
 */

public class RollForSandwich1 extends RollForSandwichSecondary {

    //representation and constructor implementaitnon
    private String bread;
    private String protein;
    private String cheese;
    private String wildCard;
    private String sauce;

    public RollForSandwich1() {
        this.bread = "";
        this.protein = "";
        this.cheese = "";
        this.wildCard = "";
        this.sauce = "";
    }

    //kernel methods
    public void setBread(String b) {
        this.bread = b;
    }

    public String getBread() {
        return this.bread;
    }

    public void setProtein(String p) {
        this.protein = p;
    }

    public String getProtein() {
        return this.protein;
    }

    public void setCheese(String c) {
        this.cheese = c;
    }

    public String getCheese() {
        return this.cheese;
    }

    public void setWildCard(String w) {
        this.wildCard = w;
    }

    public String getWildCard() {
        return this.wildCard;
    }

    public void setSauce(String s) {
        this.sauce = s;
    }

    public String getSauce() {
        return this.sauce;
    }

    //standard methods

    @Override
    public void clear() {
        this.bread = "";
        this.protein = "";
        this.cheese = "";
        this.wildCard = "";
        this.sauce = "";
    }

    @Override
    public RollForSandwich newInstance() {
        return new RollForSandwich1();
    }

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
