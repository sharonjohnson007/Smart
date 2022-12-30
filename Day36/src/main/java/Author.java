package main.java;

/**
 * The student class models a student having courses and grades.
 */

public class Author {
    public static void main(String[] args) {
        Author ahTeck = new Author("Johnson", "johnsonsharon@gmail.com", 'm');
        System.out.println(ahTeck);
        ahTeck.setEmail("johnsonsharon@gmail.com");
        System.out.println(ahTeck);
        System.out.println("name is: " + ahTeck.getName());
        System.out.println("gender is: " + ahTeck.getGender());
        System.out.println("email is: " + ahTeck.getEmail());
    }

    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return name + " (" + gender + ") at " + email;
    }
}
