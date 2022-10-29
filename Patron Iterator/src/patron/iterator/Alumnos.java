/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron.iterator;

/**
 *
 * @author Jose Manuel
 */
public class Alumnos {
    private final String[] alumnos;
    private final int tamañoArray;
    private int limite = 0;
    
    public Alumnos(int t){
        this.tamañoArray = t;
        this.alumnos = new String[t];
    }
    public void añadirAlumno(String n){
        if(this.limite<this.getTamañoArray()){
            this.alumnos[this.limite] = n;
            limite++;
        }
        else{
            System.out.println("Se ha excedido el número máximo de registros.");
        }
    }
    public int getTamañoArray(){
        return tamañoArray;
    }
    public Iterator crearIterador(){
        return new IteratorAlumnos(this.alumnos);
    }
  
}
