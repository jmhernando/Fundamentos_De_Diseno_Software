/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorate;

import java.io.IOException;

public class CriptoWriter {

private Writer escribir;

public void escribir(String nombre, String mensaje) throws IOException{
    escribir = new Writer(nombre);  //Crea el fichero.
    escribir.write(mensaje);        //Escribe el mensaje en el fichero ya cifrado.
}
}
