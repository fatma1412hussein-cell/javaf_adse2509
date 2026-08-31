package com.adse2509.sess02_variables_datatypes_operators;

import java.util.Scanner;

/**
 * 
 * @author Administator
 */

public class TemperatureConverter
        
{
    // Scanner for user input
    static Scanner sc;

    // Main method
    public static void main(String[] args)
    {
        // Variables
        float fahrenheit, celsius;

        sc = new Scanner(System.in);

        // Get Fahrenheit temperature
        System.out.println("Please enter the temperature in Fahrenheit:");
        fahrenheit = sc.nextFloat();

        // Close scanner
        sc.close();

        // Convert to Celsius
        celsius = (fahrenheit - 32) / (9.0f / 5);

        // Show the result
        System.out.println("Temperature in Celsius: " + celsius + " degree celsius");
    }
}