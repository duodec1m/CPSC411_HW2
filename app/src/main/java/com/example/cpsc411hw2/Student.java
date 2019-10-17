package com.example.cpsc411hw2;

import java.util.ArrayList;

public class Student {
    protected String fName;
    protected String lName;
    protected ArrayList<CourseEnrollment> cList;

    public Student(String firstName, String lastName){
        fName = firstName;
        lName = lastName;
    }

    public String getFirstName(){
        return fName;
    }
    public String getLastName(){
        return lName;
    }
    public ArrayList<CourseEnrollment> getcList(){return cList;}

    public void setFirstName(String firstName){
        fName = firstName;
    }
    public void setLastName(String lastName){
        lName = lastName;
    }
    public void setcList(ArrayList<CourseEnrollment> courseList){cList = courseList;}
}
