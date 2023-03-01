package Unit9.Shapes;

public class Square extends Rectangle{
    public Square(String color, double side){
        super(color, side, side);
    }
    @Override
    public String toString(){
        return "Area = " + super.getLength() * super.getWidth();
    }
}
