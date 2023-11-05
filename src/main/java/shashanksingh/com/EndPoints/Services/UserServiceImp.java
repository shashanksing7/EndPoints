package shashanksingh.com.EndPoints.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shashanksingh.com.EndPoints.ExceptionsAndHandler.UserRegistrationException;
import shashanksingh.com.EndPoints.Repository.UserRepository;
import shashanksingh.com.EndPoints.DTOs.User;
import shashanksingh.com.EndPoints.SMSService.SendOTP;

/*
This Class implements the UserService interface.
 */
@Service
public class UserServiceImp implements  UserServices{

    /*
    Creating object of the UserRepository.
     */
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SendOTP sendOTP;

    /*
    This method implements the Adduser method to add user to the database .
     */
    @Override
    public void AddUser(User user) {
        userRepository.save(user);
    }

    /*
   This method will check if user is already added to the DB or not.
    */
    @Override
    public  void  CheckUserAlreadyAddedOrNotSignUp(String UserName){

        /*
        Here we are going to user the Crude Operation of Repository to check for USer in The DataBase.
         */
        /*
        if User By the given Username Already exists,then if block will be executed and we will
        throw exception else we will proceed for further process.
         */
        if(userRepository.existsById(Integer.parseInt(UserName))){
            throw  new UserRegistrationException("User Already Exist");
        }
        else{
            sendOTP.SendMessage(Integer.parseInt(UserName));
        }



    }
}
