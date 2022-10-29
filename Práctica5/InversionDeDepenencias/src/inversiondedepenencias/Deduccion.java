/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversiondedepenencias;

/**
 *
 * @author e.mellado.2019
 */
public class Deduccion extends CalculoDeduccion {
    private double porcentajeDeduccion; 
    
    @Override
    public void setDeduccion(double porcentaje){
        porcentajeDeduccion = porcentaje; 
    }
    @Override
    public double calculoDeduccion(double importe){
        return (importe * porcentajeDeduccion) / 100;
    }
}
