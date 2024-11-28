package objects;

 public class Rectangle {
    protected double length;
    protected double width;
    protected int sides = 4;


    public Rectangle(){
        setLength(0);
        setWidth(0);
    }

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }


     public void print() {
         System.out.println("I am a Rectangle");
     }
    public double calculatePerimeter() {
        return (this.length+this.width)*2;
    }

    public double calculateArea() {
        return this.length*this.width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
}
