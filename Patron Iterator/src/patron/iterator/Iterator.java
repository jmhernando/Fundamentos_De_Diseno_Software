package patron.iterator;

public interface Iterator {
    public Object next();
    public boolean hasNext();
    public int getSize();
    public void remove(int n);
}
