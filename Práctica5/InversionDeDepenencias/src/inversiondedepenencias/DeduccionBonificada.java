package inversiondedepenencias;

public class DeduccionBonificada extends CalculoDeduccion{
      private double porcentajeDeduccion;
    
    @Override
    public void setDeduccion(double porcentaje){
        this.porcentajeDeduccion = porcentaje * 2;
    }
    @Override
    public double calculoDeduccion(double importe){
        return (importe * porcentajeDeduccion) / 100;
    }
    
}
