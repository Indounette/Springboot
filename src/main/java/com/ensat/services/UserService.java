package com.ensat.services;

import com.ensat.entities.User;
import java.util.List;

public interface UserService {
    void saveUser(User user);

    boolean Checkfromlogin(String email , String password);

}
