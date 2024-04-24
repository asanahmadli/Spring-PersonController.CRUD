package io.zipcoder.crudapp;


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

    public Person update(Long id, Person person){
        Person updatePerson = repository.findOne(id);
        updatePerson.setFirstName(person.getFirstName());
        updatePerson.setLastName(person.getLastName());
        return repository.save(updatePerson);
    }


    public Boolean delete(Long id){
        repository.delete(id);
        return true;
    }













}
