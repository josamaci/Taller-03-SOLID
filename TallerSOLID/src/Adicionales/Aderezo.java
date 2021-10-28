package Adicionales;

public abstract class Aderezo {

    protected String nombre;

    // MALVAVISCOS,FRUTILLA,CREMA

    public abstract void setNombre();

    public Aderezo() {
        this.setNombre();
    }

    @Override
    public String toString() {
        return nombre.toUpperCase();
    }

}
