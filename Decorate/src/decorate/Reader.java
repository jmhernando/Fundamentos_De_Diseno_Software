/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorate;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Reader {
    
    private String nombre;
    private boolean error = false;
    
    public Reader(String s){
        this.nombre= s + ".txt"; //Actualiza el nombre introducido para que tenga la extensión .txt y no haga falta escribirla
    }
    
    public String read() throws IOException{
        String s = " ";
        try{
            FileReader file = new FileReader(this.nombre);
            BufferedReader bufer = new BufferedReader(file);  
        
            int letraAplazada = 0;
            
            while(letraAplazada != -1){
                if(letraAplazada!=-1){
                    letraAplazada = bufer.read();
                    s=s+((char)(letraAplazada-1)); //Descifra el código, aplazado una posición
                }
            }
        }
        catch(Exception e){
            System.out.println("Error - No existe el fichero o está corrupto");
            this.error=true;
        }
        return(s.substring(0,s.length()-1));
    }
    
}
