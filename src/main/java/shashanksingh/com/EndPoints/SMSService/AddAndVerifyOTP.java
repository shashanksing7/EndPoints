package shashanksingh.com.EndPoints.SMSService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import shashanksingh.com.EndPoints.DTOs.ZentorcOTP;
import shashanksingh.com.EndPoints.Services.OTPServices;

/*
This Class will be used to Add the OTP to the DataBase so that it can be verified.
 */
@Component
public class AddAndVerifyOTP {
    /*
    Creating the Objects of the Required Class.
     */
    @Autowired
    private OTPServices otpServices;

    /*
    This method will Add OTP to DataBase.
     */
    public void AddOTP(ZentorcOTP zentorcOTP){
        otpServices.AddOTP(zentorcOTP);
    }


}
