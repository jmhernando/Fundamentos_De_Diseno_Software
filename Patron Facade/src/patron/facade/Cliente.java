package patron.facade;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Fachada fachada= new Fachada();
        
        Scanner Scan = new Scanner(System.in);
        System.out.println("Introduzca texto de prueba:");
        String texto = Scan.nextLine();
        System.out.println("\n");
        System.out.println("Imprimir prueba de lujo: \n");
        fachada.imprimeLujo(texto);
        System.out.println("\n");
        System.out.println("Imprime prueba de borrador: \n");
        fachada.imprimeBorrador(texto);
        System.out.println("\n");
        System.out.println("Imprimir prueba:\n");
        fachada.setGrapa(true);
        fachada.setTamañoHoja("A3");
        fachada.setTexto(texto);
        fachada.imprimir();
    }
}
