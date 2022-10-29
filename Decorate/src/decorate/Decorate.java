/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorate;

import java.io.IOException;
import java.util.Scanner;

public class Decorate {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        CriptoWriter escribirTexto = new CriptoWriter();
        CriptoReader leer = new CriptoReader();
        boolean bucle =true;
        int x;
        System.out.println("Programa de encriptación César");
        
        while(bucle == true){
            System.out.println("Que se desea hacer:\n 1: Crear un fichero 2: Leer un fichero descifrado 3: Salir del programa ");
            x = scan.nextInt();
            switch(x){
                case 1:
                    System.out.println("Nombre del fichero a crear y su texto: ");
                    System.out.println("Nombre del fichero: ");
                    Scanner scan2 = new Scanner(System.in);
                    String nombre = scan2.nextLine();
                    
                    System.out.println("Texto a encriptar: ");
                    String texto = scan2.nextLine();
                    
                    escribirTexto.escribir(nombre, texto);
                    break;
                case 2:
                    Scanner scan3 = new Scanner(System.in);
                    System.out.println("Vamos a leer decodificado el texto: ");
                    System.out.println("Nombre del fichero: ");
                    String nombre2 = scan3.nextLine();
                    System.out.println(leer.Reader(nombre2));
                    break;
                case 3: 
                    System.out.println("Saliendo del programa...");
                    bucle = false;
                    break;
                    
                    
            }
        }
        
    }
    
}
