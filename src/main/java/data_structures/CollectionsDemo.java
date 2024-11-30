package data_structures;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
//        setDemo();
//        listDemo();
//        queueDemo();
    mapDemo();
    }
    public static void setDemo() {
        Set<String> fruits = new HashSet<String>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");

        var i = fruits.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
//        System.out.println(fruits);

//        System.out.println(fruits.contains("banana"));
//        Set.of() is immutable, which you can't add and remove anything from set.
//        Set moreFruit = Set.of("Manga", "Pear", "Grapes");
//        moreFruit.add("apple");
//        System.out.println(moreFruit);

    }
    public static void listDemo() {
        List <String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");

        fruits.forEach(f->System.out.println(f));
        fruits.forEach(f->{
            f="Fruit: "+f;
            System.out.println(f);
        });


//
//        for(String fruit:fruits) {
//            System.out.println(fruit);
//        }

//        fruits.set(2,"grapes"); // remove and add new one at the specified index
//        fruits.add("apple");
//        fruits.remove("apple");// remove first found
//        fruits.remove(2);
//        fruits.add("grapes");
//        System.out.println(fruits);
//        System.out.println("index 1:" + fruits.get(1));
//        System.out.println("Index of orange: " + fruits.indexOf("orange"));
//        System.out.println("last index of grapes " + fruits.lastIndexOf("grapes"));
//
//        // immutable list, can't add or remove anything from list, any modification is not allowed.
        List moreFruits = List.of("apple", "orange", "banana");


    }
    public static void queueDemo() {
        Queue<String> fruits = new LinkedList<String>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("lemon");
        String removedFruit =fruits.remove();

        System.out.println(fruits);
        System.out.println("Removed: "+ removedFruit);
        System.out.println("Head of queue: " + fruits.peek());
    }
    public static void mapDemo() {
        Map <String, Integer> fruitCalories= new HashMap<>();
        fruitCalories.put("apple", 1000);
        fruitCalories.put("orange", 500);
        fruitCalories.put("banana", 1000);
//        for(Map.Entry calorieInfo: fruitCalories.entrySet()) {
//
//            System.out.println(calorieInfo.getKey() + " : " + calorieInfo.getValue());
//
//        }
        fruitCalories.forEach((k,v)->{
            System.out.println("Key: "+k+" Value: "+v);
        });

//        fruitCalories.remove("banana");
//        System.out.println(fruitCalories);
//        System.out.println("Value of apple object: " + fruitCalories.get("apple"));
//        System.out.println("Contains apple in map: " + fruitCalories.containsKey("apple"));
//
//        // immutable map
//        Map immutableFruitCalories = Map.of(
//                "apple",95,
//                "lemon",20
//        );

    }
}
