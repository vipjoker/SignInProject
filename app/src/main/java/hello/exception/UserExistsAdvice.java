package hello.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class UserExistsAdvice {



    @ResponseBody
    @ExceptionHandler(UserExistsException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public Map<String,String > exceptionHandler(UserExistsException exception){
        Map<String, String> map = new HashMap<>();
        map.put("Message", exception.getMessage());
        return map;
    }

    @ResponseBody
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String,String > exceptionNotFoundHandler(UserNotFoundException exception){
        Map<String, String> map = new HashMap<>();


        map.put("Message", exception.getMessage());
        return map;
    }
}
