package patron.strategy;

public class OrdenarBurbuja implements ArrayOrdenar{
    
    @Override
    public int[] ordenar(int arrayOrdenar[]){
        //Es la misma manera de ordenar que la práctica de burbuja.
        int n = arrayOrdenar.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arrayOrdenar[j] < arrayOrdenar[j+1]){
                    int temp = arrayOrdenar[j];
                    arrayOrdenar[j] = arrayOrdenar[j+1];
                    arrayOrdenar[j+1] = temp;
                }
            }
        }
        return arrayOrdenar;
    }
}
