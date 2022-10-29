package patron.strategy;

public class PatronStrategy {

    public static void main(String[] args) {
        Ordenador ordenador = new Ordenador();
        OrdenarBurbuja burbuja = new OrdenarBurbuja();
        Seleccion seleccion = new Seleccion();
        int array[] = new int[100];
        //iniciamos un array de prueba por ejemplo de 100 elementos
        System.out.println("Array desordenado: ");
        for(int i=0; i<array.length; i++){
            int n = (int) (Math.random() * 10000);
            array[i] = n;
            System.out.print(n+ " ");
        }
        
        System.out.println("\n");

        
        System.out.println("Se ejecutará en el primer caso la Ordenación por burbuja. Después por selección");
        ordenador.setOrden(burbuja);
        //Una vez seleccionado el método de ordenación se ejecuta...
        System.out.println("Con el método setOrden ya hemos aclarado que queremos el método Burbuja");
        System.out.println("Ejecutando ordenación por burbuja...");
        int nuevoArrayOrdenado[]=ordenador.result(array);
        System.out.println("Se muestra el resultado a continuación...");
        ordenador.printArray(nuevoArrayOrdenado);
        System.out.println("Lo hacemos ahora con el de seleccion...");
        ordenador.setOrden(seleccion);
        int nuevoArrayOrdenadoSeleccion[]= ordenador.result(array);
        System.out.println("Imprimimos el nuevo array ordenado por seleccion");
        ordenador.printArray(nuevoArrayOrdenadoSeleccion);
        
        
        
        
    }
    
}
