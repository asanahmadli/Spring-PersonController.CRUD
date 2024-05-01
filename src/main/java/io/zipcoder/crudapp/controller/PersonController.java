package io.zipcoder.crudapp.controller;

import io.zipcoder.crudapp.services.PersonService;
import io.zipcoder.crudapp.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {


    @Autowired
    private PersonService personService;


    public PersonController(PersonService personService){
        this.personService = personService;
    }
    @PostMapping("/person")
    public ResponseEntity<Person> create(@RequestBody Person person){
        return new ResponseEntity<>(personService.create(person),HttpStatus.CREATED);
    };

    @GetMapping("/person/{id}")
    public ResponseEntity<Person> get(@PathVariable Long id){
        return new ResponseEntity<>(personService.find(id),HttpStatus.OK);
    };

    @GetMapping("/persons")
    public List<Person> getPersonList(){
        return (List<Person>) personService.index();
    };

    @PutMapping("/person/{id}")
    public ResponseEntity<Person> update(@RequestBody Person person){
        return new ResponseEntity<>(personService.update(person),HttpStatus.OK);
    };

    @DeleteMapping("/person/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        return new ResponseEntity<>(personService.delete(id), HttpStatus.OK);
    };

}
