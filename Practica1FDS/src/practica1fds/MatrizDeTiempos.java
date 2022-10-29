
package practica1fds;

import java.io.*;

public class MatrizDeTiempos {
    int filas, columnas;
    long[][] matriz;    
    String[] titulos;
    
    public MatrizDeTiempos(int n, int m, String texto[]){
        this.filas = n;
        this.columnas = m;
        this.titulos = texto;
        this.matriz = new long[this.filas][this.columnas];
    }
    
    public String[] getTitulos(){
        return titulos;
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
            for(int j= 0; j < matriz.length ;j++){
                System.out.println(matriz[i][j]);
            }
            System.out.println();
        }
    }
    
    public void guardarTiempos(String outputFilePath){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            for(int i=0;i<this.filas;i++){
                String fila = "";
                fila += this.titulos[i] + ";";
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
