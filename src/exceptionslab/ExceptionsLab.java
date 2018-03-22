package exceptionslab;

/**
 *
 * @author Dylan
 */
public class ExceptionsLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IllegalContactInputException {
        Contact contact1 = new Contact("Bobby", "T", "boobbyT29@gmail.com");
        Contact contact2 = new Contact("Young", "", "");
    }
    
}
