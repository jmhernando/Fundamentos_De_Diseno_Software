package practica2fds;

import java.util.Scanner;

/**
 *
 * @author Jose Manuel
 */
public class Practica2FDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Complejidad arrayAleatorio = new Complejidad(1);
        
        arrayAleatorio.ejecutarAlgoritmos();
        arrayAleatorio.imprimeTiempos();
        arrayAleatorio.guardarTiempos("Tiempos.csv");
                

        
        System.out.println("Introduce el numero de elementos del vector: ");
        Scanner respuesta = new Scanner(System.in);
        int x = respuesta.nextInt();
   
        AlgoritmoDYV arrayFijo = new AlgoritmoDYV();
        arrayFijo.arrayNuevo(x);
        arrayFijo.fuerzaBruta();
        arrayFijo.divideYvenceras(0, arrayFijo.getLongitudVector()/2);
        System.out.println("\n Numero de inversiones (Fuerza bruta): "+arrayFijo.getInversionesF());
        System.out.println("\n numero de inversiones (Divide y vencerás): "+arrayFijo.getInversionesD());
        
    } 
}