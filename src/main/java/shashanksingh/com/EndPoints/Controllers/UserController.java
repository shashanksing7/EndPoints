package shashanksingh.com.EndPoints.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shashanksingh.com.EndPoints.Services.UserServices;

/*
This Controller will be used to Handle's the Requests coming for User Related  Activities.
 */
@RestController
@RequestMapping("/zentorc")
public class UserController {

    /*
    Creating the objects of the Required classes.
     */
    @Autowired
    private UserServices services;

    /*
    This is the trial Method that will be used to handle a request send Strign in return .
     */
    @GetMapping("/trial")
    public String TrialMethod(int n){
        return  "Hello ,Trial";
    }

    /*
    This method will get the users username nad will perform th further process pf sending
    OTP to the user .with help of other methods.
     */
    @GetMapping("/Initiate_OTP_Verification")
        public void InitiateOtpVerification(@RequestHeader("UserName") String Username){
        services.CheckUserAlreadyAddedOrNotSignUp(Username);


    }

}
