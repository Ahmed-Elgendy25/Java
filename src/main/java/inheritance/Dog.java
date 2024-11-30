package inheritance;

public class Dog  extends  Animal{
    @Override
    public void makeSound() {
        System.out.println("Woff Woff");

    }

    public void fetch() {
        System.out.println("Fetch is fun");
    }

}
