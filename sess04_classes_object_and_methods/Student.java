
package com.adse2509.sess04_classes_object_and_methods;

/**
 *
 * @author Administrator
 */
public class Student {

    String studentID, name;
    int age;
    char gender;

    public Student()
    {
        this.studentID = "";
        this.name = "";
        this.age=0;
        this.gender='F';
    }
    
    // Student initialiser
    public void initialiseStudent()
    {
        this.studentID = "Student-00001";
        this.name = "Student One";
        this.age=18;
    }
    
    public void displayDetails()
    {
        System.out.printf(
                """                          
                Student Details
                %s
                Name: %s 
                ID  : %s
                Age: %s 
                Gender: %s 
                %s
                          """.formatted(
                                "-".repeat(50),
                                  this.name,
                                  this.studentID,
                                  this.age,
                                  (this.gender == 'm' || this.gender == 'M'?
                        "Male" : "Female"),
                                "-".repeat(50))
        );
    }
    
    @Override
    public String toString()
    {
        return "Student Details"
                + "\n" + "-".repeat(50)
                + "\nName: " + this.name
                + "\nStudent ID: " + this.studentID
                + "\nAge: " + this.age
                + "\nGender: " + (this.gender == 'm' || this.gender == 'M'?
                        "Male" : "Female")
                + "\n" + "-".repeat(50)  ;
    }
            
            
    
}

