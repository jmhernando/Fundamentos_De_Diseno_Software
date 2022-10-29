/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voraces;

import java.util.ArrayList;

/**
 *
 * @author e.mellado.2019
 */
public class TicketToRide extends EdgeComparator{
    public ArrayList<Edge> edges;
    public ArrayList<String> nodos;
    Subset comprobarNodos;
    SubsetManager comprobar;
    int costeTotalAristasMin = 0;
    int costeTotalAristasMax = 0;
    
    public TicketToRide(){
        this.edges = new ArrayList<Edge>();
        this.nodos = new ArrayList<String>();
    }
    
    public void LoadMap(){
        this.edges.add(new Edge("Madrid","Lisboa",3));
        this.edges.add(new Edge("Madrid","Cádiz",3));
        this.edges.add(new Edge("Madrid","Barcelona",2));
        this.edges.add(new Edge("Madrid","Pamplona",6));
        
        this.edges.add(new Edge("Lisboa", "Cádiz", 2));
        
        this.edges.add(new Edge("Barcelona", "Pamplona", 4));
        this.edges.add(new Edge("Barcelona", "Marsella", 4));
        
        this.edges.add(new Edge("Pamplona", "Paris", 4));
        this.edges.add(new Edge("Pamplona", "Marsella", 4));
        this.edges.add(new Edge("Pamplona", "Brest", 4));
        
        this.edges.add(new Edge("Paris", "Zurich", 6));        
        this.edges.add(new Edge("Paris", "Marsella", 4));
        this.edges.add(new Edge("Paris", "Frankfurt", 3));
        this.edges.add(new Edge("Paris", "Bruselas", 2));
        this.edges.add(new Edge("Paris", "Dieppe", 1));
        this.edges.add(new Edge("Paris", "Brest", 3));
        
        this.edges.add(new Edge("Zurich", "Marsella", 4));
        this.edges.add(new Edge("Zurich", "Venecia", 4));
        this.edges.add(new Edge("Zurich", "Munich", 4));
        
        this.edges.add(new Edge("Marsella", "Roma", 8));
        
        this.edges.add(new Edge("Roma", "Venecia", 2));
        this.edges.add(new Edge("Roma", "Brindisi", 2));
        this.edges.add(new Edge("Roma", "Palermo", 4));
        
        this.edges.add(new Edge("Venecia", "Zagreb", 2));
        this.edges.add(new Edge("Venecia", "Munich", 4));
        
        this.edges.add(new Edge("Zagreb", "Sarajevo", 3));
        this.edges.add(new Edge("Zagreb", "Budapest", 2));
        this.edges.add(new Edge("Zagreb", "Viena", 2));
        
        this.edges.add(new Edge("Brindisi", "Palermo", 3));
        this.edges.add(new Edge("Brindisi", "Atenas", 4));
        
        this.edges.add(new Edge("Palermo", "Esmirna", 6));
        
        this.edges.add(new Edge("Sarajevo", "Budapest", 3));
        this.edges.add(new Edge("Sarajevo", "Atenas", 4));
        this.edges.add(new Edge("Sarajevo", "Sofia", 4));
        
        this.edges.add(new Edge("Budapest", "Bucarest", 8));
        this.edges.add(new Edge("Budapest", "Kiev", 12));
        this.edges.add(new Edge("Budapest", "Viena", 1));
        
        this.edges.add(new Edge("Atenas", "Sofia", 3));
        this.edges.add(new Edge("Atenas", "Esmirna", 2));
        
        this.edges.add(new Edge("Sofia", "Bucarest", 4));
        this.edges.add(new Edge("Sofia", "Estambul", 3));
        
        this.edges.add(new Edge("Bucarest", "Sebastopol", 4));
        this.edges.add(new Edge("Bucarest", "Estambul", 3));
        this.edges.add(new Edge("Bucarest", "Kiev", 4));
        
        this.edges.add(new Edge("Sebastopol", "Estambul", 4));
        this.edges.add(new Edge("Sebastopol", "Erzurum", 4));
        this.edges.add(new Edge("Sebastopol", "Sochi", 2));
        this.edges.add(new Edge("Sebastopol", "Rostov", 4));
        
        this.edges.add(new Edge("Estambul", "Ankara", 4));
        this.edges.add(new Edge("Estambul", "Esmirna", 4));
        
        this.edges.add(new Edge("Ankara", "Esmirna", 6));
        this.edges.add(new Edge("Ankara", "Erzurum", 3));
        
        this.edges.add(new Edge("Erzurum","Sochi",6));
        
        this.edges.add(new Edge("Sochi","Rostov",2));

        this.edges.add(new Edge("Rostov","Jarkov",2));
        
        this.edges.add(new Edge("Jarkov","Kiev",4));
        this.edges.add(new Edge("Jarkov", "Moscú", 4));
        
        this.edges.add(new Edge("Kiev","Smolensk",3));
        this.edges.add(new Edge("Kiev","Vilna",2));
        this.edges.add(new Edge("Kiev","Varsovia",4));
        
        this.edges.add(new Edge("Smolensk","Moscú",2));
        this.edges.add(new Edge("Smolensk", "Vilna", 3));
        
        this.edges.add(new Edge("Moscú", "San Petersburgo", 4));
        
        this.edges.add(new Edge("Vilna","Varsovia",3));
        this.edges.add(new Edge("Vilna","San Petersburgo",4));
        this.edges.add(new Edge("Vilna","Riga",4));
        
        this.edges.add(new Edge("Varsovia","Danzig",2));
        this.edges.add(new Edge("Varsovia","Viena",4));
        this.edges.add(new Edge("Varsovia","Berlín",4));
        
        this.edges.add(new Edge("San Petersburgo","Riga",4));
        this.edges.add(new Edge("San Petersburgo", "Estocolmo", 16));
        
        this.edges.add(new Edge("Riga", "Danzig", 3));
        
        this.edges.add(new Edge("Estocolmo", "Copenhague", 3));
        
        this.edges.add(new Edge("Danzig","Berlín",4));
        
        this.edges.add(new Edge("Viena","Munich",3));
        this.edges.add(new Edge("Viena","Berlín",3));
        
        this.edges.add(new Edge("Munich","Frankfurt",2));
        
        this.edges.add(new Edge("Berlín","Frankfurt",3));
        this.edges.add(new Edge("Berlín", "Essen", 2));
        
        this.edges.add(new Edge("Frankfurt","Essen",2));
        this.edges.add(new Edge("Frankfurt","Amsterdam",2));
        this.edges.add(new Edge("Frankfurt","Bruselas",2));
        
        this.edges.add(new Edge("Essen","Copenhague",3));
        this.edges.add(new Edge("Essen", "Amsterdam", 3));
        
        this.edges.add(new Edge("Amsterdam", "Bruselas", 1));
        this.edges.add(new Edge("Amsterdam", "Londres", 2));
        
        this.edges.add(new Edge("Bruselas","Dieppe",2));
        
        this.edges.add(new Edge("Londres","Edimburgo",4));
        this.edges.add(new Edge("Londres","Dieppe",2));
        
        this.edges.add(new Edge("Dieppe","Brest",2));
        
        this.fillNodes();
        
    }
    
