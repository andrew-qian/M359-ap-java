package Unit9.Shapes;

public class ShapeTester {
    public static void main(String[] args) {
        Shape myShape = new Shape("Red", 12);
        Circle cubsLogo = new Circle("Blue", 4);
        Rectangle billBoard = new Rectangle("Yellow", 100, 40);
        Square keyCaps = new Square("Gray", 2.1);
        System.out.println(myShape);
        System.out.println(cubsLogo);
        System.out.println(billBoard);
        System.out.println(keyCaps);
        System.out.println(cubsLogo.findArea());
        System.out.println(billBoard.findArea());
        System.out.println(keyCaps.findArea());
        billBoard.scaleSize(3);
        System.out.println(billBoard.findArea());
        keyCaps.scaleSize(3);
        System.out.println(keyCaps.findArea());
        cubsLogo.scaleSize(3);
        System.out.println(cubsLogo.findArea());
    }
}
