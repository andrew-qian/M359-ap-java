package Unit9.Shapes;

public class Rectangle extends Shape{
    private double width, length;

    public Rectangle(String color, double width, double length){
        super(color, 4);
        this.width = width;
        this.length = length;
    }

    public String findArea(){
        return "Area = " + (width*length) + ".";
    }

    public void scaleSize(double factor){
        width *= factor;
        length *= factor;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
