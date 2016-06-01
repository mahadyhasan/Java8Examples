package pluralsight.datetime;

import java.time.LocalDate;

/**
 * Created by mahady on 31/05/16.
 */
public class Person {

    private String name;
    private LocalDate dob;

    public Person() {}

    public Person(String name, LocalDate age) {
        this.name = name;
        this.dob = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getAge() {
        return dob;
    }

    public void setAge(LocalDate age) {
        this.dob = age;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", age=" + dob +
                '}';
    }
}
