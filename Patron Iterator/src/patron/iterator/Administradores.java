package patron.iterator;

public class Administradores<String> implements List_1<String>
{
    
    private SimpleNode first;
    private SimpleNode last;
    private int size;
    
   
    
    public Administradores (){
        first = null;
        last = null;
        size = 0;
    }
    
    public int getSize (){
       
        return size;
    }
    
/** añade un elemento al principio de la lista. */
public void addFirst (String element){
 SimpleNode newNode = new SimpleNode (element, first);
 first = newNode;
 if (last == null) 
    last = first;
 size++;
}



/** añade un elemento al final de la lista. */
public void addLast (String element){

SimpleNode newNode = new SimpleNode (element, null);
if (first == null) {
    last = newNode;
    first = last;}
else {
    last.setNext (newNode);
    last = newNode;
}
size++;
} 
/** añade un elemento en la posición que marca el índice.*/
public void add(String element, int index) throws Exception{

if (index>=this.getSize()) throw new Exception ("index out of bounds");

if (index==0) this.addFirst(element);
else {

 SimpleNode newNode = new SimpleNode (element,null);
 SimpleNode pivot = first;

 for (int i=0; i<index-1; i++)
  pivot = pivot.getNext();

 newNode.setNext(pivot.getNext());
 pivot.setNext(newNode);
 size++;
}


}
/** elimina el primer elemento */
public void removeFirst() throws Exception{
 if (this.isEmpty()) throw new Exception ("Can´t remove anything, empty list!");
 first = first.getNext();
 if (first==null)
    last=null;
 size--;
}

/** elimina el último elemento */
public void removeLast() throws Exception{
 SimpleNode pivot = first;
 
 if (this.isEmpty()) throw new Exception ("Can´t remove anything, empty list!");
 
 if (pivot.getNext() != null){
     while (pivot.getNext() != last)
         pivot = pivot.getNext();
     pivot.setNext(null);
    }
 else { 
     first = null;
    }
 last = pivot;
 size--;
}
/** Elimina el elemento indicado */
public String remove(String element) throws Exception{

   if (this.isEmpty()) throw new Exception ("Can´t remove anything, empty list!");
   
   String e = null;
   
   if (first.getNext() == null) {
       if (first.getElement().equals(element)){
        e = (String) first.getElement(); 
        first=last=null;
        size--;
        return e;}
       else throw new Exception ("element not found");
   }
   
   SimpleNode pivot = first;
   
   if (pivot.getElement().equals(element)) {
       e = (String)first.getElement();
       first = first.getNext(); 
       size--;
       return e; }
     
   while (pivot.getNext()!=null && pivot.getNext().getElement().equals(element) == false)
     pivot = pivot.getNext();

   if (pivot.getNext()==null) throw new Exception ("element not found");
   else{
       e = (String) pivot.getNext().getElement();
       pivot.setNext(pivot.getNext().getNext());             
       size--;
       return e;
   }

}
    
    
/** Elimina todos los elementos de la lista (la vacia) */
public void clean(){
   first = null; 
   last = null; 
   size = 0;
}
/** comprueba si la lista está vacía */
public boolean isEmpty(){
    return (first==null);
}

/** devuelve el indice del elemento dado*/
public int getIndex (String element) throws Exception {
    
   boolean found=false;
    
   if (this.isEmpty()) throw new Exception ("Can´t get anything, empty list!");
   
   int index =0;
   
   SimpleNode pivot = first;
   
   while (pivot != null&& !found){
     if (pivot.getElement().equals(element)) found=true;
     else {
         index++; 
         pivot = pivot.getNext();
        }
   }
    
   return index;
      
}

/** devuelve el elemento asociado al indice dado*/
public String get (int index) throws Exception{
    
String e = null;

if (index>=this.getSize()) throw new Exception ("index out of bounds");

SimpleNode pivot = first;

for (int i=0; i<index; i++)
 pivot = pivot.getNext();

e = (String) pivot.getElement();
return e;

} 

/** devuelve el elemento dado */
public String find (String element) throws Exception {
   
   boolean found = false;
   
   if (this.isEmpty()) throw new Exception ("Can´t get anything, empty list!");
   
   String e=null;
   
   SimpleNode pivot = first;
   
   while (pivot != null&& !found){
     if (pivot.getElement().equals(element)) {found = true;}
     else pivot = pivot.getNext();
   }
   
   if (pivot==null) return null;
   return (String) pivot.getElement(); 
   
}
   
   
/** comprueba si existe el elemento dado*/
public boolean contains (String element) throws Exception{
   
   boolean found = false;
   SimpleNode pivot = first;
   
   while (pivot!=null&& !found)
     if (pivot.getElement().equals(element)) {found=true;}
     else pivot = pivot.getNext();
     
   return found;
      
}
public IteratorAdministrador crearIterator(){
    return new IteratorAdministrador(this);
}
}

