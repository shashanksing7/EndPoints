package shashanksingh.com.EndPoints.SMSService;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import shashanksingh.com.EndPoints.DTOs.ZentorcOTP;

import java.time.LocalDateTime;

/*
This class is used to send OTP to the user,using the twilio api.
 */
@Component
public class SendOTP {

    /*
    Getting the useful Data for calling the twilioAPI.
     */
    @Value("$twilioAuthTokens$")
    private String AuthToken;
    @Value("$twilioAccountSid$")
    private String AccountSID;
    /*
    Creating Objects of the RequiredClasses.
     */
    @Autowired
    private GenerateOTP generateOTP;
    @Autowired
    private  AddAndVerifyOTP addAndVerifyOTP;

    /*
    This method will use the AuthToken and AccountSID to create a
     message object and send the message to the user.
     */
    public void SendMessage(int  UserNumber){

        /*
        Creating the useful variables.
         */
        String OTP=generateOTP.ReturnOTP();
        /*
        Creating the Local Date Time.
         */
        LocalDateTime localDateTime = LocalDateTime.now();
         /*
        Creating The ZentorcOTP object
         */
        ZentorcOTP zentorcOTP=new ZentorcOTP(UserNumber,OTP,localDateTime);

        /*
           Initialising the Twilio Client.
         */
        Twilio.init(AccountSID,AuthToken);
        /*
        Creating a Message Object.
         */
        Message message=Message.creator(new PhoneNumber(String.valueOf(UserNumber)),new PhoneNumber("+17034680083"),"Zentorc OTP is"+OTP).create();

        /*
        Adding OTP to The DataBase Table.
         */
        addAndVerifyOTP.AddOTP(zentorcOTP)
        ;


    }
}
