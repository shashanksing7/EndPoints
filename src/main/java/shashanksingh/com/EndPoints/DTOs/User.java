package shashanksingh.com.EndPoints.DTOs;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @NotNull
    @NotBlank
    @NotEmpty
    int Username;

    @NotNull
    @NotBlank
    @NotEmpty
    String FirstName;

    @NotNull
    @NotBlank
    @NotEmpty
    String LastName;

    @NotNull
    @NotBlank
    @NotEmpty
    String Gender;

    @NotNull
    @NotBlank
    @NotEmpty
    String Password;

    @NotNull
    @NotBlank
    @NotEmpty
    Date DateOfBirth;

}
