package com.adse2509.sess02_variables_datatypes_operators;

/**
 * Java program to demonstrate the various arithmetic and compound 
 * assignment operators.
 * 
 * @author Administrator
 */
public class ArithmeticOperators
{

    public static void main(String[] args)
    {
        System.out.println("=".repeat(70));
        System.out.println("   JAVA ARITHMETIC OPERATORS DEMONSTRATION");
        System.out.println("=".repeat(70));
        
        // Variables to be used in the program
        int num1 = 10, num2 = 3;
        double num3 = 10.5f, num4 = 3.0;
        
        // ===========================================================
        // 1. Basic Arithmetic Operators +, -, x, /, and %.
        // ===========================================================
        System.out.println("=".repeat(70));
        System.out.println("   1. BASIC ARITHMETIC OPERATORS ");
        System.out.println("=".repeat(70));
        System.out.printf("%-23s  %d + %d = %d"
                + "\n%-24s %.2f + %.2f = %.2f%n", "Integer Addition",
                num1, num2, num1 + num2, "Float Addition", num3, num4, num3 + num4);
        System.out.println("=".repeat(70));
        System.out.printf("%-23s  %d - %d = %d"
                + "\n%-24s %.2f - %.2f = %.2f%n", "Integer Subtraction",
                num1, num2, num1 - num2, "Float Subtraction", num3, num4, num3 - num4);
        System.out.println("=".repeat(70));
        System.out.printf("%-23s  %d x %d = %d"
                + "\n%-24s %.2f x %.2f = %.2f%n", "Integer Multiplication",
                num1, num2, num1 * num2, "Float Multiplication", num3, num4, num3 * num4);
        System.out.println("=".repeat(70));
        System.out.printf("%-23s  %d ÷ %d = %d"
                + "\n%-24s %.2f ÷ %.2f = %.2f%n", "Integer Division",
                num1, num2, num1 / num2, "Float Division", num3, num4, num3 / num4);
        System.out.println("=".repeat(70));
        System.out.printf("%-23s  %d %% %d = %d"
                + "\n%-24s %.2f %% %.2f = %.2f%n", "Integer Modulus",
                num1, num2, num1 % num2, "Float Modulus", num3, num4, num3 % num4);
        System.out.println("=".repeat(70));
        
        // ===========================================================
        // 2. Unary operators ++(increment), --(decrement).
        // ===========================================================
        System.out.println("=".repeat(70));
        System.out.println("   2. UNARY INCREMENT & DECREMENT OPERATORS ");
        System.out.println("=".repeat(70));
        
        System.out.println("Initial value of 'num1' is: " + num1);
        System.out.println("++num1 (pre-increment) = " + (++num1)); // num1 is incremented to 11, then returns 11
        System.out.println("'num1' after pre-increment operation is: " + num1);
        System.out.println("-".repeat(55));
        System.out.println("num1++ (post-increment) = " + (num1++)); // return 11, then increment num1 to 12
        System.out.println("'num1' after post-increment operation is: " + num1);// returns 12
        System.out.println("=".repeat(70));
        
        System.out.println("--num1 (pre-decrement) = " + (--num1)); // num1 is decremented to 11, then returns 11
        System.out.println("'num1' after pre-decrement operation is: " + num1);
        System.out.println("-".repeat(55));
        System.out.println("num1-- (post-decrement) = " + (num1--)); // return 11, then decrement num1 to 10
        System.out.println("'num1' after post-decrement operation is: " + num1);// returns 10
        
        // ===========================================================
        // 3. Compound Assignment Operators +=, -=, *=, /= & %=.
        // ===========================================================
        System.out.println("=".repeat(70));
        System.out.println("   3. COMPOUND ASSIGNMENT OPERATORS ");
        System.out.println("=".repeat(70));
        
        // Re-assign and display the value of num2
        num2 = 20;
        System.out.println("Initial value of num2 is: " + num2);
        num2 += 5; // same as num2 = num2 + 5
        System.out.println("After += 5 num2 is: " + num2);
        num2 -= 3; // same as num2 = num2 - 3
        System.out.println("After -= 3 num2 is: " + num2);
        num2 *= 2; // same as num2 = num2 x 2
        System.out.println("After *= 2 num2 is: " + num2);
        num2 /= 4; // same as num2 = num2 / 4
        System.out.println("After /= 4 num2 is: " + num2);
        num2 %= 2; // same as num2 = num2 % 2
        System.out.println("After %= 2 num2 is: " + num2);
        
    }
    
}