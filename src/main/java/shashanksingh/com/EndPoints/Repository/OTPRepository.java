package shashanksingh.com.EndPoints.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shashanksingh.com.EndPoints.DTOs.ZentorcOTP;
/*
This Repository will be used to perform CRUD operations in the DataBase to
verify the OTP.
 */
public interface OTPRepository extends JpaRepository<ZentorcOTP,Integer> {

}
