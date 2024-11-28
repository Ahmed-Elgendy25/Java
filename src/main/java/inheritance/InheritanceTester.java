package inheritance;

import objects.Rectangle;

public class InheritanceTester {
    public static void main(String[] args) {
//        Person person = new Person();
//        Employee employee = new Employee();
            Square square = new Square();
            square.setLength(2);
            square.setWidth(1);
            double per = square.calculatePerimeter();

        Rectangle rectangle = new Rectangle();
        rectangle.print();
        square.print("Square");

        System.out.println("Perimeter is: " + per);
    }
}
