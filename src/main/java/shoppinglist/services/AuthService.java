package shoppinglist.services;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import shoppinglist.domein.entities.User;
import shoppinglist.domein.model.UserLoginModel;
import shoppinglist.domein.model.UserRegisterModel;
import shoppinglist.helpers.LoggedUser;
import shoppinglist.repositories.UserRepository;

@Service
public class AuthService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final LoggedUser loggedUser;


    public AuthService(UserRepository userRepository, ModelMapper modelMapper, LoggedUser loggedUser) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.loggedUser = loggedUser;
    }

    public void registerUser(UserRegisterModel userRegisterModel) {
        User user = this.userRepository.saveAndFlush(this.modelMapper.map(userRegisterModel, User.class));
    }
    public void loginUser (UserLoginModel userLoginModel){
        User byUsername = this.userRepository.findByUsername(userLoginModel.getUsername())
                .get();
        this.loggedUser.setId(byUsername.getId());

    }

    public void logoutUser(){
        loggedUser.clearUser();
    }
}


