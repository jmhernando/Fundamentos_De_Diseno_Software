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
public class Subset {
    private ArrayList<String> nodes;
    
    public Subset() {
        this.nodes = new ArrayList<String>();
    }
    public Subset(Subset subset1, Subset subset2) {
        this();
        for (String node : subset1.nodes) {
            this.nodes.add(node);
        }
        for (String node : subset2.nodes) {
            this.nodes.add(node);
        }
    }
    
    public void AddNode(String node) {
        this.nodes.add(node);
    }
    public boolean Find(String node) {
        return this.nodes.contains(node);
    }
    public boolean FindBoth(String node1, String node2) {
        return this.nodes.contains(node1) && this.nodes.contains(node2);
    }
}
