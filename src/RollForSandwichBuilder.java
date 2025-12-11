import java.util.Scanner;

/**
 * Builder class for RollForSandwich.
 */
public final class RollForSandwichBuilder {

    /**
     * Private constructor.
     */
    private RollForSandwichBuilder() {
    }

    /**
     * Main method.
     *
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RollForSandwich sandwich = new RollForSandwich1();

        System.out.println("Welcome to the Roll For Sandwich Builder!");

        System.out.println("Choose bread: ");
        String bread = scanner.nextLine();
        sandwich.setBread(bread);

        System.out.println("Choose protein: ");
        String protein = scanner.nextLine();
        sandwich.setProtein(protein);

        System.out.println("Choose cheese: ");
        String cheese = scanner.nextLine();
        sandwich.setCheese(cheese);

        System.out.println("Choose wild card ingredient: ");
        String wildCard = scanner.nextLine();
        sandwich.setWildCard(wildCard);

        System.out.println("Choose sauce: ");
        String sauce = scanner.nextLine();
        sandwich.setSauce(sauce);

        System.out.println();
        System.out.println("Your final sandwich: ");
        System.out.println(sandwich.fullSandwich());
        System.out.println(sandwich.rateSandwich());

        scanner.close();
    }
}
