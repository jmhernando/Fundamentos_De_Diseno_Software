package patron.iterator;

import java.util.ArrayList;

public class IteratorProfesores implements Iterator{
    private ArrayList<String>array;
    private int contador;
    
    public IteratorProfesores(ArrayList<String>arrayProfesores){
        this.array = arrayProfesores;
        contador = 0;
    }
    
    @Override
    public Object next() {
         if(this.hasNext()){
            this.contador=0;
        }
        this.contador++;
        return(this.array.get(contador-1));
    }

    @Override
    public boolean hasNext() {
        if(contador >= this.getSize()){
            return true;
        }
        else return false;
    }

    @Override
    public int getSize() {
        return this.array.size();
    }

    @Override
    public void remove(int n) {
        this.array.remove(n);
    }
  
    
}
