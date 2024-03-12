package SSO_Google.controller;

import SSO_Google.model.User;
import SSO_Google.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class GoogleSignController {
    @Autowired
    private IUserRepository userRepository;

    @GetMapping("/app")
    public String welcome() {
        return "sucess";
    }

    @PostMapping("/user")
    @ResponseBody
    public ResponseEntity<String> saveUser(User user) {
            userRepository.save(user);
            return ResponseEntity.ok("User saved successfully.");
        }
    @GetMapping("/getUsers")
    public List<User> getUser(){
        List<User> users=userRepository.findAll();
        return users;
    }

    }
