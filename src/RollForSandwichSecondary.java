public abstract class RollForSandwichSecondary implements RollForSandwich {
    /*
     * Implement rollAll.
     */
    @Override
    public void rollAll() {
        //use kernel methods
    }

    /*
     * fullSandwich to build and return the full sandwich description.
     */
    @Override
    public String fullSandwich() {
        return "";
    }

    /*
     * rateSandwich to return a random rating + message.
     */
    @Override
    public String rateSandwich() {
        return "";
    }

    /*
     * toString.
     */
    @Override
    public String toString() {
        return this.fullSandwich();
    }

}
