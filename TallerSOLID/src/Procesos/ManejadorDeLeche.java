package Procesos;

import Leche.*;
import Postres.*;

public class ManejadorDeLeche {
    
    private LecheEntera leche;

    public ManejadorDeLeche(LecheEntera leche) {
        this.leche = leche;
    }
    
    public void cambiarTipoLeche(Postre postre){
        // Cambiar tipo de leche en la preparación de los postres, usar leche deslactosada
//        System.out.println(postre.getClass());
//        System.out.println(Pastel.class);
        if(postre.getClass() == Pastel.class){
            leche.usarPastel();
        }else{
            leche.usarHelado();
        }
    }
    
}
