package inversiondedepenencias;

import java.util.Scanner;

public class Test {

    
    public static void main(String[] args) {
        double importe, porcentaje;
        int eleccion1, eleccion2;
        
        CalculoIva iva = null;
        CalculoDeduccion deduccion = null;
        System.out.println("-----------Factura Básica-----------");
        Scanner entrada = new Scanner(System.in);
      
        FacturaFactorizada facturaBasica = new FacturaFactorizada(new IvaNormal(), new Deduccion());
        
        System.out.println("Introduce el importe de la Factura: ");
        importe = entrada.nextDouble();
        facturaBasica.setImporteFactura(importe);
        System.out.println("Introduce porcentaje de la Deducción Normal: ");
        porcentaje = entrada.nextDouble();
        facturaBasica.setPorcentajeDeduccion(porcentaje);
        System.out.println("Importe total de la factura: "+facturaBasica.CalcularTotal());
        System.out.println("Valor del IVA Normal: "+facturaBasica.getImporteIVA());
        System.out.println("Valor de la Deducción Normal: "+facturaBasica.getImporteDeduccion());
                
        System.out.println("-----------Factura con bonificación aplicada-----------");
        FacturaFactorizada facturaRebajas = new FacturaFactorizada(new IvaReducido(), new DeduccionBonificada());
        System.out.println("Introduce el importe de la Factura: ");
        importe = entrada.nextDouble();
        facturaRebajas.setImporteFactura(importe);
        System.out.println("Introduce porcentaje de la Deducción Bonificada: ");
        porcentaje = entrada.nextDouble();
        facturaRebajas.setPorcentajeDeduccion(porcentaje);
        System.out.println("Importe total de la factura: "+facturaRebajas.CalcularTotal());
        System.out.println("Valor del IVA Reducida: "+facturaRebajas.getImporteIVA());
        System.out.println("Valor de la Deducción Bonificada: "+facturaRebajas.getImporteDeduccion());
                
        System.out.println("-----------Factura a tu elección-----------");
        
        System.out.println("¿Qué tipo de IVA quieres en tu factura personalizada?");
            
            System.out.println("- IVA Normal(1)");
            System.out.println("- IVA Reducido(2)");
            eleccion1 = entrada.nextInt();
            System.out.println("¿Qué tipo de Deducción quieres en tu factura personalizada?");
            
            System.out.println("- Deducción Normal(1)");
            System.out.println("- Deducción Bonificada(2)");
            eleccion2 = entrada.nextInt();
            
            switch(eleccion1){
                case 1:
                    iva = new IvaNormal();
                    break;
                case 2:
                    iva = new IvaReducido();
                    break;
            }
            switch(eleccion2){
                case 1:
                    deduccion = new Deduccion();
                    break;
                case 2:
                    deduccion = new DeduccionBonificada();
                    break;
            }
            
            FacturaFactorizada facturaEleccion = new FacturaFactorizada(iva, deduccion);
                System.out.println("Introduzca importe de la factura: ");
                importe = entrada.nextDouble();
                facturaEleccion.setImporteFactura(importe);
                System.out.println("Importe total de la factura: "+facturaEleccion.CalcularTotal());
                System.out.println("Importe del IVA Reducida: "+facturaEleccion.getImporteIVA());
                System.out.println("\nImporte de la Deducción Bonificada: "+facturaEleccion.getImporteDeduccion());
                System.out.println("----------------------------------------------------------------------------");
    }
    
}