    public void fillNodes(){
        for(Edge edges : this.edges){
            if (!this.nodos.contains(edges.getSource())) {
                this.nodos.add(edges.getSource());
            }
            if (!this.nodos.contains(edges.getDestination())) {
                this.nodos.add(edges.getDestination());
            }
        }
        System.out.println("NODES: " + this.nodos.size());
    }
    
    public void CalcMinSpanningTree(){
        int y = 0;
        for(int i =0; i< this.edges.size()-1;i++){
                int x = compare(this.edges.get(i),this.edges.get(i+1));
                if (x==1){
                    Edge comodin = new Edge(this.edges.get(i).getSource(),this.edges.get(i).getDestination(),this.edges.get(i).getLength());
                    this.edges.set(i, this.edges.get(i+1));
                    this.edges.set(i+1, comodin);
                    y++;
                }
        }
        if(y>0)CalcMinSpanningTree();
        else{
            
            comprobar = new SubsetManager(this.nodos);
            
            //Una vez ordenado el ArrayList, vamos a comprobar si la arista forma parte del grafo total.
            if(this.nodos.size()<this.edges.size()){
                for(int i=0;i<=this.edges.size()-1;i++){
                    boolean x= comprobar.FindSourceAndDestinationInSubsets(this.edges.get(i));
                    if(x==false){
                        //Una vez comprobado metemos la arista en el camino.
                        comprobar.UpdateSubsetsWithEdge(this.edges.get(i));
                        System.out.println("Se añade la siguiente arista al camino mínimo: " + this.edges.get(i).getSource()+ " a: "+ this.edges.get(i).getDestination());
                        costeTotalAristasMin += this.edges.get(i).getLength();
                    }
                }
                System.out.println("\n El peso de este recorrido será un total de: "+ costeTotalAristasMin);
            }
            else System.out.println("Hay mas nodos que Aristas.");
        }
    }
    
    
    public void CalcMaxSpanningTree(){
        int y = 0;
        for(int i =0; i< this.edges.size()-1;i++){
                int x = compare(this.edges.get(i),this.edges.get(i+1));
                if (x==-1){
                    Edge comodin = new Edge(this.edges.get(i).getSource(),this.edges.get(i).getDestination(),this.edges.get(i).getLength());
                    this.edges.set(i, this.edges.get(i+1));
                    this.edges.set(i+1, comodin);
                    y++;
                }
        }
        if(y>0)CalcMaxSpanningTree();
        else{
            
            comprobar = new SubsetManager(this.nodos);
            
            //Una vez ordenado el ArrayList, vamos a comprobar si la arista forma parte del grafo total.
            //Función solución
            if(this.nodos.size()<this.edges.size()){
                for(int i=0;i<=this.edges.size()-1;i++){
                    //Función de factibilidad: 
                    boolean x= comprobar.FindSourceAndDestinationInSubsets(this.edges.get(i));
                    if(x==false){
                        //Una vez comprobado metemos la arista en el camino.
                        //Función selección:
                        comprobar.UpdateSubsetsWithEdge(this.edges.get(i));
                        System.out.println("Se añade la siguiente arista al camino máximo: " + this.edges.get(i).getSource()+ " a: "+ this.edges.get(i).getDestination());
                        //Función objetivo:
                        costeTotalAristasMax += this.edges.get(i).getLength();
                    }
                }
                System.out.println("\n El peso de este recorrido será un total de: "+ costeTotalAristasMax);
            }
            else System.out.println("Hay mas nodos que Aristas.");
        }
    }
}