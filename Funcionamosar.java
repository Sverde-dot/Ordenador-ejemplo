
package ejemplo.ordenador;

public class Funcionamosar {
     private Raton esRaton;
    private Pantalla esPantalla;
    private Cpu esCpu;
    
    public Funcionamosar(){  
}
 public Funcionamosar(Raton esRaton, Pantalla esPantalla, Cpu esCpu){
        this.esRaton = esRaton;
        this.esPantalla = esPantalla;
        this.esCpu = esCpu;
    }
	 public Raton getRaton(){
        return esRaton;
    }
    public Pantalla getPantalla(){
        return esPantalla;
    }
    public Cpu getCpu(){
        return esCpu;
    }
    public void setRaton(Raton esRaton){
        this.esRaton = esRaton;
    }
    public void setPantalla(Pantalla esPantalla){
        this.esPantalla = esPantalla;
    }
    public void setCpu(Cpu esCpu){
        this.esCpu = esCpu;
    }
    public void amosar(){
        System.out.println("Tipo rato: "+esRaton.gettipo()+"\n Marca pantalla: "+esPantalla.getmarca()+"\n Pulgadas pantalla: "+esPantalla.getpulgadas()+"\n Velocidade cpu: "+esCpu.getvelocidad()+"\n Memoria cpu: "+esCpu.getmemoria());
    } 
}
