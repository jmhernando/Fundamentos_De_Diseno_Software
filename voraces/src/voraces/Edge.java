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
public class Edge {
    private String source;
    private String destination;
    private int length;
    
    
    public Edge(){
        this.setSource(" ");
        this.setDestination(" ");
        this.setLength(0);    
    }
    
    public Edge(String source, String destination, int length){
        this.setSource(source);
        this.setDestination(destination);
        this.setLength(length);
    }
    
    public String getDestination(){
        return destination;
    }
    
    public void setDestination(String destination){
        this.destination = destination;
    }
    
    public String getSource(){
        return source;
    }
    public void setSource(String source){
        this.source= source;
    }
    
    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length=length;
    }
    
    
    
}
