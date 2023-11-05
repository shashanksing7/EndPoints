package shashanksingh.com.EndPoints.SMSService;

import org.springframework.stereotype.Component;

import java.util.Random;

/*
This Class is used to Generate six digit OTP that will be sent to user.
*/
@Component
public class GenerateOTP {

    /*
    Generate otp .
     */
    public String ReturnOTP(){
        // Create a random object
        Random random = new Random();

        // Generate a random integer between 100000 and 999999
        int otp = 100000 + random.nextInt(900000);

        // Convert the integer OTP to a string and return it
        return String.valueOf(otp);
    }

}
