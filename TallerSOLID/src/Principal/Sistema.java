package Principal;
import Adicionales.*;
import Postres.*;
import Procesos.*;
import Leche.*;
import java.util.ArrayList;

public class Sistema {
//    public static void main(String [ ] args){
//        // Producir un helado de vainilla y una torta de chocolate,
//        // a ambos agregarles CREMA y FRUTILLAS
//        // y cambiar el tipo de leche por Leche Descremada
//        // Finalmente mostrar el precio final de cada uno
//        LecheEntera leche = new LecheDeslactosada();
//        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
//
//        // Producir Helado
//        Helado helado_vainilla = new Helado("Vainilla");
//        Postre.addAderezo(helado_vainilla, new Crema());
//        Postre.addAderezo(helado_vainilla, new Frutilla());
//        System.out.println(helado_vainilla);
//        mnj_leche.cambiarTipoLeche(leche, helado_vainilla);
//        System.out.println(ManejadorDePrecios.showPrecioFinal(helado_vainilla));
//
//        // Producir Pastel
//        Pastel pastel_chocolate = new Pastel("Chocolate");
//        Postre.rmAderezo(pastel_chocolate, new Crema());
//        Postre.addAderezo(pastel_chocolate, new Frutilla());
//        System.out.println(pastel_chocolate);
//        mnj_leche.cambiarTipoLeche(leche, pastel_chocolate);
//        System.out.println(ManejadorDePrecios.showPrecioFinal(pastel_chocolate));
//
//
//    }

    public static void main(String[] args) {
        
        ArrayList<Postre> arrPostres = new ArrayList<>();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche(new LecheDeslactosada());
        
        Postre helado_vainilla = new Helado("Vainilla");
        arrPostres.add(helado_vainilla);
        
        Postre pastel_chocolate = new Pastel("Chocolate");
        arrPostres.add(pastel_chocolate);
        
        arrPostres.forEach(postre -> {
            postre.addAderezos(new Crema());
            postre.addAderezos(new Frutilla());
            System.out.println(postre);
            mnj_leche.cambiarTipoLeche(postre);
            System.out.println(ManejadorDePrecio.showPrecioFinal(postre));
        });
        
    }

}
