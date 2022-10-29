package patron.strategy;

public class Seleccion implements ArrayOrdenar {
    @Override
    public int[] ordenar(int arrayOrdenar[]) {  
    int n = arrayOrdenar.length;
    int m;
        for (int i = 0; i < n-1; i++){
            m = i;
            for (int j = i+1; j < n; j++){
                if (arrayOrdenar[j] < arrayOrdenar[m]){
                    m = j;
                }
            }
            int temp = arrayOrdenar[m];
            arrayOrdenar[m] = arrayOrdenar[i];
            arrayOrdenar[i] = temp;
        }
        return arrayOrdenar;
    }
}
