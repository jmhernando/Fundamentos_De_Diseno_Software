
package practica1fds;
import java.util.Random;

public class VectorOrdenable {
    private int numeroElementos;
    private /*volatile*/int[] vector;   
    
    public VectorOrdenable(int n) {
        this.numeroElementos = n;
        this.vector = new int[this.numeroElementos];
    }
    public void rellenaVectorEnOrden(){
        for(int i = 0; i < numeroElementos; i++){
            vector[i] = i;
        }
    }
    
    
    public void rellenaVectorInverso(){
        int aux= this.numeroElementos;
        for(int i = 0; i < numeroElementos; i++){                     
            this.vector[i] = aux;
            aux = aux-1;
        }
    }
    
    public void rellenaVectorAleatorio(){
        for(int i = 0; i< numeroElementos; i++){
            vector[i] = (int)(Math.random()*200000);
        }
    }
    
    public void borrarVector(){
        this.numeroElementos =0;
        this.vector = null;
    }
    
    public void imprimeVector(){
        for(int i = 0; i<vector.length; i++){
            System.out.print(vector[i] + " ");
        }
    }
    
    public long ordenaBurbuja(){
        long tiempoEjecucion;
        long comienzo = System.nanoTime();
        // ... Llamada al método...
        int n = vector.length;
        for (int i = 0; i < vector.length-1; i++) {         //Desde el principio
            for (int j = vector.length-1; j > i; j--) {     //Desde el final
                if (vector[j-1] > vector[j]) {              //Compara dos valores contiguos
                    int temp = vector[j-1];                 //Sustituye si entra al if
                    vector[j-1] = vector[j];
                    vector[j] = temp;
                }
            }
        }
        tiempoEjecucion = System.nanoTime() - comienzo;
        
        return (tiempoEjecucion);
    }
    
    public long ordenaSeleccion(){
        long tiempoEjecucion;
        long comienzo = System.nanoTime();
        // ... Llamada al método...
        int m;
        for (int i=0; i<vector.length-1; i++) {         //recorre array desde inicio
            m = i;
            for (int j=i+1; j<vector.length; j++)       //segunda posicion
                if (vector[j]<vector[m])                           
                    m = j;
                    int aux = vector[i];
                    vector[i] = vector[m];
                    vector[m] = aux;
        }
        tiempoEjecucion = System.nanoTime() - comienzo;
        
        return (tiempoEjecucion);
    }
    public long ordenaMerge() {
        long tiempoEjecucion;
        long comienzo = System.nanoTime();
        // ... Llamada al método...
        sort (vector, 0, vector.length-1);
        tiempoEjecucion = System.nanoTime() - comienzo;
        
        return (tiempoEjecucion);
    }
     public void sort(int arr[], int l, int r){
        if (l < r) {
            int m =l+ (r-l)/2;
 
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            merge(arr, l, m, r);
        }
    }
     
    public void merge(int v[], int l, int m, int r){
        int n1 = m - l +1;
        int n2= r - m;
        
        int L[] = new int [n1];
        int R[] = new int [n2];
        
        for(int i = 0; i < n1; i++){
            L[i]=v[l+1];
        }
        for(int j = 0; j<n2; j++){
            R[j] = v[m+1+j];
        }
        
        int i=0, j=0;
        
        int k= l;
        
        while(i<n1&& j<n2){
            if(L[i] <= R[j]){
                v[k]= L[i];
                i++;
            }else{
                v[k]= R[j];
                j++;
            }
            k++;
            
        }
        
        while(i<n1){
            v[k] =L[i];
            i++;
            k++;
        }
        
        while(j<n2){
            v[k]= R[j];
            j++;
            k++;
        }
    }
}
