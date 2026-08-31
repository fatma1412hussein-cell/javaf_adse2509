
package src.com.adse2509.sess08_interfaces_and_nested_classes;

/**
 *
 * @author Administrator
 */
public class Sphere extends Circle implements I3DShape
{
    //=============================================================
    // Constructors
    //=============================================================

    public Sphere()
    {
        super();
        this.name = "Sphere";
    }

    public Sphere(int radius)
    {
        super(radius);
        this.name = "Sphere";
    }

    //=============================================================
    // Overridden Methods
    //=============================================================
    @Override
    public float calcSurfaceArea()
    {
        return 4 * this.calcArea(); // A = 4πr²
    }

    @Override
    public float calcVolume()
    {
        return 4/3.0f * this.calcArea() * radius; // A = 4/3 πr³
    }

    @Override
    public String toString()
    {
        return String.format(
                """
                %s Details
                -------------------------------------------------------------
                Radius: %d,  
                Surface Area: %.2f
                Volume: %.2f
                -------------------------------------------------------------
                """, this.getName(), this.radius,
                this.calcSurfaceArea(), this.calcVolume()
        );
    }
}