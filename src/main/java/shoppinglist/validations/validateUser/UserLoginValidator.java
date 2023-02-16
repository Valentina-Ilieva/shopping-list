package shoppinglist.validations.validateUser;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import shoppinglist.domein.model.UserLoginModel;
import shoppinglist.domein.model.UserModel;
import shoppinglist.services.UserService;

public class UserLoginValidator implements ConstraintValidator<ValidateLoginForm, UserLoginModel> {

    private final UserService userService;

    @Autowired
    public UserLoginValidator(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void initialize(ValidateLoginForm constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(UserLoginModel userLoginModel, ConstraintValidatorContext context) {
        UserModel user = this.userService.findByUsername(userLoginModel.getUsername());
        return user.getId() != null
                && user.getPassword()
                .equals(userLoginModel.getPassword());
    }
}
