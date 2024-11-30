package inheritance;

public class Zoo {
    public static void main(String[] args) {
        Dog snoop = new Dog();
//        snoop.fetch();
//        snoop.makeSound();

        Animal sasha = new Dog();
        feed(sasha);
//      sasha.makeSound();
        sasha = new Cat();
        Cat newCat = (Cat) sasha;

        feed(newCat);


    }

    public static void feed(Animal animal) {
        if(animal instanceof Dog) {
            System.out.println("Feed Dog");
        }
        else if(animal instanceof Cat) {
             System.out.println("Feed Cat");
        }
    }
}
