package ordenador.ejemplo;

/**
 * this class saves the screen(mark and inches)
 *
 * @author sverdecadilla
 */
public class screen {

    private String brand;
    private float inches;

    /**
     * Default constructor without parameters
     */
    public screen() {
    }

    /**
     * screen has the parameters of brand(String) and inches(float)
     *
     * @param brand 
     * @param inches 
     */
    public screen(String brand, float inches) {
        this.brand = brand;
        this.inches = inches;
    }

    /**
     * Set of brand values
     */
    public void setbrand() {
        this.brand = brand;
    }

    /**
     * Get of brand values,returns (mark)
     *
     * @return
     */
    public String getbrand() {
        return brand;
    }

    /**
     * Set of inches values
     */
    public void setinches() {
        this.inches = inches;
    }

    /**
     * Get of inches values,returns (inches)
     *
     * @return
     */
    public float getinches() {
        return inches;
    }
}
