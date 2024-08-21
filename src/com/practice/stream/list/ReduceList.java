package com.practice.stream.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Student {
    private int rollNo;
    private int age;
    private String name;
    private String city;
    private long phone;

    public Student(int rollNo, int age, String name, String city, long phone) {
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
        this.city = city;
        this.phone = phone;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", phone=" + phone +
                '}';
    }
}

// This is the driver class which will drive and filter data and perform other operations
public class ReduceList {

    public static void main(String[] args) {

        // Creating a list of students
        List<Student> students = Arrays.asList(
            new Student(1, 20, "Alice", "New York", 1234567890L),
            new Student(2, 22, "Bob", "Los Angeles", 2345678901L),
            new Student(3, 21, "Charlie", "Chicago", 3456789012L),
            new Student(4, 23, "David", "Houston", 4567890123L),
            new Student(5, 19, "Eve", "Phoenix", 5678901234L),
            new Student(6, 20, "Frank", "Philadelphia", 6789012345L),
            new Student(7, 22, "Grace", "San Antonio", 7890123456L),
            new Student(8, 21, "Hannah", "San Diego", 8901234567L),
            new Student(9, 23, "Ivy", "Dallas", 9012345678L),
            new Student(10, 24, "John", "San Jose", 1234567891L)
        );

        //find the max age of student
        int maxAge = students.stream().mapToInt(Student::getAge).max().orElse(0);
         Student maxAge2 = students.stream().max(Comparator.comparingInt(Student::getAge)).get();
        System.out.println("maxAge "+maxAge);

        //find the average age
    }
}
