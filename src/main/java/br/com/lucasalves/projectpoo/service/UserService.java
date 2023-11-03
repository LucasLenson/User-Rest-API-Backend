package br.com.lucasalves.projectpoo.service;

import org.springframework.stereotype.Service;

import br.com.lucasalves.projectpoo.model.User;
import br.com.lucasalves.projectpoo.repository.UserRepository;

@Service
public class UserService {
    
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User create(User user){
        return userRepository.save(user);

    }
    
}
