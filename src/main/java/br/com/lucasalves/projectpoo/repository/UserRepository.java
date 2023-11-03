package br.com.lucasalves.projectpoo.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.lucasalves.projectpoo.model.User;

public interface UserRepository extends CrudRepository <User, Long> {
    
}
