
package ejemplo.ordenador;

public class Pantalla {
    private String marca;
    private float pulgadas;

    public Pantalla(){ 
    }
    
    public Pantalla(String marca, float pulgadas){
        this.marca=marca;
        this.pulgadas=pulgadas;
    }
    
    public void setmarca() {
        this.marca=marca;     
    }
    public String getmarca(){
       return marca; 
    }
    
    public void setpulgadas(){
        this.pulgadas=pulgadas;
    }
    public float getpulgadas(){
        return pulgadas;
    }
    
}
