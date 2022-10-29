package patron.strategy;

public class Ordenador {
    ArrayOrdenar orden;
    
    public void setOrden(ArrayOrdenar ordenar){
        this.orden=ordenar;
    
    }
    
    public int[] result(int arrayOrdenar[]){
        return orden.ordenar(arrayOrdenar);
    }
    
    public void printArray(int arrayOrdenar[]){
        int n = arrayOrdenar.length;
        for (int i=0; i<n; ++i){
            System.out.print(arrayOrdenar[i] + " ");
        }
        System.out.println();
    }
}
