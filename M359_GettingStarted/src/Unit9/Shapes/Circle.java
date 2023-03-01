package Unit9.Shapes;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, double radius){
        super(color, 0);
        this.radius = radius;
    }

    @Override
    public String toString(){
        return super.toString() + " Circle has a radius of " + radius + ".";
    }

    public String findArea(){
        return "Area = " + (Math.PI * Math.pow(radius, 2));
    }

    public void scaleSize(double factor){
        radius *= factor;
    }
}
