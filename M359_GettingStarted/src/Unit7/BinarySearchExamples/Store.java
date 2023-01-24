package Unit7.BinarySearchExamples;

// import ArrayList class

import java.util.ArrayList;

public class Store {
    // declare an instance variable of an ArrayList of type Item called myItems
    private ArrayList<Item> myItems;


    public Store() {
        // instantiate the ArrayList myItems
        this.myItems = new ArrayList<>();
    }

    /**
     * This method will first search the ArrayList to see if there
     * is an Item in the ArrayList equal to newItem.
     *
     * If the item is found, then the quantity in stock is updated
     * to add the amount of the newItem to the existing amount in stock.
     *
     * If the item is not found in myItems, then add the Item to
     * the end of the ArrayList
     *
     * @param newItem - the item to add or update stock with
     * @return	true 	if an item was added to the ArrayList
     * 			false 	if no new items were added
     */

    public boolean updateStock(Item newItem) {

        for (Item myItem : myItems) {
            if (myItem.equals(newItem)) {
                myItem.setQuantity(myItem.getQuantity() + newItem.getQuantity());
                return false;
            }
        }
        myItems.add(newItem);
        return true;
    }

    /**
     * This method returns a String representation of every Item in the ArrayList
     * The toString of the Item class should be called here as a helper method.
     */

    public String toString() {
        String result = "";
        for (int i = 0; i < myItems.size(); i++){
            result += myItems.get(i).toString();
        }
        return result;

    }

}
