
package practica1fds;

public class Main {

    
    public static void main(String[] args) {
        
        Complejidad complejidad = new Complejidad(10);
        
        complejidad.ejecutarAlgoritmos();
        complejidad.imprimeTiempos();
        complejidad.guardarTiempos("tiempos.csv");
    }
    
}
