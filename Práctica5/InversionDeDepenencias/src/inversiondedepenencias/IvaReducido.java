package inversiondedepenencias;

public class IvaReducido implements CalculoIva{
    private final double porcentaje = 0.08;
    
    @Override
    public double calculoIVA(double importe){
        return importe * porcentaje;
    }
}
