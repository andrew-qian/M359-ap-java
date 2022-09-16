package Unit2.examples.rectangleClassExample;

public class Rectangle {
    /*
    These are instance variables - they are created for every instance
    the Rectangle class.

    We use the visibility modifier of private so that their values can
    only be directly accessed from methods within the Rectangle class.

    These variables are declared before the constructor to give them
    global scope throughout the class. They are given their initial
    values inside the constructor.
     */
    private int width;
    private int height;

    /*
    This is the constructor. It is used to create (or construct) an
    object of the class. It is called along with the keyword new.

    Its method header has NO return type and its name is
    the same as the name of the class.

    You are allowed to have more than one constructor as long
    as the parameter list is different.
     */
    public Rectangle(int rectWidth, int rectHeight) {
        width = rectWidth;
        height = rectHeight;
    }
    // this constructor only takes in one value and creates a square.
    public Rectangle(int side) {
        width = side;
        height = side;
    }

    public void printArea(){
        System.out.println("The area is: " + width * height);
    }

    public void printPerimeter() {
        int p = 2*height + 2*width;
        System.out.println("The perimeter is: " + p);
    }
}
