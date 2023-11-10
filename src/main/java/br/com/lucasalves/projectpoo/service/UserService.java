package br.com.lucasalves.projectpoo.service;

import org.springframework.stereotype.Service;

import br.com.lucasalves.projectpoo.model.User;
import br.com.lucasalves.projectpoo.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private static UserRepository userRepository;

    public UserService(UserRepository userRepository){
        UserService.userRepository = userRepository;
    }

    public User create(User user){
        return userRepository.save(user);

    }

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public User updateUser(Long id, User updateUser) {
        User existentUser = getUserById(id);

        existentUser.setName(updateUser.getName());
        existentUser.setPrice(updateUser.getPrice());
        existentUser.setProcedure(updateUser.getProcedure());

        return userRepository.save(existentUser);

    }

}
