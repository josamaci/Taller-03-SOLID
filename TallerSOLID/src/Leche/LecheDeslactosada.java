package Leche;

public class LecheDeslactosada extends LecheEntera {

    public LecheDeslactosada() {
        super();
        this.nombre += " deslactosada";
    }
    
    @Override
    public void usarHelado() {
        System.out.println("Usando " + nombre);
    }
        
}
