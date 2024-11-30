package abstraction;

public class ShapeTester {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2.0,2.0);
        double area = rectangle.area();

        System.out.println("area: " + area);
    }
}
