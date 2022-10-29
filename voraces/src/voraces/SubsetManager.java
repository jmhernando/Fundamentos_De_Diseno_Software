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
public class SubsetManager {
    private ArrayList<Subset> subsets;
    public SubsetManager() {
        this.subsets = new ArrayList<Subset>();
    }
    public SubsetManager(ArrayList<String> nodes) {
        this();
        for (String node : nodes) {
            Subset subset = new Subset();
            subset.AddNode(node);
            this.subsets.add(subset);
        }
    }
    
    public boolean FindSourceAndDestinationInSubsets(Edge edge) {
        for (Subset subset : this.subsets) {
            if (subset.FindBoth(edge.getSource(), edge.getDestination())) {
                return true;
            }
        }
        return false;

    }
    
    public void UpdateSubsetsWithEdge(Edge edge) {
        Subset sourceSubset = this.findSubsetOf(edge.getSource());
        Subset destinationSubset = this.findSubsetOf(edge.getDestination());
        Subset union = new Subset(sourceSubset, destinationSubset);
        this.subsets.add(union);
        this.subsets.remove(sourceSubset);
        this.subsets.remove(destinationSubset);
    }
    private Subset findSubsetOf(String node) {
        for (Subset subset : this.subsets) {
            if (subset.Find(node)) {
            return subset;
            }
        }
        return new Subset();
    }
}
