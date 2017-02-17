package com.examples.java;


import com.examples.java.builder.Address;
import com.examples.java.builder.Company;
import com.examples.java.builder.Person;
import com.examples.java.builder.PersonBuilder;
import org.junit.Test;

/**
 * Unit test for simple BuilderPattern.
 */
public class BuilderPatternTest{

    @Test(expected = NullPointerException.class)
    public void testMissingName(){
        PersonBuilder personBuilder = new PersonBuilder();
            personBuilder.setSurname("Melgoza");
            personBuilder.setAddress(new Address("Sur 12-A", "Mexico City", 22));
            personBuilder.setAlias("woodstafari");
            personBuilder.setAge(25);
            personBuilder.setCompany(new Company("Conecta", "Banking"));
            personBuilder.setTelephones(new String[]{"56575797", "58038051"});

            Person person = personBuilder.build();

    }

    @Test(expected = NullPointerException.class)
    public void testMissingSurName(){
        PersonBuilder personBuilder = new PersonBuilder();
            personBuilder.setName("Miztli");
            personBuilder.setAddress(new Address("Sur 12-A", "Mexico City", 22));
            personBuilder.setAlias("woodstafari");
            personBuilder.setAge(25);
            personBuilder.setCompany(new Company("Conecta", "Banking"));
            personBuilder.setTelephones(new String[]{"56575797", "58038051"});

            Person person = personBuilder.build();

    }

    @Test(expected = IllegalArgumentException.class)
    public void testTelephonesLessThanOne(){
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setName("Miztli");
        personBuilder.setSurname("Melgoza");
        personBuilder.setAddress(new Address("Sur 12-A", "Mexico City", 22));
        personBuilder.setAlias("woodstafari");
        personBuilder.setAge(25);
        personBuilder.setCompany(new Company("Conecta", "Banking"));
        personBuilder.setTelephones(new String[]{});

        Person person = personBuilder.build();

    }

    @Test
    public void testSuccessfulPersonCreation(){
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setName("Miztli");
        personBuilder.setSurname("Melgoza");
        personBuilder.setAddress(new Address("Sur 12-A", "Mexico City", 22));
        personBuilder.setAlias("woodstafari");
        personBuilder.setAge(25);
        personBuilder.setCompany(new Company("Conecta", "Banking"));
        personBuilder.setTelephones(new String[]{"12345654"});

        Person person = personBuilder.build();

            assert (person.getName() == "Miztli");
    }
}
