package inversiondedepenencias;

import java.time.LocalDateTime;

 public class FacturaFactorizada{

 //Instanciamos las interfaces para el constructor
     private CalculoIva calculoIVA;
     private CalculoDeduccion calculoDeduccion;
     
 private String codigo;
 private LocalDateTime fechaEmision;
 private double importeFactura ;
 private double importeIVA;
 private double importeDeduccion;
 private double importeTotal;
 private double porcentajeDeduccion;
 
 /*añadir get y set para todos los atributos*/
  public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setFechaEmision(LocalDateTime fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
 public void setImporteFactura(double importe){
     this.importeFactura=importe;
 }
  public void setImporteIVA(double importe){
     this.importeIVA=importe;
 }
 public double getImporteIVA(){
     return importeIVA;
 }
  public void setImporteDeduccion(double importe){
     this.importeDeduccion=importe;
 }
 public double getImporteDeduccion(){
     return importeDeduccion;
 }
  public void setImporteTotal(double importe){
     this.importeTotal=importe;
 }

 public void setPorcentajeDeduccion(double porcentaje){
     this.porcentajeDeduccion=porcentaje;
 }

 //Constructor para eliminar dependencias
 public FacturaFactorizada(CalculoIva iva, CalculoDeduccion deduccion){
     this.calculoIVA = iva;
     this.calculoDeduccion = deduccion;
 }

 // Método que calcula el total de la factura
 public double CalcularTotal() {

    calculoDeduccion.setDeduccion(porcentajeDeduccion);
    importeIVA = calculoIVA.calculoIVA(importeFactura);
    importeDeduccion = calculoDeduccion.calculoDeduccion(importeFactura);
    importeTotal = importeFactura - importeDeduccion + importeIVA;
    return importeTotal;
 }
} 