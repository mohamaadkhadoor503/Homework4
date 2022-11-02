/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repository;

import com.example.demo.model.Person;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * PersonRepository is an interface that extends MongoRepository for CRUD methods and custom finder methods.
 * It will be autowired in PersonController.
 * Now we can use MongoRepository’s methods:
 * save(), findOne(), findById(), findAll(), count(), delete(), deleteById()… without implementing these methods.
 */
public interface PersonRepository extends MongoRepository<Person, String> {
    public List<Person> findByFirstName(String firstName);
    public List<Person> findByLastName(String lastName);
    public List<Person> findByAgeGreaterThan(int age);

    
}
