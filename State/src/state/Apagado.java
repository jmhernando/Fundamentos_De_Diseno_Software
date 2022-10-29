
package state;

public class Apagado implements Maquina{
    
    Vehiculo coche;
    
    public Apagado(Vehiculo coche){
        this.coche = coche;
    }
    
    @Override
    public void acelerar(){
        System.out.println("El vehiulo esta apagado, debe encerderlo antes de acelerar.");
        
    }
    
    @Override
    public void frenar(){
        System.out.println("El vehiculo esta apagado, debe encenderlo para frenar");
    }
    
    @Override
    public void combustible(int litros){
        System.out.println("El vehiculo ya tiene combustible, no es necesario reportar.");
    }
    
    @Override
    public String estado(){
        return("Apagado");
    }
    
    @Override
    public void arrancar(){
        System.out.println("El vehiculo se ha encendido.");
        coche.setEstado(coche.getQuieto());
    }
}
