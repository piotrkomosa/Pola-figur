package zad2;

import java.sql.Time;

public class Test {

    public static void main(String[] args) {

        Person person = new Person("Janek", "Nowak",25);
        System.out.println(person.firstName+ person.age);

        TimeMachine timeMachine = new TimeMachine();
        timeMachine.backInTime(person);
        timeMachine.backInTime(person);


        System.out.println(person.firstName+ person.age);

        timeMachine.timeTravel(person,9);
        System.out.println(person.firstName + person.age);
    }
}
