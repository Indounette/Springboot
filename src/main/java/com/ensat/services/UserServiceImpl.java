package com.ensat.services;

import com.ensat.entities.User;
import com.ensat.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(User usr) {
        userRepository.save(usr);
    }

    @Override
    public boolean Checkfromlogin(String email , String password) {
        if (userRepository.findByEmail(email)==userRepository.findByPassword(password)){ return  true;}
        return false;
    }

}
