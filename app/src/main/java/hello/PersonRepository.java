package hello;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface PersonRepository extends CrudRepository<Person, Long>{
   
}
