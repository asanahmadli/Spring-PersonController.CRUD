package io.zipcoder.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {


    private Person person;

    @Autowired
    public PersonController(Person person){
        this.person = person;
    }
    @PostMapping("person")
    ResponseEntity<Person> create(@RequestBody Person p){
        return new ResponseEntity<>(person.);
    };

    @GetMapping("/person/{id}")
    public Person get(@PathVariable Long id){
        return new ResponseEntity<>();
    };

    @GetMapping("/persons")
    public List<Person> getPersonList(){
        return new ResponseEntity<>();
    };

    @PutMapping("/person")
    Person update(@RequestBody Person p){
        return new ResponseEntity<>();
    };

    @DeleteMapping("/person/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        return new ResponseEntity<>(person.delete(id), HttpStatus.OK);
    };

}
