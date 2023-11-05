package shashanksingh.com.EndPoints.Services;

import org.springframework.stereotype.Service;
import shashanksingh.com.EndPoints.DTOs.User;
/*
This interface is used to add the user to the DataBase;
 */

public interface UserServices {
    /*
    This method will add user to database.
     */
   void  AddUser(User user);

   /*
   This method will check if user is already added to the DB or not.
    */
    void CheckUserAlreadyAddedOrNotSignUp(String UserName);
}

