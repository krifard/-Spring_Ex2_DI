package com.spring;


import java.util.List;

public class Lists {
    public List<Student> ListOfStudents;

    public List<Location> getListOfLocations() {
        return ListOfLocations;
    }

    public void setListOfLocations(List<Location> listOfLocations) {
        ListOfLocations = listOfLocations;
    }

    public List<Location> ListOfLocations;

    public List<Student> getListOfStudents() {
        return ListOfStudents;
    }

    public void setListOfStudents(List<Student> listOfStudents) {
        ListOfStudents = listOfStudents;
    }
}
