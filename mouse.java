package ordenador.ejemplo;
/**
 * this class saves the mouse(type)
 *
 * @author sverdecadilla
 */
public class mouse {

    private String type;
    
/**
* Default constructor without parameters
*/
    public mouse() {
    }

    /**
     * mouse has the parameters of type(String)
     *
     * @param type
     */
    public mouse(String type) {
        this.type = type;
    }
    /**
     * Set of type values
     */
    public void settype() {
        this.type = type;
    }

    /**
     * Get of type values,returns (type)
     *
     * @return
     */
    public String gettype() {
        return type;
    }
}
