package at.ccp19.api;


import at.ccp19.controller.AuthorizationController;
import at.ccp19.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthorizationApi {
    @Autowired
    private AuthorizationController authorizationController;

    @PostMapping("/users/login")
    public User login(@RequestBody User user) {
            return authorizationController.login(user);
    }
}
