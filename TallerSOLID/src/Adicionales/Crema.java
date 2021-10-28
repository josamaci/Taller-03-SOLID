package Adicionales;

public class Crema extends Aderezo {

    @Override
    public void setNombre() {
        this.nombre = this.getClass().getName();
    }

    public Crema() {
        super();
    }
    
}
