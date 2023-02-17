package shoppinglist.domein.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import shoppinglist.validations.validateUser.ValidateLoginForm;

@NoArgsConstructor
@Setter
@Getter
@ValidateLoginForm
public class UserLoginModel {
    private String username;
    private String password;
}
