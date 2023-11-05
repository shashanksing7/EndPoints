package shashanksingh.com.EndPoints.Services;

import org.springframework.stereotype.Service;
import shashanksingh.com.EndPoints.DTOs.ZentorcOTP;
import shashanksingh.com.EndPoints.Repository.OTPRepository;

/*
This Class will be used to implement the OTPServices and it's methods.
 */
@Service
public class OTPServicesImp implements  OTPServices{

    /*
    Creating the Objects of OTPRepository classes to perform the operations.
     */
    private OTPRepository otpRepository;

    /*
    This method will be used to Add otp to Database.
     */
    @Override
    public void AddOTP(ZentorcOTP zentorcOTP) {

        otpRepository.save(zentorcOTP);
    }
}
