
package com.adse2509.sess04_classes_object_and_methods;

import java.util.Scanner;

/**
 * Java class to demonstrate the various methods of the {@code SimpleMath} class.
 * 
 * @author Administrator
 */
public class SimpleMathDemo {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        // Prompt the user for the values to be used in the program
        System.out.println("Please enter the first number to be used in the "
                + "calculation -> ");
        int firstNum = sc.nextInt();
        System.out.println("Please enter the second number to be used in the "
                + "calculation -> ");
        int secondNum = sc.nextInt();
        
        // Declare and instantiate a SimpleMath object
        SimpleMath sm = new SimpleMath();
        
        // Perform the variou arithmetic operation from the SimpleMath object
        long sum = sm.addNums(firstNum, secondNum);
        int difference = sm.subtractNums(firstNum, secondNum);
        long product = sm.multiplyNums(firstNum, secondNum);
        int quotient = sm.divideNums(firstNum, secondNum);
        float exponent = sm.getExponent(firstNum, secondNum);
        int remainder = sm.getModulus(firstNum, secondNum);
        
        // Display the result of the arithmetic operations
        System.out.println("-".repeat(55));
        System.out.println("Results of the various arithmetic operations.");
        System.out.println("-".repeat(55));
        System.out.printf("%d + %d = %d",firstNum, secondNum, sum);
        System.out.printf("\n%d - %d = %d",firstNum, secondNum, difference);
        System.out.printf("\n%d x %d = %d",firstNum, secondNum, product);
        System.out.printf("\n%d ÷ %d = %d",firstNum, secondNum, quotient);
        System.out.printf("\n%d ^ %d = %.1f",firstNum, secondNum, exponent);
        System.out.printf("\n%d %% %d = %d",firstNum, secondNum, remainder);
        System.out.println("\n" + "-".repeat(55));
    
        // Close the input stream
        sc.close();
    }
    
}
    

