package patron.facade;

public class Fachada {
    private boolean color;
    private String tamañoHoja;
    private boolean orden;
    private boolean grapa;
    private String texto;
    private boolean borrador;
    
    public void imprimeLujo(String texto){
        setColor(true);
        setTamañoHoja("A4");
        setOrden(true);
        setGrapa(true);
        setTexto(texto);
        imprimir();
    }
    
    public void imprimeBorrador(String texto){
        setColor(false);
        setTamañoHoja("B5");
        setTexto(texto);
        setBorrador(true);
        imprimir();
    }
    
    public boolean getColor(){
        return color;
    }
    public String getTamañoHoja(){
        return tamañoHoja;
    }
    public boolean getOrden(){
        return orden;
    }
    public boolean getGrapas(){
        return grapa;
    }
    public String getTexto(){
        return texto;
    }
    public void setColor(boolean colorTinta){
        this.color = colorTinta;
    }
    public void setTamañoHoja(String t){
        this.tamañoHoja = t;
    }
    public void setOrden(boolean o){
        this.orden = o;
    }
    public void setGrapa(boolean s){
        this.grapa = s;
    }
    public void setTexto(String t){
        this.texto = t;
    }
    public void setBorrador(boolean b){
        this.borrador = b;
    }
    
   public void imprimir() {
        if(getColor()==true){
            System.out.println("Texto en color:");
            System.out.println(texto);
        }else{
            System.out.println("Texto sin color:");
            System.out.println(texto);
        }
        String s = getTamañoHoja();
        System.out.println("Tamaño de la hoja: " + s);
        if(getGrapas()==true){
            System.out.println("Hoja grapada.");
        }
        if(getOrden()==true){
            System.out.println("Está ordenado");
        }
        
    } 
}
