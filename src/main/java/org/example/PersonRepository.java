package org.example;

import java.util.*;

public class PersonRepository {
    private final List<Person> persons = new ArrayList<>();

// To search persons in a list based on their IDs
    public Optional<Person> searchPersonById(int id) {
        for (Person p : persons) {
            if (p.id() == id) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }

//    To add persons in list
    public void addPerson(Person person) {
        persons.add(person);
    }

//    To count Gender
    public long countPersonByGender(Gender gender) {
        return persons.stream().filter(person -> person.gender().equals(gender)).count();
    }

//    To search person by their name
    public Optional<Person> searchPersonByName(String name){
        for(Person p: persons){
            if(p.name() == name){
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }

//    To search person by favorite weekday

    public List<Person> searchPersonByFavoriteWeekDay(DayOfWeek favoriteDay) {
     return persons.stream().filter(person -> person.favoriteDay()== favoriteDay).toList();
    }
}
