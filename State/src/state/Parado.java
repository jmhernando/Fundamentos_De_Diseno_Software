
package state;

public class Parado implements Maquina{
    
    Vehiculo coche;
    
    public Parado(Vehiculo coche){
        this.coche = coche;
    }
    
    @Override
    public void acelerar(){
        if(coche.getCombustible()>=0){
            coche.setEstado(coche.getEnMarcha());
            coche.setCombustible(coche.getCombustible()-20);
            coche.setVelocidad(coche.getVelocidad()+20);
            System.out.println("El coche esta acelerando");
        }else{
            coche.setEstado(coche.getSinCombustible());
            System.out.println("No hay suficiente combustible para acelerar.");
        }
    }
    
    @Override
    public void frenar(){
        System.out.println("El oche esta parado");
    }
       
    @Override
    public void combustible(int litros){
        if(coche.getCombustible()<=20){
            System.out.println("El coche no tiene combustible.");
        }else{
            System.out.println("El coche tiene combustible");
        }
    }
    
    @Override
    public void arrancar(){
        coche.setEstado(coche.getApagado());
        System.out.println("El coche se ha apagado.");
    }
    
    @Override
    public String estado(){   
        return("El estado actual es parado");
    }
    
}
