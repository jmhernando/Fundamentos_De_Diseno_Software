
package state;

import java.util.Scanner;

public class State {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Vehiculo coche = new Vehiculo();
        
        coche.estados();     
        
        String opcion = "";
        int on=0;
        while(on ==0){
            System.out.println("Elege una opcion: Arrancar/Combustible/Acelerar/Frenar/Estado ");
            opcion = scan.nextLine();
            
            switch(opcion){
                
                case "Arrancar":
                    coche.arrancar();
                    break;
                case "Combustible":
                    int litros = 0;
                    if(coche.getEstado().equals("Sin combustible")){
                        System.out.println("Que cantidad de combustibl quieres echar: ");
                        litros = scan.nextInt();
                        coche.combustible(litros);
                    }else{
                        coche.combustible(litros);
                    }
                    break;
                case "Acelerar":
                    coche.acelerar();
                    break;
                case "Frenar":
                    coche.frenar();
                    break;
                case "Estado":
                    System.out.println(coche.estados());
                    break;
            }
                
            
            
        }
    }
    
}
