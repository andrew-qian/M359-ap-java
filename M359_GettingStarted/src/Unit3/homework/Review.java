package Unit3.homework;

public class Review {
    private String orderName;
    private String orderPlace;
    private int orderRating;

    public Review(String name, String place, int rating){
        orderName = name;
        orderPlace = place;
        orderRating = rating;
    }

    public String toString(){
        String str = orderName + ", " + orderPlace + ", " + orderRating + "" + "\n";
        if (orderRating == 1){
            str += "\t ** Strongly Discouraged\n";
        }
        else if (orderRating == 5){
            str += "\t ** Highly Recommended\n";
        }
        else{
            return str;
        }
        return str;
    }

    public String getOrderName() {
        return orderName;
    }
    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
    public String getOrderPlace() {
        return orderPlace;
    }
    public void setOrderPlace(String orderPlace) {
        this.orderPlace = orderPlace;
    }
    public int getOrderRating() {
        return orderRating;
    }
    public void setOrderRating(int orderRating) {
        this.orderRating = orderRating;
    }
}
