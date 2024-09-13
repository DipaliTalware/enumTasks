package org.example;

import java.util.*;

public class PersonRepository {
    private final List<Person> persons = new ArrayList<>();
//  private Map<Integer, Person>  persons = new HashMap<>();


    public Optional<Person> searchPersonById(int id){
        for(Person p: persons){
            if(p.id() == id){
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }

    public void addPerson(Person person){
        persons.add(person);
    }
}
