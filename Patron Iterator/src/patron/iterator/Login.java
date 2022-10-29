
package patron.iterator;

public class Login {
    Administradores admin;
    Alumnos alumno;
    Profesores profesor;
    private int contador;
    
    public Login(int tamañoArray){
        this.admin = new Administradores();         //No necesita parámetro
        this.alumno = new Alumnos(tamañoArray);     //Necesita pasarle un parámetro
        this.profesor = new Profesores();           //No necesita parámetro
    }
    
    public void añadirUsuario(String nombre, String t){
        switch(t){
            case "alumno":
                alumno.añadirAlumno(nombre);
                break;
            case "administrador":
                admin.addLast(nombre);
            case "profesor":
                profesor.añadirProfesores(nombre);
        }
    }
    public void imprime(int n) throws Exception{
        Iterator iter;
        
        IteratorAdministrador iterAdmin;
        boolean siempre = true;
        if(n<=0){
            while(true){
                System.out.println("Mostrando listas...");
                System.out.println("Alumnos: ");
                iter = alumno.crearIterador();
                for(int j=0; j<=iter.getSize();j++){
                    System.out.println("\n"+ iter.next());
                }
                System.out.println("Profesores: ");
                iter = profesor.crearIterator();
                for(int j=0; j<=iter.getSize();j++){
                    System.out.println("\n"+ iter.next());
                }
                System.out.println("ADministradores: ");
                iterAdmin = admin.crearIterator();
                for(int j=0; j<=iterAdmin.getSize();j++){
                    System.out.println("\n"+iterAdmin.next());
                }
            }
        }
        
        else{
            System.out.println("Mostrando listas...");
                System.out.println("Alumnos: ");
                iter = alumno.crearIterador();
                for(int i = 0;i<n; i++){
                    this.contador = i+1;
                    System.out.println("Número de recorridos: " + contador);
                    for(int j=0; j<iter.getSize();j++){
                        System.out.println("\n"+ iter.next());
                    }
                }  
                System.out.println("Profesores: ");
                iter = profesor.crearIterator();
                for(int i = 0;i<n; i++){
                    this.contador = i+1;
                    System.out.println("Número de recorridos: " + contador);
                    for(int j=0; j<iter.getSize();j++){
                        System.out.println("\n"+ iter.next());
                    }
                } 
                System.out.println("ADministradores: ");
                iterAdmin = admin.crearIterator();
                for(int i = 0;i<n; i++){
                    this.contador = i+1;
                    System.out.println("Número de recorridos: " + contador);
                    for(int j=0; j< iterAdmin.getSize();j++){
                        System.out.println("\n"+iterAdmin.next());
                    }
                } 
        }
        
    }
    
}
