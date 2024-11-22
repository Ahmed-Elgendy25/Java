package methods;

import java.util.Scanner;

public class GreetUser {
    public static String setUserName() {
        System.out.println("Enter Your Name");
        Scanner scanner = new Scanner(System.in);
         String name = scanner.nextLine();
         scanner.close();
        return name;
    }

    public static void getName(String name){
        System.out.println("Your name is " + name);
    }

    public static void main(String [] args) {
        String name = setUserName();

        getName(name);
    }
}
