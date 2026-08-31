
package src.com.adse2509.sess08_interfaces_and_nested_classes;

/**
 *The {@code I3DShape} interface represents a three-dimensional geometric shape. It
 * defines a contract for calculating the surface area, and volume of the shape that
 * implements it.
 * Any  class implementing this interface must provide its own implementation of the
 * {@link #calcSurfaceArea()}, and the {@link #calcVolume()} methods.
 * 
 * @author Administrator
 *  @version 1.0
 */
public interface I3DShape {
    
 /**
     * Calculates the surface area of the 3-D shape as a {@code float}
     *
     * @return the surface area of the 3-D shape as a {@code float}. The surface area is
     * typically expressed in square units (e.g., square cm, or feet).
     */
    public float calcSurfaceArea();

    /**
     * Calculates the volume of the shape as a {@code float}
     *
     * @return the volume of the 3-D shape as a {@code float}. The volume is typically
     * expressed in cubic unit (e.g. cubic cm, or feet).
     */
    public float calcVolume();
}   

