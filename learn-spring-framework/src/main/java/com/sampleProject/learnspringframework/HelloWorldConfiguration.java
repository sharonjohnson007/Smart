package com.sampleProject.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Configuration class managed by spring.
 *
 * @param name
 * @param age
 * @param address
 */

record Person(String name, int age, Address address) {
}

record Address(String firstLine, String city) {
}

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Johnson";
    }

    @Bean
    public int age() {
        return 22;
    }

    @Bean
    public Person person() {
        return new Person("Sharon", 23, new Address("Perungudi", "TamilNadu"));
    }

    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("Tirunelveli", " TamilNadu");
    }

    @Bean
    public Address address1() {
        return new Address("TamilNadu", " India");
    }

    @Bean
    public Address address2() {
        return new Address("Bangalore", " India");
    }

    @Bean
    public Person personToMethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameter(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }
}
