
package state;

public interface Maquina {
    public void frenar();
    public void acelerar();
    public void arrancar();
    public void combustible(int litros);
    public String estado();    
}
