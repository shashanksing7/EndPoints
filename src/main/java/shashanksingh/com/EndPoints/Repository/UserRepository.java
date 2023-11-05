package shashanksingh.com.EndPoints.Repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import shashanksingh.com.EndPoints.DTOs.User;

/*
This Repository will be used to perform the CRUD operations for "User" object.
 */
@Repository
public interface UserRepository  extends JpaRepository<User,Integer> {


}
