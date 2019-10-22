
package ejemplo.ordenador;
import java.util.Scanner;
public class EjemploOrdenador {

    public static void main(String[] args) {
       
        //**FALTA SCANNER TIPO SC**
                        
     	System.out.println("Tipo: ");
        String tipo = sc.nextLine();
        System.out.println("Marca: ");
        String marca = sc.nextLine();
        System.out.println("Pulgadas: ");
        float pulgadas = sc.nextFloat();
        System.out.println("Velocidad: ");
        int velocidad = sc.nextInt();
        System.out.println("Memoria: ");
        int memoria = sc.nextInt();
        
        Funcionamosar ejemplo = new Funcionamosar(new Raton(tipo), new Pantalla(marca, pulgadas), new Cpu(velocidad, memoria));
        ejemplo.amosar();
    }
}
