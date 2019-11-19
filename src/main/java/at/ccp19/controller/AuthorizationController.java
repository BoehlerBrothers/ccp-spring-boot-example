package at.ccp19.controller;

import at.ccp19.entity.User;
import at.ccp19.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationController {

    @Autowired
    private UserRepository repository;

    public User login(User user) {
        User currentUser = repository.findById(user.getId()).get();
        if(currentUser.getPassword().equals(user.getPassword())) {
            System.out.println("LOGGED IN");
            return currentUser;
        }else {
            System.out.println("Not permitted.");
        }
        return null;
    }


}
