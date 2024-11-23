package hello.controller;

import hello.entity.ApiUser;
import hello.exception.UserExistsException;
import hello.model.UserCreateRequest;
import hello.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/user")
@CrossOrigin
public class UserController {
    private final UserService userService;
    public UserController(  UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<ApiUser> createUser (@RequestBody UserCreateRequest userCreateRequest) {
        try {
            ApiUser user = userService.createUser(userCreateRequest);
            return ResponseEntity.ok(user);
        }catch (Exception e){
            throw new UserExistsException(userCreateRequest.getUsername());
        }
    }


    @PutMapping("/{id}")
    public ResponseEntity<ApiUser> updateUser(@PathVariable Long id, @RequestBody UserCreateRequest userCreateRequest){
        ApiUser userById = userService.findUserById(id);

        userById.setUsername(userCreateRequest.getUsername());
        userService.updateUser(userById);

        return ResponseEntity.ok(userById);
    }


    @GetMapping
    public ResponseEntity<List<ApiUser>> getAllUsers(){
        return ResponseEntity.ok(userService.findAllUsers());
    }





}
