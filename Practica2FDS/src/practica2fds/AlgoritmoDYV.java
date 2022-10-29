package practica2fds;

import java.util.Stack;
import java.util.Scanner;

/**
 *
 * @author Jose Manuel
 */
public class AlgoritmoDYV {
    //Primero crearemos métodos para inicializar los arrays.
    private int [] vector;
    private int inversionesF;
    private int inversionesD;
    public int tamaño;
    Tiempos tiempos;
    int fin = 0;

    public AlgoritmoDYV(){}
    //Constructor al que le pasamos el tamaño del array 
    public AlgoritmoDYV(int tamaño){
        this.tamaño = tamaño;
        this.vector = new int[tamaño];
        
        for(int i = 0; i<vector.length; i++){ //Rellenamos el vector de valores aleatorios
            int random = (int)(Math.random()* (tamaño) +1); 
            boolean encontrado = false;
            for(int j=0;j<i;j++){
                if(this.vector[j]==random){
                    encontrado = true;
                }
            }
            if(!encontrado)this.vector[i] = random;
            else i--;
        }
    }
    
    public void arrayNuevo(int tamaño){
        this.vector = new int[tamaño];
        System.out.println("Introduce el array entero: ");

        for(int i = 0; i<vector.length; i++){ //Rellenamos el vector de valores 
            Scanner respuesta = new Scanner(System.in);
            int x = respuesta.nextInt();
            this.vector[i] = x;
        }
    }
    
    //Constructor que hace una copia de un array que pasemos.
    public AlgoritmoDYV(int array[]){
        this.vector= array;
    }
    
    //Algoritmo de fuerza bruta, compara todos los números posteriores a i del array para saber si son mayores o no.
    //Dependiendo de eso aumenta en uno el contador de inversiones. 
    public long fuerzaBruta(){
        long tiempoEjecucion;
        long comienzo = System.nanoTime();
        for(int i=0; i< this.getLongitudVector(); i++){
            for(int x = this.getLongitudVector()-1; x>=i;x--){
                if(this.vector[x]<this.vector[i])this.inversionesF= this.inversionesF +1;
            }
        }
        
        tiempoEjecucion = System.nanoTime() - comienzo;
        
        return tiempoEjecucion;
    }
    
    //Divide y venceras recursivo
    public long divideYvenceras(int inicio, int mitad){
        long tiempoEjecucion;
        long comienzo = System.nanoTime();
        //Lo que hacemos aquí es lo mismo que en el de fuerza bruta pero solo con la mitad del vector
        for(int i=inicio; i< mitad; i++){
            for(int x = mitad-1; x>=i ;x--){
                if(this.vector[i]>this.vector[x]) this.inversionesD++;
            }
        }
        fin++;
        //Aquí usamos recursividad para ahorrar tiempo.
        if(fin == 1){
             this.ordenaPorMezcla(mitad,0);
             return divideYvenceras(mitad, vector.length);
        }
        else if(fin ==2){
            this.ordenaPorMezcla(this.vector.length,this.vector.length/2);
            return divideYvenceras(0,vector.length);
        }
        tiempoEjecucion = System.nanoTime() - comienzo;
        return tiempoEjecucion;
    }
    
    
    //Ordenar las dos mitades del vector, los siguientes métodos son del proyecto anterior
    
    public void ordenaPorMezcla(int medio,int e){
        sort(vector,e,medio-1);
    }
    
    public void sort(int arr[], int l, int r){
        if(l < r){
            int m =l+ (r-l)/2;
 
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            merge(arr, l, m, r);
        }
    }
    
    public void merge(int arr[], int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
        
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        for(int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for(int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];
        
        int i = 0, j = 0;
        
        int k = l; 
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    public int getLongitudVector(){
        return this.vector.length;
    }
    
    public int getInversionesF(){
        return inversionesF;
    }
    public int getInversionesD(){
        return inversionesD;
    }
    
    //imprimir el array por pantalla
    public void imprimirArray(){
        for(int i=0;i< this.getLongitudVector();i++){
            System.out.print(this.vector[i]+" ");
        }
    }        

}