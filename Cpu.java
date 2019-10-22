
package ejemplo.ordenador;

public class Cpu {

    private int velocidad;
    private int memoria;
    
    public Cpu(){
    }

    public Cpu(int velocidad, int memoria){
        this.memoria=memoria;
        this.velocidad=velocidad;
    }
    
    public void setmemoria(){
        this.memoria=memoria;
}
        public int getmemoria(){
        return memoria; 
    }
    public void setvelocidad(){
        this.velocidad=velocidad;
}  
    public int getvelocidad(){
        return velocidad;
    }
    
}