package com.csit321g3._notfound.clutch.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csit321g3._notfound.clutch.repository.UserRepository;
import com.csit321g3._notfound.clutch.entity.UserEntity;

@Service
public class UserService {

    @Autowired
    UserRepository urepo;

    public UserService(UserRepository urepo) {
        this.urepo = urepo;
    }

    public UserEntity postUser(UserEntity user) {
        return urepo.save(user);
    }

    public List<UserEntity> getAllUsers() {
        return urepo.findAll();
    }

    public UserEntity getUserById(Long id) {
        try {
            return urepo.findById(id).get();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public UserEntity putUser(Long id, UserEntity newUserDetails) {
        try {
            UserEntity user = urepo.findById(id).get();

            user.setFirstName(newUserDetails.getFirstName());
            user.setLastName(newUserDetails.getLastName());
            user.setEmail(newUserDetails.getEmail());
            user.setPasswordHash(newUserDetails.getPasswordHash());
            user.setRole(newUserDetails.getRole());

            return urepo.save(user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public String deleteUser(Long id) {
        try {
            UserEntity user = urepo.findById(id).get();
            urepo.delete(user);
            return "User " + id + " is successfully deleted!";
        } catch (Exception e) {
            return "User " + id + " does not exist!";
        }
    }
}
