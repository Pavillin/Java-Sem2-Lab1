package exceptionslab;

/**
 *
 * @author Dylan
 */
public class IllegalContactInputException extends Exception{
    //no argument constructor
    public IllegalContactInputException(){
        super("Error with the contact input");
    }
    
    //constructor that accepts a message
    public IllegalContactInputException(String message){
        super(message);
    }
    
    //constructor accepts a "throwable" (or other exception) as input
    public IllegalContactInputException(Throwable throwable){
        super(throwable);
    }
    
    //constructor that accepts string message and a throwable
    public IllegalContactInputException(String message, Throwable throwable){
        super(message, throwable);
    }
}
