/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2fds;


public class Complejidad {
   protected int iteraciones;
   protected AlgoritmoDYV fuerzaBruta;
   protected AlgoritmoDYV divideYvenceras;
   protected String[] titulos = {"Fuerza Bruta", "Divide y venceras"};
  
   Tiempos matriz;
   
   
   public Complejidad(int iteraciones){
       this.iteraciones = iteraciones;
   }
   
   public void ejecutarAlgoritmos(){
       matriz = new Tiempos(this.titulos.length, this.iteraciones, titulos);
       
       
           AlgoritmoDYV calculo = new AlgoritmoDYV(6);
//           AlgoritmoDYV calculo1 = new AlgoritmoDYV(12);
//           AlgoritmoDYV calculo2 = new AlgoritmoDYV(20);
//           AlgoritmoDYV calculo3 = new AlgoritmoDYV(54);
//           AlgoritmoDYV calculo4 = new AlgoritmoDYV(102);
           
        
           for(int i=0;i<this.titulos.length;i++){

                for(int j=0; j<this.iteraciones;j++){
                    switch(i){
                        case 0:

                            matriz.asignaValor(i, j, calculo.fuerzaBruta());
                            break;
                        case 1:

                            matriz.asignaValor(i, j, calculo.divideYvenceras(0, calculo.getLongitudVector()/2));

                            break;
//                        case 2:
//
//                            matriz.asignaValor(i, j, calculo1.divideYvenceras());
//
//                            break;
//                        case 3:
//
//                            matriz.asignaValor(i, j, calculo1.divideYvenceras());
//
//                            break;
//                        case 4:
//
//                            matriz.asignaValor(i, j, calculo2.divideYvenceras());
//
//                            break;
//                        case 5:
//
//                            matriz.asignaValor(i, j, calculo2.divideYvenceras());
//
//                            break;
//                        case 6:
//
//                            matriz.asignaValor(i, j, calculo3.divideYvenceras());
//
//                            break;
//                        case 7:
//
//                            matriz.asignaValor(i, j, calculo3.divideYvenceras());
//
//                            break;
//                        case 8:
//
//                            matriz.asignaValor(i, j, calculo4.divideYvenceras());
//
//                            break;
//                        case 9:
//
//                            matriz.asignaValor(i, j, calculo4.divideYvenceras());
//
//                            break;
                    }
            }
         
       }
        System.out.println("\n Numero de inversiones (Fuerza bruta): "+calculo.getInversionesF());
        System.out.println("\n numero de inversiones (Divide y vencerás): "+calculo.getInversionesD());
   }
   
   public void imprimeTiempos(){
       matriz.imprimeTiempos();
   }
   
   public void guardarTiempos(String outputFilePath){
       matriz.guardarTiempos(outputFilePath);
   }
}
