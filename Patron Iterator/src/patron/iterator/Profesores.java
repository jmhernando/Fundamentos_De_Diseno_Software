package patron.iterator;

import java.util.ArrayList;

public class Profesores {

private final ArrayList<String> profesores;     

public Profesores(){
    profesores = new ArrayList<>();
}

public void añadirProfesores(String nombre){
    profesores.add(nombre);
}
public Iterator crearIterator(){
    return (new IteratorProfesores(this.profesores));
}
}
