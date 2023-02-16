package shoppinglist.domein.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import shoppinglist.validations.passwordValidation.PasswordMatch;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Builder
@PasswordMatch
public class UserRegisterModel {

    @Size(min = 3, max = 20)
    @NotBlank
    private String username;

    @Size(min = 3, max = 20)
    @NotBlank
    private String password;


    @NotNull
    private String confirmPassword;

    @Email
    @NotBlank
    private String email;
}
