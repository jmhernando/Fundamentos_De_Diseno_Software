/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voraces;

import java.util.Comparator;

/**
 *
 * @author e.mellado.2019
 */
public abstract class EdgeComparator implements Comparator<Edge> {
   
    public int compare(Edge edge1, Edge edge2){
        if (edge1.getLength() == edge2.getLength())
            return 0;
        else if (edge1.getLength() > edge2.getLength())
            return 1;
        else
            return -1;
    } 
}
