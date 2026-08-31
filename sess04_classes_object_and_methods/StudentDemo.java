
package com.adse2509.sess04_classes_object_and_methods;

/**
 * Java program to create {@code Student} objects and invoke their methods.
 * 
 * @author Administrator
 */
public class StudentDemo {

   public static void main(String[] args)
    {
        // Declare and instantiate a student object.
        Student s1 = new Student();
        
        // Initialise the student object
        s1.initialiseStudent();
        
        // Display the student's details
        //s1.displayDetails();
        System.out.println(s1);
    }
    
}