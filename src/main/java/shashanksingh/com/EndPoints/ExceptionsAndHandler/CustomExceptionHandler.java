package shashanksingh.com.EndPoints.ExceptionsAndHandler;

import org.apache.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
/*
This class will be used to handle the exceptions that occur in our application.
 */
@ControllerAdvice

public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    /*
    This method will handle our User already Exist Exception.
     */
    @ExceptionHandler(UserRegistrationException.class)
    public ResponseEntity<Object>HandleUserAlreadyExistsException(UserRegistrationException exception){
        /*
        Getting the Message thrown at exception;
         */
        String Message=exception.getMessage();
        return  new ResponseEntity<>(Message, HttpStatusCode.valueOf(404));
    }
}
