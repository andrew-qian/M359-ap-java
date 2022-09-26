package Unit3.Unit3_More_3_7Examples;

public class Shoe {
    private String shoeBrand, shoeStyle;
    private double shoeSize, shoePrice;

    public Shoe(String shoeBrand, String shoeStyle, double shoeSize, double shoePrice) {
        this.shoeBrand = shoeBrand;
        this.shoeStyle = shoeStyle;
        this.shoeSize = shoeSize;
        this.shoePrice = shoePrice;
    }

    public boolean equals(Shoe other){
        return this.shoeBrand.equals(other.shoeBrand) && this.shoeStyle.equals(other.shoeStyle);
    }

    public int compareTo(Shoe other){
        double diff = this.shoePrice - other.shoePrice;
        if (diff < 0)
            return -1;
        else if (diff == 0)
            return 0;
        else
            return 1;
    }

    public String getShoeBrand() {
        return shoeBrand;
    }

    public void setShoeBrand(String shoeBrand) {
        this.shoeBrand = shoeBrand;
    }

    public String getShoeStyle() {
        return shoeStyle;
    }

    public void setShoeStyle(String shoeStyle) {
        this.shoeStyle = shoeStyle;
    }

    public double getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(double shoeSize) {
        this.shoeSize = shoeSize;
    }

    public double getShoePrice() {
        return shoePrice;
    }

    public void setShoePrice(double shoePrice) {
        this.shoePrice = shoePrice;
    }


}
