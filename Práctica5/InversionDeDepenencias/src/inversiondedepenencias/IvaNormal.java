package inversiondedepenencias;


public class IvaNormal implements CalculoIva {
    
    private final double PORCENTAJE_IVA_NORMAL = 0.16;
    
    
    public double getPorcentajeIvaNormal () {
        return PORCENTAJE_IVA_NORMAL; 
    }
    
    @Override
    public double calculoIVA(double importe){
        return importe * PORCENTAJE_IVA_NORMAL;
    }
}
