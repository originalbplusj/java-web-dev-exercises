package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public String getName() {
        return name;
    }

    public void setName(String aName){
        name = aName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }

    public int getNumberOfCredits(){
        return numberOfCredits;
    }

    public int setNumberOfCredits(int aNumberOfCredits){
        numberOfCredits = aNumberOfCredits;
        return aNumberOfCredits;
    }

    public double getGpa(){
        return gpa;
    }

    public double setGpa(double aGpa){
        gpa = aGpa;
        return aGpa;
    }



}