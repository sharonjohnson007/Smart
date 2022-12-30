package main.java;

/**
 * The student class models a student having courses and grades.
 * The Student class, subclass of Person.
 */

public class Student extends Person {
    public static void main(String[] args) {
        Student ahTeck = new Student("Sharon", "1 Happy Ave");
        System.out.println(ahTeck);
        ahTeck.setAddress("8 Kg Java");
        System.out.println(ahTeck);
        System.out.println(ahTeck.getName());
        System.out.println(ahTeck.getAddress());
        ahTeck.addCourseGrade("IM101", 89);
        ahTeck.addCourseGrade("IM102", 57);
        ahTeck.addCourseGrade("IM103", 96);
        ahTeck.printGrades();
        System.out.printf("The average grade is %.2f%n", ahTeck.getAverageGrade());
    }

    private String name;
    private String address;
    private String[] courses;
    private int[] grades;
    private int numCourses;
    private static final int MAX_COURSES = 30;

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        ++numCourses;
    }

    public void printGrades() {
        System.out.print(this);
        for (int i = 0; i < numCourses; ++i) {
            System.out.print(" " + courses[i] + ":" + grades[i]);
        }
        System.out.println();
    }

    public double getAverageGrade() {
        int sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }
        return (double) sum / numCourses;
    }
}
