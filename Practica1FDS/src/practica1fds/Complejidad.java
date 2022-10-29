
package practica1fds;

public class Complejidad {
   protected int iteraciones;
   protected VectorOrdenable BurbujaMejorCaso;
   protected VectorOrdenable BurbujaPeorCaso;
   protected VectorOrdenable BurbujaCasoMedio;
   protected VectorOrdenable SeleccionMejorCaso;
   protected VectorOrdenable SeleccionPeorCaso;
   protected VectorOrdenable SeleccionCasoMedio;
   protected VectorOrdenable MergeMejorCaso;
   protected VectorOrdenable MergePeorCaso;
   protected VectorOrdenable MergeCasomedio;  
   protected String[] titulos = {"BurbujaMejorCaso","BurbujaPeroCaso","BurbujaCasoMedio","SeleccionMejorCaso","SeleccionPeorCaso","SeleccionCasoMedio","MergeMejorCaso",
            "MergePeorCaso","MergeCasomedio"};
   
   MatrizDeTiempos matriz;
   
   
   public Complejidad(int iteraciones){
       this.iteraciones = iteraciones;
   }
   
   public void ejecutarAlgoritmos(){
       matriz = new MatrizDeTiempos(this.titulos.length, this.iteraciones, titulos);
       
       for(int i=0;i<this.titulos.length;i++){
            int iteracion =1;
            for(int j=0; j<this.iteraciones;j++){
                switch(i){
                    case 0:
                        BurbujaMejorCaso= new VectorOrdenable(iteracion);
                        BurbujaMejorCaso.rellenaVectorEnOrden();
                        matriz.asignaValor(i, j, BurbujaMejorCaso.ordenaBurbuja());
                        BurbujaMejorCaso.borrarVector();
                        break;
                    case 1:
                         BurbujaPeorCaso= new VectorOrdenable(iteracion);
                        BurbujaPeorCaso.rellenaVectorInverso();
                        matriz.asignaValor(i, j, BurbujaPeorCaso.ordenaBurbuja());
                        BurbujaPeorCaso.borrarVector();
                        break;
                    case 2:
                         BurbujaCasoMedio= new VectorOrdenable(iteracion);
                        BurbujaCasoMedio.rellenaVectorAleatorio();
                        matriz.asignaValor(i, j, BurbujaCasoMedio.ordenaBurbuja());
                        BurbujaCasoMedio.borrarVector();
                       break;
                    case 3:
                       SeleccionMejorCaso= new VectorOrdenable(iteracion);
                        SeleccionMejorCaso.rellenaVectorEnOrden();
                        matriz.asignaValor(i, j, SeleccionMejorCaso.ordenaSeleccion());
                        SeleccionMejorCaso.borrarVector();
                        break;
                    case 4:
                         SeleccionPeorCaso= new VectorOrdenable(iteracion);
                        SeleccionPeorCaso.rellenaVectorInverso();
                        matriz.asignaValor(i, j, SeleccionPeorCaso.ordenaSeleccion());
                        SeleccionPeorCaso.borrarVector();
                        break;
                    case 5:
                         SeleccionCasoMedio= new VectorOrdenable(iteracion);
                        SeleccionCasoMedio.rellenaVectorAleatorio();
                        matriz.asignaValor(i, j, SeleccionCasoMedio.ordenaSeleccion());
                        SeleccionCasoMedio.borrarVector();
                       break;
                       case 6:
                       MergeMejorCaso= new VectorOrdenable(iteracion);
                        MergeMejorCaso.rellenaVectorEnOrden();
                        matriz.asignaValor(i, j, MergeMejorCaso.ordenaMerge());
                        MergeMejorCaso.borrarVector();
                        break;
                    case 7:
                         MergePeorCaso= new VectorOrdenable(iteracion);
                        MergePeorCaso.rellenaVectorInverso();
                        matriz.asignaValor(i, j, MergePeorCaso.ordenaMerge());
                        MergePeorCaso.borrarVector();
                        break;
                    case 8:
                         MergeCasomedio= new VectorOrdenable(iteracion);
                        MergeCasomedio.rellenaVectorAleatorio();
                        matriz.asignaValor(i, j, MergeCasomedio.ordenaMerge());
                        MergeCasomedio.borrarVector();
                       break;
                        
                        
                }
                iteracion+=1;
            }
            
        }
   }
   
   public void imprimeTiempos(){
       matriz.imprimeTiempos();
   }
   
   public void guardarTiempos(String outputFilePath){
       matriz.guardarTiempos(outputFilePath);
   }
}
