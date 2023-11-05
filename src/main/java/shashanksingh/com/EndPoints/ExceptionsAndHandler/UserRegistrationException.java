package shashanksingh.com.EndPoints.ExceptionsAndHandler;
/*
This exception will be occurred when the user is already registered with that username.
 */
public class UserRegistrationException extends  RuntimeException{
    public UserRegistrationException(String Message){
        super(Message);
    }
}
