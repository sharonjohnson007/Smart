package main.java;

/**
 * The superclass Person has name and address.
 */
public class Person {
    public static void main(String[] args) {
        Student s1 = new Student("JOHNSON", "1 Happy Ave");
        s1.addCourseGrade("IM101", 97);
        s1.addCourseGrade("IM102", 68);
        s1.printGrades();
        System.out.println("Average is " + s1.getAverageGrade());
        Teacher t1 = new Teacher("Paul Tan", "8 sunset way");
        System.out.println(t1);
        String[] courses = {"IM101", "IM102", "IM101"};
        for (String course : courses) {
            if (t1.addCourse(course)) {
                System.out.println(course + " added");
            } else {
                System.out.println(course + " cannot be added");
            }
        }
        for (String course : courses) {
            if (t1.removeCourse(course)) {
                System.out.println(course + " removed");
            } else {
                System.out.println(course + " cannot be removed");
            }
        }
    }

    private String name, address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name + "(" + address + ")";
    }
}
