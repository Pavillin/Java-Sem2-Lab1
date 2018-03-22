package exceptionslab;

/**
 *
 * @author Dylan
 */
public class Contact {
    /**
     * Instance Variables
     */
    private String firstName, lastName, email;

    /**
     * Contact Constructor
     * @param firstName
     * @param lastName
     * @param email 
     * @throws exceptionslab.IllegalContactInputException 
     */
    public Contact(String firstName, String lastName, String email) throws IllegalContactInputException {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws IllegalContactInputException {
        if("".equals(firstName)){
            throw new IllegalContactInputException("First name connot be empty.");
        }else{
            this.firstName = firstName;
        }  
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws IllegalContactInputException {
        if("".equals(lastName)){
            throw new IllegalContactInputException("Last name cannot be empty.");
        }else{
            this.lastName = lastName;
        } 
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws IllegalContactInputException {
        if("".equals(email)){
            throw new IllegalContactInputException("email cannot be empty.");
        }else{
            this.email = email;
        } 
    }
    
    
}
