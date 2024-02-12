package hello;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController{
    private Logger logger = LoggerFactory.getLogger(GreetingsController.class);
    @Autowired(required = false)
    PersonRepository repository;


    @GetMapping("/countries")
    public Iterable<Person> getResponse(){
        Iterable<Person> all = repository.findAll();

        return all;
    }

    @GetMapping("/country/{id}")
    public Optional<Person> getById(@PathVariable(name = "id") Long id){
        Optional<Person> byId = repository.findById(id);
        return byId;

    }

 

}