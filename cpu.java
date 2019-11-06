package ordenador.ejemplo;
/**
 * this class saves the cpu(memory and speed)
 *
 * @author sverdecadilla
 */
public class cpu {

    private int speed;
    private int memory;
    
    /**
     * Default constructor without parameters
     */
    public cpu() {
    }
/**
 * cpu has the parameters of speed(int) and memory(int)
 * 
 * @param speed
 * @param memory 
 */
    public cpu(int speed, int memory) {
        this.memory = memory;
        this.speed = speed;
    }
    /**
     * Set of memory values
     */
    public void setmemory() {
        this.memory = memory;
    }
    /**
     * Get of memory values, returns (memory)
     *
     * @return
     */
    public int getmemory() {
        return memory;
    }
    /**
     * Set of speed values
     */
    public void setspeed() {
        this.speed = speed;
    }
    /**
     * Get of speed values, returns (speed)
     *
     * @return
     */
    public int getspeed() {
        return speed;
    }
}
