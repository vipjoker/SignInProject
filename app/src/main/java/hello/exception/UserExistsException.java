package hello.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

public class UserExistsException extends  RuntimeException {

    public UserExistsException(String username){
        super("User with username " + username + " already exists");
    }
}
