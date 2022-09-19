package Unit3.examples;

/**
 * this class will test out Pizza code
 * It will contain the main method
 * shortcut: psvm
 */
public class PizzaTester {
    public static void main(String[] args) {
        Pizza dd = new Pizza("Lou Malnatis", 12, 2, true);
        Pizza thin = new Pizza("Domino's", 16, 2, false);
        Pizza thinCheese = new Pizza("Domino's", 14, false);
        System.out.println(dd);
        System.out.println(thin);
        System.out.println(thinCheese);

    }
}
