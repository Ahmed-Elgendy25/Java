package methods;

import java.util.Scanner;

public class InstantCreditCheck {
    /* Variables */
    static double requiredSalary= 25000;
    static int requiredCreditScore = 700;

   static Scanner scanner = new Scanner(System.in);


    /* Main */
    public static void main(String[] args) {
        double s = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        boolean qualified= isUserQualified(s, creditScore);

        notifyUser(qualified);

    }

    /* Methods */

    public static double getSalary() {
        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();

        return salary;
    }

    public static int getCreditScore() {
        System.out.println("Enter your credit score");
        int creditScore = scanner.nextInt();

        return creditScore;
    }

    public static boolean isUserQualified(double salary,int creditScore) {

//        if(salary>=requiredSalary && creditScore>=requiredCreditScore) {
//            return true;
//        }
//
//        else {
//            return false;
//        }

        return salary >= requiredSalary && creditScore >= requiredCreditScore;

    }

    public static void notifyUser(boolean qualified) {
        if (qualified) {
            System.out.println("Congrats");
        } else {
            System.out.println("Sorry, You've been Declined");
        }
    }


}
