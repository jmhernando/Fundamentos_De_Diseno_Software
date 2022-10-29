
package adapter;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        
        Cliente principal = new Cliente();
        SeleccionDirecta seleccion = new SeleccionDirecta();        
        SeleccionDirectaAdapter adaptador = new SeleccionDirectaAdapter(seleccion);
        MergeSort merge = new MergeSort();      
        

        System.out.println("Numero de elementos del array: ");

        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        for(int i=0; i<numero; i++){
            System.out.println("Introduce el elemnto que quieres meter en esta posicion del array: ");
            int e = scan.nextInt();
            lista.add(e);
        }
        
        
        adaptador.ordena(lista);
        ArrayList<Integer> lista2 = new ArrayList<>(adaptador.getSeleccionDirectaAdapater());
        
        System.out.println("Seleccion directa utilizando su adapter.");
        
        for(int i= 0; i<lista2.size(); i++){
            System.out.print(lista2.get(i)+" ");
        }
        
        
        merge.ordena(lista);
        System.out.println("\n");
        System.out.println("Merge sort modificado:");
        for(int i=0; i<merge.getMerge().size();i++){
            System.out.print(merge.getMerge().get(i) + " ");
        }
    }
    
}
