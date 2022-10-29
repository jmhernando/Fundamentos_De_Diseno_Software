/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voraces;

/**
 *
 * @author e.mellado.2019
 */
public class Voraces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TicketToRide ticketToRide = new TicketToRide();
       // o ticketToRide.LoadEuropeMap(); para el grafo completo
        ticketToRide.LoadMap();
        
        //Método que resuelve Kruskal(expansion minima)
        ticketToRide.CalcMinSpanningTree();
        //expansion maxima, maximizar peso de las aristas.
        ticketToRide.CalcMaxSpanningTree();
        
    }
    
}
