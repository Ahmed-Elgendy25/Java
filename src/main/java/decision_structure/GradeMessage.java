package decision_structure;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String [] args) {
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();
        /* Switch Statements*/
//        String message;
//
//        switch(grade) {
//            case "A":
//                message="Excellent Job!";
//                break;
//
//            case "B":
//                message="Good job!";
//                break;
//
//            case "C":
//                message="Keep trying!";
//                break;
//            case "D":
//                message="You need to work a bit harder";
//                break;
//
//                default:
//                    message="No grade found";
//                    break;
//        }
//


    /* Switch Expressions: used for assigning variable after evaluating cases*/
        String message = switch (grade) {
            case "A" -> "Excellent Job!";
            case "B" -> "Good job!";
            case "C" -> {
                System.out.println("PRINT");
                yield "Keep trying!";
            }
            case "D" -> "You need to work a bit harder";
            default -> "No grade found";
        };

        System.out.println("message: " + message);
    }
}

