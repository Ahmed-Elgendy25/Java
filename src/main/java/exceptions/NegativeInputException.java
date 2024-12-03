package exceptions;

public class NegativeInputException extends Exception{
    public NegativeInputException(){

        this("Input must be greater than or equal to 0");
//     It calls constructor of NegativeInputException which accepts String...
//    So it will call on line 10
    }
    public NegativeInputException(String message){
        super(message);
    }
}
