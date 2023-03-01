package Unit9.Shapes;

public class Shape {
    private String color;
    private int numSides;
    public Shape(String color, int numSides){
        this.color = color;
        this.numSides = numSides;
    }
    @Override
    public String toString(){
        return "This " + color + " shape has " + numSides + " sides.";
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }
}
