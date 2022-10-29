
package backtracking;

public class Backtracking {
    int [][]tableroAbierto;
    int [][]tableroCerrado;
    int alto;
    int ancho;
    
    long tiempoAbierto = 0;
    long tiempoCerrado = 0;
    
    //Constructor.
    public Backtracking(int[][] tablero1,int[][] tablero2, int x, int y){
        this.tableroAbierto = tablero1;
        this.tableroCerrado = tablero2;
        this.ancho = x;
        this.alto = y;        
    }
    
    public String hayCamino(){
        //Ambos arrays con los saltos posibles, van en parejas.
        int[] saltosEnX = new int []{-1,-2,-2,-1,1,2,2,1};
        int[] saltosEnY = new int []{2,1,-1,-2,2,1,-1,-2};
        
        //Casilla por la que se empieza.
        int casillaInicialX = 0;
        int casillaInicialY = 0;
        
        //Inicializamos el tablero con ceros.
        for(int i =0; i< ancho; i++){
            for(int j=0; j<alto; j++){
                this.tableroAbierto[i][j]=0;
                this.tableroCerrado[i][j]=0;
            }                
        }
        
        boolean abiertoExito = buscarCaminoAbierto(0,this.ancho, this.alto,casillaInicialX, casillaInicialY, saltosEnX, saltosEnY);
        boolean cerradoExito = buscarCaminoCerrado(0,this.ancho, this.alto,casillaInicialX, casillaInicialY, saltosEnX, saltosEnY);

        
        return imprimir(abiertoExito, cerradoExito);

    }
    
    /*Última casilla desde la que se empezó.
    (buscarCaminoCerrado (numero de casillas recorridas,ancho del tablero, alto del tablero, puntoActualX,puntoActualY, posible salto x, posible salto y))*/
    public boolean buscarCaminoCerrado(int n, int largo, int alto, int puntoInicioX, int puntoInicioY , int[]sumaX, int[]sumaY){
        long tiempoInicio = System.nanoTime();
        boolean exitoSalto = false;
        
        for(int x=0; x < 8 && !exitoSalto; x++){
            int newCoordX = puntoInicioX + sumaX[x];
            int newCoordY = puntoInicioY + sumaY[x];
            
            if((newCoordX>=0 && newCoordX< largo)&&(newCoordY>=0 &&newCoordY <alto)){
                
                //la n es +1 porque vuelve a la original.
                if(n ==(largo*alto)+1 && this.tableroCerrado[newCoordX][newCoordY]==1){
                    exitoSalto = true;
                }
                
                //Al principio todas las casillas están a 0
                if(this.tableroCerrado[newCoordX][newCoordY]==0){
                    //Se va llenando cada casilla con el número de salto que pega
                    this.tableroCerrado[newCoordX][newCoordY] = n;
                    //Si termina ya el tablero.
                    if(n == (largo*alto)+1){
                        exitoSalto = true;
                    }else{
                        exitoSalto = buscarCaminoCerrado(n+1, largo, alto, newCoordX, newCoordY, sumaX, sumaY);
                        if(!exitoSalto){
                            this.tableroCerrado[newCoordX][newCoordY]= 0;
                        }
                    }
                }
            }
        }
        
        tiempoCerrado =System.nanoTime()-tiempoInicio;
        return exitoSalto;
    }
    
    public boolean buscarCaminoAbierto(int n, int largo, int alto, int puntoInicioX, int puntoInicioY , int[]sumaX, int[]sumaY){
        long tiempoInicio = System.nanoTime();
        boolean exitoSalto = false;
        
        for(int x=0; x < 8 && !exitoSalto; x++){
            int newCoordX = puntoInicioX + sumaX[x];
            int newCoordY = puntoInicioY + sumaY[x];
            if((newCoordX>=0 && newCoordX< largo)&&(newCoordY>=0 &&newCoordY <alto)){
                if(this.tableroAbierto[newCoordX][newCoordY]==0){
                    this.tableroAbierto[newCoordX][newCoordY] = n;
                    
                    if(n == largo*alto){
                        exitoSalto = true;
                    }else{
                        exitoSalto = buscarCaminoAbierto(n+1, largo, alto, newCoordX, newCoordY, sumaX, sumaY);
                        if(!exitoSalto){
                            this.tableroAbierto[newCoordX][newCoordY]= 0;
                        }
                    }
                }
            }
        }
        
        tiempoAbierto =System.nanoTime()-tiempoInicio;
        return exitoSalto;
    }
    
    public String imprimir(boolean abierto, boolean cerrado){
        
        String texto = "";
//        System.out.print("Prueba para camino Abierto");
        texto = texto + "Prueba para camino Abierto"+"\r\n";
        String solucionCaminoA = "";
//        System.out.println("La dimensión del tablero es: "+this.ancho + "x"+ this.alto);
        texto = texto + "La dimensión del tablero es: "+this.ancho + "x"+ this.alto+"\r\n";
        if(abierto == true){
            solucionCaminoA = "Existe camino abierto";
        }else{
            solucionCaminoA = "No existe camino abierto";
        }
//        System.out.println("Para este tablero: " +  solucionCaminoA);
        texto = texto + "Para este tablero: " +  solucionCaminoA+"\r\n";
        texto = texto +"\r\n";    
        for(int x= 0;x<this.ancho;x++){
            for(int j=0;j<this.alto;j++){ 
//                System.out.print(this.tableroAbierto[x][j] + "    "); 
                texto = texto + this.tableroAbierto[x][j] + "    ";
            }
//            System.out.println();
            texto = texto + "\r\n";
        }
//        System.out.println("Tiempo en realizarse el camino abierto: " + tiempoAbierto + " ns");
        texto = texto +"Tiempo en realizarse el camino abierto: " + tiempoAbierto + " ns"+"\r\n";
        
        //----------------------------------------------------------------------------------------------
//        System.out.print("Prueba para camino Cerrado");
        texto = texto + "Prueba para camino Cerrado"+"\r\n";
        String solucionCaminoC = "";
//        System.out.println("La dimensión del tablero es: "+this.ancho + "x"+ this.alto);
        texto = texto +"La dimensión del tablero es: "+this.ancho + "x"+ this.alto+"\r\n";
        if(cerrado == true){
            solucionCaminoC = "Existe camino cerrado";
        }else{
            solucionCaminoC = "No existe camino cerrado";
        }
//        System.out.println("Para este tablero: " +  solucionCaminoC);
        texto = texto + "Para este tablero: " +  solucionCaminoC+"\r\n";
        texto = texto +"\r\n";    
        for(int x= 0;x<this.ancho;x++){
            for(int j=0;j<this.alto;j++){ 
//                System.out.print(this.tableroCerrado[x][j] + "    ");  
                texto = texto + this.tableroCerrado[x][j] + "    ";
            }
//            System.out.println();
            texto = texto + "\r\n";
        }
//        System.out.println("Tiempo en realizarse el camino cerrado: " + tiempoCerrado + " ns");
        texto = texto + "Tiempo en realizarse el camino cerrado: " + tiempoCerrado + " ns"+"\r\n";
        System.out.println(texto);
        return texto;
    }
}
