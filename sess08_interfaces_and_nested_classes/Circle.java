
package src.com.adse2509.sess08_interfaces_and_nested_classes;

import src.com.adse2509.sess07_inheritance_and_polymorphism.Shape;


/**
 * The {@code Circle} class represents a 2-dimensional Circle with
 * its radius. It provides methods to compute its area and Circumference.
 * 
 * @author Administrator
 */
public class Circle extends Shape implements I2DShape
{
    //=============================================================
    // Instance Fields
    //=============================================================
    /**
     * The radius of the circle (in units)
     */
    protected int radius;

    //=============================================================
    // Constructors
    //=============================================================

    public Circle()
    {
        this.radius = 0;
        this.name = "Circle";
    }

    public Circle(int radius)
    {
        this.radius = radius;
        this.name = "Circle";
    }

    //=============================================================
    // Getters & Setters
    //=============================================================
    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }


    //=============================================================
    // Instance Methods
    //=============================================================
      public float calcCircumference()
      {
          return (float)Math.PI * (this.radius * 2); // C = πd
      }
    //=============================================================
    // Overridden Methods
    //=============================================================
    /**
     *  Method to return the name of the shape as a String
     *
     * @return the shape's name as a String.
     */
    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public float calcArea()
    {
        return (float)(Math.PI * Math.pow(this.radius,2)); // A = πr²
    }

    @Override
    public String toString()
    {
        return String.format(
                """
                %s Details
                -------------------------------------------------------------
                Radius: %d,  
                Area: %.2f
                Circumference: %.2f
                -------------------------------------------------------------
                """, this.getName(), this.radius,
                this.calcArea(), this.calcCircumference()
        );
    }
}