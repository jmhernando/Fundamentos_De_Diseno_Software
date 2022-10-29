/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorate;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Writer {
    private FileWriter fichero;
    private PrintWriter print;
    
    public Writer(String n)throws IOException{
        n=n+".txt"; //Añadimos al nombre del fichero la extensión .txt
        fichero = new FileWriter(n);
        print = new PrintWriter(fichero);
    }
    
    public void escribirLetra(char c) throws IOException{
        try{
            int letra = c;
            letra = letra+1;
            print.print((char)letra);
        }
        catch(Exception e){
            System.out.println("Ha ocurrido un error");
        }
    }
    
    public void write(String texto)throws IOException{
        for(int i=0; i<texto.length();i++){
            this.escribirLetra(texto.charAt(i));
        }
        fichero.close();
    }
}
