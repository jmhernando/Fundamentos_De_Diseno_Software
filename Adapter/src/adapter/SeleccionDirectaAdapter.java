
package adapter;

import java.util.ArrayList;

public class SeleccionDirectaAdapter implements Objetivo{
    
    private SeleccionDirecta seleccionDirecta;
    private ArrayList<Integer> miLista = new ArrayList();
    private int vector[]= new int[miLista.size()];
    
    public SeleccionDirectaAdapter(SeleccionDirecta seleccionDirecta){
        this.seleccionDirecta = seleccionDirecta;
        System.out.println("Se ha creado un adaptador para seleccion directa.");
    }
    
    @Override
    public void ordena(ArrayList <Integer> a){
        SeleccionDirecta ordenacion = new SeleccionDirecta();
                
        vector = a.stream().mapToInt(Integer::intValue).toArray();
                
        ordenacion.ordena(vector);
    }
    
     public ArrayList<Integer> getSeleccionDirectaAdapater(){
        for(int i=0; i<vector.length;i++){
            miLista.add(vector[i]);
        }
        return miLista;
    }
}
