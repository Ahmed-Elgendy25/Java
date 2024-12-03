package exceptions;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ThrowingExceptions {
    public static double calculatePay(double hours,double payRate)
            throws NegativeInputException {
            if(hours>40) {
//                throw new NegativeInputException(); same as built-in illegalArgumentException
                throw new IllegalArgumentException("Hours must be less than or equal 40");
            } else if (hours<0 || payRate<0) {
                throw new NegativeInputException();
            }
            return hours*payRate;
    }


    public static void rethrowException() throws Exception {
        File file = new File("nonexistent.txt");
        file.createNewFile();
    }
    public static void rethrowExceptions() throws IOException {
        File file = new File("nonexistent.txt");
        file.createNewFile();
        Scanner fileReader = new Scanner(file);
    }
}
