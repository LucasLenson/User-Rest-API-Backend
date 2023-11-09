package br.com.lucasalves.projectpoo.service;

import org.springframework.stereotype.Service;

import br.com.lucasalves.projectpoo.model.User;
import br.com.lucasalves.projectpoo.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User create(User user){
        return userRepository.save(user);

    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
    }


    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public User updateUser(Long id, User updateUser) {
        User existentUser = getUserById(id);

        existentUser.setName(updateUser.getName());
        existentUser.setDay(updateUser.getDay());
        existentUser.setProcedure(updateUser.getProcedure());

        return userRepository.save(existentUser);

    }

}
