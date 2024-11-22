package hello.controller;

import hello.model.UserCreateRequest;
import hello.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {
    private final UserService userService;
    public UserController(  UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserCreateRequest> createUser (@RequestBody UserCreateRequest userCreateRequest) {
        userService.createUser(userCreateRequest);
        return ResponseEntity.ok(userCreateRequest);
    }


}
