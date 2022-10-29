package state;


public class EnMarcha implements Maquina {
    
    Vehiculo coche;
    
    public EnMarcha(Vehiculo coche){
        this.coche = coche;
    }
    
    @Override
    public void acelerar(){
        if(coche.getCombustible()>=20){
            System.out.println("Acelerando vehiculo.");
            coche.setVelocidad(coche.getVelocidad()+20);
            coche.setCombustible(coche.getCombustible()-20);
            System.out.println("Tu velocidad actual es de: "+ coche.getVelocidad());
        }else if((coche.getCombustible()<20)&&(coche.getCombustible()>0)){
            System.out.println("No tenemos combustible pero mantenemos la velocidad actual.");
        }else{
            System.out.println("Nos hemos quedado sin combustible.");
        }
    }
    
    @Override
    public void frenar(){
        
        if((coche.getVelocidad()-20)>0){
            coche.setVelocidad(coche.getVelocidad()-20);
            System.out.println("El coche esta frenando y tu velocidad ahora es de "+coche.getVelocidad());
        }else{
            coche.setVelocidad(0);
            coche.setEstado(coche.getQuieto());
            System.out.println("El coche ha parado");
        }
    }
    
    @Override
    public void combustible(int litros){
        System.out.println("El coche no puede repostar por qu esta en movimiento.");
    }
    
    @Override
    public void arrancar(){
        System.out.println("EL coche ya esta arrancado y en marcha.");
    }
    
    @Override
    public String estado(){
        return("Coche en Marcha.");
    }
}
