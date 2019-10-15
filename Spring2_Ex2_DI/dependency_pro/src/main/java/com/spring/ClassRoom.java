package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.*;

public class ClassRoom {
    public Mentor getMentor() {
        return mentor;
    }
    @Autowired
    @Qualifier("m1")
    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public Mentor mentor;
    public List<Location> getLocation() {
        return location;
    }

    @Autowired
    @Qualifier("l1")
    public void setLocation(List<Location> location) {
        this.location = location;
    }

    public List<Location> location;


    public List<Student> getStudent() {
        return student;
    }

    @Autowired
    @Qualifier("s1")
    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public List<Student> student;

    public void ShowMentorInfo()
    {
        System.out.println("Name_ Of_Mentor: " + mentor.getName());
        System.out.println("MentorId: "+ mentor.getMentorId());
        System.out.println("Age: "+mentor.getAge());
        System.out.println("---------------");
    }

    public void ShowStudentInfo()
    {
        for(Student stu:student)
        {
            System.out.println("Name_Of_Student: " + stu.getName());
            System.out.println("RollNo: "+ stu.getStudentId());
            System.out.println("Age: "+stu.getAge());
            System.out.println("---------------");
        }


    }
    public void ShowLocationInfo()
    {
        for (Location loc:location)
        {
            System.out.println("Area: " + loc.getArea());
            System.out.println("City: " + loc.getCity());
            System.out.println("---------------");


        }

    }
    public void ObjectMatcher()
    {
        if(mentor.hashCode()==student.hashCode() && mentor.equals(student))
        {
            System.out.println("Student and Mentor are the same");

        }
        else
        {
            System.out.println("Student and Mentor are Different");
        }
    }


}
