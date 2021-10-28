package Adicionales;

public class Frutilla extends Aderezo{
    
    @Override
    public void setNombre() {
        this.nombre = this.getClass().getName();
    }
    
    public Frutilla() {
        super();
    }
    
}
