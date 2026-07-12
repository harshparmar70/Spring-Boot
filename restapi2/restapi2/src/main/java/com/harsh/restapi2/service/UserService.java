package com.harsh.restapi2.service;

import com.harsh.restapi2.entity.User;
import com.harsh.restapi2.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository ;

    public void saveEntry(User user){
        userRepository.save(user);

    }
    public List<User> getAll(){
        return  userRepository.findAll();

    }

    public Optional<User> findById(ObjectId obj){
        return userRepository.findById(obj);
    }

    public void  deleteById(ObjectId id){
        userRepository.deleteById(id);
    }

    public  User findByUserName(String username){
        return userRepository.findByUserName(username);
    }

}
