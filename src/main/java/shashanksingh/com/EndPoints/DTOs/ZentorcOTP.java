package shashanksingh.com.EndPoints.DTOs;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

/*
This class represents the otp that will be stored in the DataBase and verified.
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ZentorcOTP {
    @Id
    int UserName;

    String OTP;

    LocalDateTime OTPSentDate;

}
