package ordenador.ejemplo;

import java.util.Scanner;

/**
 *
 * @author sverdecadilla
 */
public class OrdenadorF {

    private mouse esMouse;
    private screen esScreen;
    private cpu esCpu;

    /**
     *Default constructor without parameters
     */
    public OrdenadorF() {

    }

    /**
     OrdenadorF has the parameters of esMouse, esScreen and esCpu
     * @param esMouse
     * @param esScreen
     * @param esCpu
     */
    public OrdenadorF(mouse esRaton, screen esPantalla, cpu esCpu) {
        this.esMouse = esMouse;
        this.esScreen = esScreen;
        this.esCpu = esCpu;
    }

    /**
     * Get of Mouse values,returns (esMouse)
     * @return
     */
    public mouse getMouse() {
        return esMouse;
    }

    /**
     * Get of Screen values,returns (esScreen)
     * @return
     */
    public screen getScreen() {
        return esScreen;
    }

    /**
     * Get of Cpu values,returns (esCpu)
     * @return
     */
    public cpu getCpu() {
        return esCpu;
    }

    /**
     *
     * @param esRaton
     */
    public void setMouse(mouse esMouse) {
        this.esMouse = esMouse;
    }

    /**
     *
     * @param esScreen
     */
    public void setScreen(screen esScreen) {
        this.esScreen= esScreen;
    }

    /**
     *
     * @param esCpu
     */
    public void setCpu(cpu esCpu) {
        this.esCpu = esCpu;
    }

    /**
     *
     */
    public void amosar() {
        System.out.println("Tipo rato: " + esMouse.gettype()+ "\n Marca pantalla: " + esScreen.getmark()+ "\n Pulgadas pantalla: " + esScreen.getinches()+ "\n Velocidade cpu: " + esCpu.getspeed()+ "\n Memoria cpu: " + esCpu.getmemory());
    }

}
