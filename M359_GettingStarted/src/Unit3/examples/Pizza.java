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
