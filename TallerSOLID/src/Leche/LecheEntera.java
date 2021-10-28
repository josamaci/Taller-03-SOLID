package Leche;

import Postres.*;

public abstract class LecheEntera {
    
    protected String nombre;

    public LecheEntera() {
        this.nombre = "leche";
    }
    
    public void usarPastel() {
        System.out.println("No se puede cambiar a este tipo de leche");
    };
    
    public abstract void usarHelado();
    
}
