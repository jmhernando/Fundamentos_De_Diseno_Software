/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2fds;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author e.mellado.2019
 */
public class Tiempos {
    
    int filas, columnas;
    long[][] matriz;    
    String[] algortimos;
    
    public Tiempos(int n, int m, String texto[]){
        this.filas = n;
        this.columnas = m;
        this.algortimos = texto;
        this.matriz = new long[this.filas][this.columnas];
    }
    
    public String[] getTitulos(){
        return algortimos;
    }
    public int getFilas(){
        return filas;
    }
    public int getColumnas(){
        return columnas;
    }
    
    public void asignaValor(int nfilas,int ncolumnas,long dato){
        this.matriz[nfilas][ncolumnas] = dato;
    }
    
    public void imprimeTiempos(){
        for(int i = 0; i < matriz.length; i++){
            for(int j= 0; j < matriz.length-1 ;j++){
                System.out.println(matriz[i][j]);
            }
            System.out.println();
        }
    }
    
    public void guardarTiempos(String outputFilePath){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            for(int i=0;i<this.filas;i++){
                String fila = "";
                fila += this.algortimos[i] + ";";
                for(int j=0;j<this.columnas;j++){
                    fila += this.matriz[i][j] + ";";
                }
                fila += "\n";
                writer.write(fila);
            }
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}


