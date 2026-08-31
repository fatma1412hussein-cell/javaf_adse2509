
package com.adse2509.sess03_selection_and_iteration;

/**
 *
 * @author Administrator
 */
public class StarPatternDowhile {

     // main method begins program execution
    public static void main(String[] args)
    {
        // Variables to be used in the program
        int row = 1, col;
        do // outer loop: control lines/rows
        {            
            col = 1;
            do  // inner loop: control number of "*"s printed
            {                
                System.out.printf("* ");
                col++;
            } while (col <= row);
            System.out.println();
            row++;
        } while (row <= 5);
    }

}
    

