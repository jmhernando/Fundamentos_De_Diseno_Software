package patron.iterator;

public class IteratorAdministrador{
    Administradores admin;
    private int contador;
    
    public IteratorAdministrador(Administradores admin){
        this.admin = admin;
        this.contador = 0;
    }
    
    public Object next() throws Exception{
        if(this.hasNext()){
            this.contador=0;
        }
        this.contador++;
        return(this.admin.get(contador-1));    
    }

    public boolean hasNext() {
         if(contador >= this.getSize()){
            return true;
        }
        else return false;
    }

    public int getSize() {
        return this.admin.getSize();
    }

    public void remove(String nombre)throws Exception{
        this.admin.remove(nombre);
    }
    
}
