package io.zipcoder.crudapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person,Long> {

}
