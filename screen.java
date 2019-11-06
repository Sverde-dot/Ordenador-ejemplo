package ordenador.ejemplo;

/**
 * this class saves the screen(mark and inches)
 *
 * @author sverdecadilla
 */
public class screen {

    private String mark;
    private float inches;

    /**
     * Default constructor without parameters
     */
    public screen() {
    }

    /**
     * screen has the parameters of mark(String) and inches(float)
     *
     * @param mark 
     * @param inches 
     */
    public screen(String mark, float inches) {
        this.mark = mark;
        this.inches = inches;
    }

    /**
     * Set of mark values
     */
    public void setmark() {
        this.mark = mark;
    }

    /**
     * Get of mark values,returns (mark)
     *
     * @return
     */
    public String getmark() {
        return mark;
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
