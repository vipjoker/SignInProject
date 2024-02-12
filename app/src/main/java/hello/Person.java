package hello;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Person {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String country;
    private String capital;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCapital() {
        return capital;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }

    public static Person create(String country, String capital){
        Person person = new Person();
        person.setCapital(capital);
        person.setCountry(country);
        return person;
    }


}
