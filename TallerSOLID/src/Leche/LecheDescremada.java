package Leche;

public class LecheDescremada extends LecheEntera {

    public LecheDescremada() {
        super();
        this.nombre += " descremada";
    }
    
    
    @Override
    public void usarHelado() {
        System.out.println("Usando " + nombre);
    }

    @Override
    public void usarPastel() {
        System.out.println("Usando " + nombre);
    }
    
}
