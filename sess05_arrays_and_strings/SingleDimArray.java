
package com.adse2509.sess05_arrays_and_strings;

/**
 *Java program to demonstrate single dimension array using a user's rating of a product.
 * 
 * @author Administrator
 */
public class SingleDimArray {

 public static void main(String[] args)
    {
        // byte array to hold the user's rating of a product
        byte userRating[] = {4,3,5,4,3,2,5,4,3,5,3,5,4};
        
        // int value to hold the total of all the ratings
        int totalRating = 0;
        
        // looping variable
        int n = 0;
        
        // float variable to hld the mean/avg. rating
        float meanRating;
        
        // use a for loop to calculate the total rating
        for(; n < userRating.length; n++)
            totalRating += userRating[n];
        
        // calculate the products average rating
        meanRating = totalRating / (float)userRating.length;
        
        // display all user ratings of the product using a for...each loop
        System.out.println("All user ratings of the product are: ");
        for (byte curRating : userRating)
        {
            System.out.printf("%d, ", curRating); 
        }
        System.out.println("");
        
        // Display the total and average product rating
        System.out.printf(
                """
                Total Product rating: %d                
                Average Product Rating: %.1f
                """
                , totalRating,meanRating);
        
    }
    
}  
    

