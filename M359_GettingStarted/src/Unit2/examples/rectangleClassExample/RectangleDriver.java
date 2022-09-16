package Unit2.examples.rectangleClassExample;

public class RectangleDriver {
    // we need to make a main method so we can create rectangle objects
    public static void main(String[] args) {
        // to create an object we need to use the following structure
        //ClassName varName = new ClassName(... parameters ...)

        // actual params are 5 and 10
        // formal params are rectWidth and rectHeight
        Rectangle r1 = new Rectangle(5, 10);
        // actual params is 6
        // formal params is side
        Rectangle r2 = new Rectangle(6);

        //to call methods, use dot notation structure
        // varName.methodName()
        r1.printArea();
        r1.printPerimeter();

        r2.printArea();
        r2.printPerimeter();
    }
}
