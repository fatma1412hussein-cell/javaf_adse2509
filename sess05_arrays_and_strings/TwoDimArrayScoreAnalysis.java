
package com.adse2509.sess05_arrays_and_strings;

import java.util.Scanner;


/**
 * Java program to demonstrate the use of arrays to analysis the score details of a class in various subjects/modules.
 * 
 * @author Administrator
 */
public class TwoDimArrayScoreAnalysis {

   public static void main(String[] args)
    {
        // Variables to be used in the program
        Scanner sc = new Scanner(System.in);
        int n = 0, a ; // Looping variables
        int numOfStudents, numOfModules; // Holds number of students and modules/subjects
        String[] studentNames, moduleNames; // String array for the names of the students & modules
        int[] totalScore, studentScore[]; // Interger array for the total and individual scores
        float meanScore[]; // Float array to hold each student's mean/avg. score
        char grade[]; // Character array to hold each student's grade
        String[] comment; // String array to hold each student's performance comment.
        
        // Prompt the user for the number of students in the class and read in their names
        System.out.println("How many students are in the class?");
        numOfStudents = sc.nextInt();
        studentNames = new String[numOfStudents]; // Instantiate the student names array
        for(; n < studentNames.length; n++)
        {
            System.out.println("Please enter the name of student " + (n + 1));
            studentNames[n] = sc.next();
        }
        
        // Prompt the user for the number of modules and read in their names
        System.out.println("How many modules/subjects are the students taking?");
        numOfModules = sc.nextInt();
        moduleNames = new String[numOfModules]; // Instantiate the module names array
        for(n = 0; n < moduleNames.length; n++)
        {
            System.out.println("Please enter the name of module " + (n + 1));
            moduleNames[n] = sc.next();
        }
        
        // Instantiate all the remaining arrays
        studentScore = new int[numOfStudents][numOfModules];
        totalScore = new int[numOfStudents];
        meanScore = new float[numOfStudents];
        grade = new char[numOfStudents];
        comment = new String[numOfStudents];
        
        // Prompt the user of each student's score in each subject/module
        for(n = 0; n < studentNames.length; n++)
        {
            totalScore[n] = 0; // Initialise each student's total score to zero
            for(a = 0; a < moduleNames.length; a++)
            {
                System.out.printf("\nPlease enter %s's score in %s -> ",
                        studentNames[n],moduleNames[a]);
                studentScore[n][a] = sc.nextInt();
                // Calculate each student's total score
                totalScore[n] += studentScore[n][a];
            }
            // Calculate each student's mean score
            meanScore[n] = totalScore[n] / (float)moduleNames.length;
            
            // Assign each student a grade based on their mean score
            if(meanScore[n] >= 70)
                grade[n] = 'A';
            else if(meanScore[n] >= 60)
                grade[n] = 'B';
            else if(meanScore[n] >= 50)
                grade[n] = 'C';
            else if(meanScore[n] >= 40)
                grade[n] = 'D';
            else 
                grade[n] = 'E';
            
            // Assign a comment based on the student's grade
            switch (grade[n])
            {
                case 'A':
                    comment[n] = "Excellent";
                    break;
                case 'B':
                    comment[n] = "Very Good";
                    break;
                case 'C':
                    comment[n] = "Good";
                    break;
                case 'D':
                    comment[n] = "Fair";
                    break;
                case 'E':
                    comment[n] = "Try Harder!";
                    break;
            }
        }
        
        sc.close(); // Close the input stream
        
        // Display the results
        System.out.printf("%-14s","Student Name");
        for(n = 0; n < moduleNames.length; n++)
        {
            System.out.printf("%-12s",moduleNames[n]);
        }
        System.out.printf("%-12s %-12s %-12s %-12s%n","Total","Average",
                "Grade","Comment");
        for (n = 0; n < studentNames.length; n++)
        {
           System.out.printf("%-14s",studentNames[n]);
            for(a = 0; a < moduleNames.length; a++)
            {
                System.out.printf("%-12d",studentScore[n][a]);
            }
            System.out.printf("%-12d %-12.1f %-12c %-12s%n",totalScore[n],
                    meanScore[n],grade[n],comment[n]);
        }
    }
    
}
    

