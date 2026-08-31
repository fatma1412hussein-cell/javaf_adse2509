
package src.com.adse2509.sess07_inheritance_and_polymorphism;

/**
 * The {@code Cuboid} class represents a 3-dimensional Cuboid with its
 * length, width, and breadth (depth). It provides methods to compute
 * its surface area and volume.
 * 
 * @author Administrator
 */
public class Cuboid extends Rectangle
{
    //=============================================================
    // Instance Fields
    //=============================================================
    /**
     * The breadth of the cuboid (in units)
     */
    protected int breadth;

    //=============================================================
    // Constructors
    //=============================================================
    public Cuboid()
    {
        super();// Call/invoke the parent/super class constructor
        this.name = "Cuboid"; // Change the name from Rectangle to Cuboid
        this.breadth = 0;
    }

    public Cuboid(int width, int length, int breadth)
    {
        super(width,length);// Call/invoke the parent/super class constructor
        this.name = "Cuboid";
        this.breadth = breadth;
    }

    //=============================================================
    // Getters & Setters
    //=============================================================

    public int getBreadth()
    {
        return breadth;
    }

    public void setBreadth(int breadth)
    {
        this.breadth = breadth;
    }


    //=============================================================
    // Instance Methods
    //=============================================================

    protected long calcSurfaceArea()
    {
        return 2 * (this.calculateArea() + width * breadth + length * breadth);// 2 x (lw + wb + lb)
    }
    protected long calculateVolume()
    {
        return this.calculateArea() * this.breadth;
    }

    //=============================================================
    // Overriden Methods
    //=============================================================
    @Override
    public String toString()
    {
        return String.format(
                """
                %s Details
                -------------------------------------------------------------
                Width: %d, 
                Length: %d, 
                Breadth: %d
                Surface Area: %d
                Volume: %d
                -------------------------------------------------------------
                """, this.getName(), this.width, this.length,this.breadth,
                this.calcSurfaceArea(), this.calculateVolume()
        );
    }
}