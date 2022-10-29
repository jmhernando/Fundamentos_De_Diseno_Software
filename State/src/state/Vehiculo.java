
package state;

/**
 *
 * @author eric1
 */
public class Vehiculo {
    
    private Maquina estado;
    
    private int velocidad, combustible;
    public String estadoVehiculo= " ";
    
    private final Maquina apagado;
    private final Maquina quieto;
    private final Maquina sinCombustible;
    private final Maquina enMarcha;
    
    public Vehiculo(){
        this.apagado = new Apagado(this);
        this.quieto = new Parado(this);
        this.sinCombustible = new SinCombustible(this);
        this.enMarcha = new EnMarcha(this);
        this.combustible = 100;
        this.velocidad = 0;
        
        this.estado = apagado;
    }
    
    public int getCombustible(){
        return combustible;
    }
    public void setCombustible(int litros){
        this.combustible = litros;
    }
    public int getVelocidad(){
        return velocidad;
    }
    public void setVelocidad(int velocidad){
        this.velocidad = velocidad; 
    }
    
    public Maquina getEstado(){
        return(this.estado);
    }
    public void setEstado(Maquina estado){
        this.estado = estado;
    }
    
    public Maquina getApagado(){
        return(this.estado);
    }
    public Maquina getQuieto(){
        return(this.quieto);
    }
    
    public Maquina getSinCombustible(){
        return(this.sinCombustible);
    }
    public Maquina getEnMarcha(){
        return(this.enMarcha);
    }
    
    public void arrancar(){
        estado.arrancar();
    }
    public void frenar(){
        estado.frenar();
    }
    
    public void combustible(int litros){
        estado.combustible(litros);
    }
    
    public void acelerar(){
        estado.acelerar();
    }
    
    public String estados(){
        estadoVehiculo += "Estado actual del vehiculo:\r\n";
        estadoVehiculo += "- Estado actual: ";
        estadoVehiculo += this.estado.estado() ;
        estadoVehiculo += "\r\n";
        estadoVehiculo += "- Combustible: \r\n";
        estadoVehiculo += this.combustible; 
        estadoVehiculo += "\r\n";
        estadoVehiculo += "-Velocidad actual: ";
        estadoVehiculo += this.velocidad;
        
        return estadoVehiculo;
    }
    
}
