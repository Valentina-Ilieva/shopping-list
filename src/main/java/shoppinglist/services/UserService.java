package shoppinglist.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shoppinglist.domein.entities.User;
import shoppinglist.domein.model.UserModel;
import shoppinglist.repositories.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public UserService(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    public UserModel findByUsername(String username) {
        return this.modelMapper.map(this.userRepository.findByUsername(username)
                .orElse(new User()), UserModel.class);
    }
}
