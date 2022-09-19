package Unit3.examples;

public class Pizza {
    private String store;
    private int inches, numToppings;
    private boolean isDeepDish;

    // On the menu, go to code -> generate to access the shortcuts to have IntellliJ
    // make the constructor and get/set methods for you
    // To select all, you can click on the first, hold shift, and click on last
    // not select everything in between

    // The code will insert where the cursor is located.

    public Pizza(String store, int inches, int numToppings, boolean isDeepDish) {
        this.store = store;
        this.inches = inches;
        this.numToppings = numToppings;
        this.isDeepDish = isDeepDish;
    }

    public Pizza(String store, int inches, boolean isDeepDish) {
        this.store = store;
        this.inches = inches;
        this.isDeepDish = isDeepDish;
        this.numToppings = 0;
    }

    /** A toString method always has the method header of
     * public String toString()
     * This method NEVER has print statements
     * Instead, it creates a "print-ready" String and returns it
     * This method will be called on out behalf whenever we print
     * a Pizza oject reference variable
     *
     * Essentially, we are telling Java how to "print" a Pizza object
     *
     * @return
     */
    public String toString() {
        String str = "";
        str += "My pizza is from " + store + " it is " + inches + " inches";
        str += "\n";
        if (isDeepDish) {
            str += "I love deep dish";
        }
        else {
            str += "Thin crust is the way to go";
        }

        if (numToppings == 0) {
            str += "\nI love cheese pizza";
        }
        else {
            str += "\nMy pizza has " + numToppings + " toppings";
        }
        return str;
    }

    public String getStore() {
        return store;
    }
    public void setStore(String store) {
        this.store = store;
    }

    public int getInches() {
        return inches;
    }
    public void setInches(int inches) {
        this.inches = inches;
    }

    public int getNumToppings() {
        return numToppings;
    }
    public void setNumToppings(int numToppings) {
        this.numToppings = numToppings;
    }

    public boolean isDeepDish() {
        return isDeepDish;
    }
    public void setDeepDish(boolean deepDish) {
        isDeepDish = deepDish;
    }
}
