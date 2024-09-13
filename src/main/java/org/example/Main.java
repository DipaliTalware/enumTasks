package org.example;


import java.util.List;
import java.util.Optional;

//Step 1: Create an enum DaysOfWeek with the weekdays (Monday to Sunday).
//Step 2: Write a method that returns the passed weekday as a string if it is a weekday (Monday to Friday), otherwise return 'Weekend'.
//Step 3: Create a record 'Person' with the properties 'id', 'name', and 'favoriteDay', where 'favoriteDay' is of type DaysOfWeek.
//Step 4: Create a class PersonRepository with a list/map of persons.
//Step 5: Write a method in the class PersonRepository that searches for and returns a person based on their id from the list/map. The method should return an Optional.
//Step 6: In your main method, check if the person exists. If they do, print the name and favorite day of the week to the console.
//If you have already completed this task earlier, you may work on the bonus task on the next page.

public class Main {
    public static void main(String[] args) {
        String day =  DaysOfWeekRunner.weekDayOrWeekendChecker(DayOfWeek.valueOf("SUNDAY"));
        System.out.println("It's a "+day);

        PersonRepository persons = new PersonRepository();
        Person person1 = new Person(1,"john", DayOfWeek.FRIDAY, Gender.Male);
        Person person2 = new Person(2,"Mili", DayOfWeek.FRIDAY, Gender.Female);
        Person person3 = new Person(3,"Jane", DayOfWeek.SUNDAY, Gender.Female);

        persons.addPerson(person1);
        persons.addPerson(person2);
        persons.addPerson(person3);



        //find person by ID
        Optional<Person> person = persons.searchPersonById(1);
        if (person.isPresent()){
            System.out.println("person found"+ person.get().toString());
        }
        else {
            System.out.println("Person not found");
        }



        //get person count by gender
        System.out.println("Total gender Count: "+ persons.countPersonByGender(Gender.Male));



        //find person by name
        Optional<Person> foundPerson = persons.searchPersonByName("Dipali");
        if (foundPerson.isPresent()){
            System.out.println("Found person by name: "+ foundPerson);
        }
        else {
            System.out.println("person not found!");
        }


//        Find persons by favorite Weekkday
        List<Person> personsWithFavoriteWeekday = persons.searchPersonByFavoriteWeekDay(DayOfWeek.FRIDAY);
        System.out.println(personsWithFavoriteWeekday);
    }
}