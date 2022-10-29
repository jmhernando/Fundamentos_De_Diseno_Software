
package backtracking;

import java.io.*;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args)throws IOException{
        
        Scanner scan = new Scanner(System.in);
        String fichero= "\n";
        String fichero2= "\n";
        
        //Tableros para la bateria de prueba(tabla 1)
        int[][] tableroAbiertoPrueba;
        int[][] tableroCerradoPrueba;
        //Tableros para la bateria de prueba(tabla 2)
        int[][] tableroAbiertoPrueba2;
        int[][] tableroCerradoPrueba2;
        
        int[][] tableroAbierto;
        int[][] tableroCerrado;

        System.out.println("Elije que opcion quieres probar."+"\n"+"--------------------------------"+"\n"+"(+) bateria de pruebas"+"\n"+"(+) manual"+"\n"+"(+) terminar");
        String eleccion = scan.nextLine();
        System.out.println("\n"+"--------------------------------");
        
        switch(eleccion){
            case "bateria de pruebas":
                System.out.println("Escribe (1) para elegir una bateria de pruebas de la tabla 1 o (2) para elegir la tabla 2: ");
                int eleccion2 = scan.nextInt();
                 System.out.println();
                switch(eleccion2){
                    
                    case 1:
                        /*Pruebas de tabla 1*/ 
                        String solucion = "";
                        int[] bateriaAncho = {3,4,5,6,3,3,5,3,3,3,3,4,4,5,6,8,6,6,10,12};
                        int[] bateriaLargo = {3,4,5,6,10,12,6,4,5,6,8,6,3,3,3,3,4,5,3,3};            
                        
                        for(int i= 0; i<bateriaAncho.length; i++){
                    
                            int x = bateriaAncho[i];
                            int j=bateriaLargo[i];
                            tableroAbiertoPrueba = new int[x][j];
                            tableroCerradoPrueba = new int[x][j];
                            for(int ii = 0; ii<x;ii++){
                                for(int jj = 0; jj<j; jj++){
                                    tableroAbiertoPrueba[ii][jj]=0;
                                    tableroCerradoPrueba[ii][jj]=0;
                                }
                            }
                    
                        Backtracking caballoPrueba = new Backtracking(tableroAbiertoPrueba,tableroCerradoPrueba, x,j);                                  
                        solucion = solucion + caballoPrueba.hayCamino();

                    }
                    fichero = fichero + solucion;                        
                    guardarDatosTabla1(fichero);
                    break;
                    
                    case 2:
                        /*Pruebas de tabla 2*/ 
                        String solucion2 = "";
                        int[] bateriaAncho2 = {/*7,8,*/3,/*5,6,*/6/*,4,5,8,7,14*/}; //Algunas tablas tenian tiempo de ejecución infinitos,m por lo que se han eliminado.
                        int[] bateriaLargo2 = {/*7,8,*/14,/*8,7,*/8/*,8,7,4,5,3*/};            
                        
                        for(int i= 0; i<bateriaAncho2.length; i++){
                    
                            int x = bateriaAncho2[i];
                            int j=bateriaLargo2[i];
                            tableroAbiertoPrueba2 = new int[x][j];
                            tableroCerradoPrueba2 = new int[x][j];
                            for(int ii = 0; ii<x;ii++){
                                for(int jj = 0; jj<j; jj++){
                                    tableroAbiertoPrueba2[ii][jj]=0;
                                    tableroCerradoPrueba2[ii][jj]=0;
                                }
                            }
                    
                        Backtracking caballoPrueba = new Backtracking(tableroAbiertoPrueba2,tableroCerradoPrueba2, x,j);                                  
                        solucion2 = solucion2 + caballoPrueba.hayCamino();

                    }
                    fichero2 = fichero2 + solucion2;
                    guardarDatosTabla2(fichero2);
                    break;
                }
                
                break;
                
            case "manual":
                System.out.println("¿Cual es el ancho del tablero?");
                int ancho = scan.nextInt();
                System.out.println("¿Cual es el alto del tablero?");
                int alto = scan.nextInt();
                
                tableroAbierto = new int[ancho][alto];
                tableroCerrado = new int[ancho][alto];
                
                for(int i = 0; i<ancho;i++){
                    for(int j = 0; j<alto; j++){
                        tableroAbierto[i][j]=0;
                        tableroCerrado[i][j]=0;
                    }
                }
                
                Backtracking caballo = new Backtracking(tableroAbierto,tableroCerrado, ancho,alto);                                  
                caballo.hayCamino();
                break;
                
            case "terminar":
                break;
        } 
    }
    private static void guardarDatosTabla1(String fichero)throws IOException{
            try(BufferedWriter writer = new BufferedWriter(new FileWriter("Resultados de prueba(tabla 1).txt"))){
                writer.write(fichero);
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
    }
    private static void guardarDatosTabla2(String fichero)throws IOException{
            try(BufferedWriter writer = new BufferedWriter(new FileWriter("Resultados de prueba(tabla 2).txt"))){
                writer.write(fichero);
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
    }
}
