package main.java.edu.isu.cs.cs2263;

import java.util.*;

public class Student {
    //Initial Variables
    private String firstName;
    private String lastName;
    List<Course> courseList = new ArrayList<Course>();

    //Constructor
    public Student(String fname, String lname){
        this.firstName = fname;
        this.lastName = lname;
    }

    public Student(String fname, String lname, List<Course> l){
        this.firstName = fname;
        this.lastName = lname;
    }

    //Setter and Getter Methods
    public void setFirstName(String name){
        firstName = name;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String name){
        lastName = name;
    }

    public String getLastName(){
        return lastName;
    }

    public String toString(){
        return (firstName + " " + lastName);
    }


}
