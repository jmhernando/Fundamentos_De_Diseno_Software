/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorate;

import java.io.IOException;

public class CriptoReader {
    private Reader leer;
    
    public String Reader(String nombre) throws IOException{
        leer = new Reader(nombre);
        return(leer.read());
    }
    
    
}
