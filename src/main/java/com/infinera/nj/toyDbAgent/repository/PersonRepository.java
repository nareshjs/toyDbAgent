package com.infinera.nj.toyDbAgent.repository;

import com.infinera.nj.toyDbAgent.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer>
{
    Person findByFirstName(String name);
}
