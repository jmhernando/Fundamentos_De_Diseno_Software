package patron.iterator;

public class IteratorAlumnos implements Iterator{
    //Los métodos se crean solos...
    private String[]array;
    private int contador;
    
    public IteratorAlumnos(String[]alumnos){
        this.array = alumnos;
        this.contador=0;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            this.contador=0;
        }
        this.contador++;
        return(this.array[this.contador-1]);
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
        return this.array.length;
    }

    @Override
    public void remove(int numeroBorrar) {
        for(int i = numeroBorrar;i<array.length;i++){
            this.array[i]=this.array[i+1];
        }
    }
}
