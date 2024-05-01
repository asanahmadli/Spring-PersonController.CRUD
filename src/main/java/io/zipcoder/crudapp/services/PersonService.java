package io.zipcoder.crudapp.services;


import io.zipcoder.crudapp.models.Person;
import io.zipcoder.crudapp.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {


    private PersonRepository repository;

    @Autowired
    public PersonService (PersonRepository repository){
        this.repository = repository;
    }

    public Iterable<Person> index(){
        return repository.findAll();
    }

    public Person find(Long id) {
        return repository.findOne(id);
    }

    public Person create(Person person){
        return repository.save(person);
    }

    public Person update(Person person){
        return repository.save(person);
    }


    public boolean delete(Long id){
        repository.delete(id);
        return true;
    }













}
