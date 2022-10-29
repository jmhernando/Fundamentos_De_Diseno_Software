package patron.iterator;

import java.util.Scanner;

public class PatronIterator {

    public static void main(String[] args) throws Exception{
        Login login = new Login(3);
        Scanner respuesta = new Scanner(System.in);
        boolean masUsuarios = true;

        System.out.println("Quieres añadir nuevos usuarios?");
        System.out.println("Introducir el modo: 1.Añadir usuario 2.No añadir usuarios, probar con la prueba.");
        int x = respuesta.nextInt();
        
        switch(x){
            case 1: 
                while(masUsuarios){
                    Scanner respuesta2 = new Scanner(System.in);
                    System.out.println("Introduce primero nombre y después, tipo de usuario...");
                    System.out.println("Hay tres tipos de usuario: administrador, profesor, alumno. Escribe correctamente el tipo para que no haya errores.");
                    System.out.println("Nombre: ");
                    String nombre = respuesta2.nextLine();
                    System.out.println("Tipo de usuario: ");
                    String tipo = respuesta2.nextLine();
                    login.añadirUsuario(nombre,tipo);
                    System.out.println("Deseas meter mas usuarios? 1.Si 2.No");
                    int mas = respuesta2.nextInt();
                    if(mas==1){
                        masUsuarios=true;
                    }
                    else{
                        masUsuarios=false;
                    }
                }
                break;
            case 2: 
                break;    
        }
        login.añadirUsuario("Jose","administrador");
        login.añadirUsuario("Erik","profesor");
        login.añadirUsuario("Sarai","alumno");
        
        login.añadirUsuario("Erik","administrador");
        login.añadirUsuario("Sarai","profesor");
        login.añadirUsuario("Jose","alumno");
        
        login.añadirUsuario("Sarai","administrador");
        login.añadirUsuario("Jose","profesor");
        login.añadirUsuario("Erik","alumno");
        
        login.imprime(3);
    }
   
    
}
