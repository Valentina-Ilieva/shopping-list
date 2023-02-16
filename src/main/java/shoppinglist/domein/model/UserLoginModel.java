package com.example.coffeeshop.domein.models;

import com.example.coffeeshop.validations.validateUser.ValidateLoginForm;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@ValidateLoginForm
public class UserLoginModel {
    private String username;
    private String password;
}
