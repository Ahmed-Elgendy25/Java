package abstraction;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double length,double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area () {
        return length*width;
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
