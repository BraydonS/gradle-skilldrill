package edu.isu.cs.cs2263;

public class Course {
    //Initial variables
    private int number;
    private String subject;
    private String title;

    public Course(){};

    //Constructor
    public Course(int n, String s, String t){
        this.number = n;
        this.subject = s;
        this.title =t;
    }

    //Setter and Getter Methods
    public void setNumber(int num){
        number = num;
    }

    public int getNumber(){
        return number;
    }

    public void setSubject(String subj){
        subject = subj;
    }

    public String getSubject(){
        return subject;
    }

    public void setTitle(String titl){
        title = titl;
    }

    public String getTitle(){
        return title;
    }

    @Override
    public String toString(){
        return (subject + " " + number + " " + title);
    }


}
