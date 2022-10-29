
package adapter;

import java.util.ArrayList;
import java.util.Collections;
public class MergeSort implements Objetivo{

    private ArrayList <Integer> arrayList;
     
    @Override
    public void ordena (ArrayList <Integer> a){
        Collections.sort (a);
        arrayList = new ArrayList<>(a);
    }
    
    public ArrayList getMerge(){
        return arrayList;
    }
}
