package Adicionales;

public class Malvaviscos extends Aderezo {
    
    @Override
    public void setNombre() {
        this.nombre = this.getClass().getName();
    }
    
    public Malvaviscos() {
        super();
    }
    
}
