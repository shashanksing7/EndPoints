package shashanksingh.com.EndPoints.Services;

import org.springframework.stereotype.Service;
import shashanksingh.com.EndPoints.DTOs.ZentorcOTP;

/*
This interface will define methods to perform CRUD operation in the DataBase for for OTPs.
 */

public interface OTPServices {
    /*
    This method will Add OTP to DataBase.
     */
    public  void AddOTP(ZentorcOTP zentorcOTP);
}
