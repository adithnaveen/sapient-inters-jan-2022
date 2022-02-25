package com.naveen.auth.server.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.auth.server.entity.User;
import com.naveen.auth.server.service.UserService;
import com.naveen.auth.server.util.JwtUtil;

@RestController
// @CrossOrigin // handled at gateway (application.yml)
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService service;

    @Autowired
    private JwtUtil JwtUtil;

    
    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User user1 = service.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> authenticate(@RequestBody User loginInfo) {
        try {
            User user   = service.getUser(loginInfo.getEmail(), loginInfo.getPassword());
            

            String token = JwtUtil.createToken(user.getId(), user.getEmail());
            Map<String, Object> map = new HashMap<>();
            map.put("token", token);
            // map.put("name", user.getName());
            user.setPassword(null);
            map.put("user", user);
            return ResponseEntity.ok(map);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(e.getMessage());
        }
    }
 
}