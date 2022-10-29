
package state;

public class SinCombustible implements Maquina {
 
    Vehiculo coche;
    
    public SinCombustible(Vehiculo coche){
        this.coche = coche;
    }
    
    @Override
    public void acelerar(){
        System.out.println("El coche no tiene combustible.");
    }
    
    @Override
    public void arrancar(){
        System.out.println("El coche no tiene combustible.");
    }
    
    @Override
    public void frenar(){
        System.out.println("El coche esta sin combustible");
    }
    
    @Override
    public void combustible(int litros){
        coche.setCombustible(coche.getCombustible()+litros);
        coche.setEstado(coche.getApagado());
        System.out.println("Estas echando"+ litros +" litros de combustible");
    }
    
    @Override
    public String estado(){
        return("Sin combustible.");
    }
}
