package edu.isu.cs.cs2263;

import java.util.*;


public class Student {
    //Initial Variables
    private String firstName;
    private String lastName;
    List<Course> courseList = new ArrayList<Course>();

    public Student(){};

    //Constructor
    public Student(String fname, String lname){
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

    public List<Course> getCourses(){
        return courseList;
    }

    public void addCourse(Course c){
        courseList.add(c);
    }

    public boolean removeCourse(Course c){
        for(int index = 0; index < courseList.size(); index++){
            if (courseList.get(index) == c){
                courseList.remove(index);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return (firstName + " " + lastName);
    }


}
