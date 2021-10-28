package Procesos;

import Postres.Postre;

public class ManejadorDePrecios {

    public static double calcularPrecioFinal(Postre postre) {
        double precioFinal;
        double precioParcial = postre.getPrecioParcial();
        precioFinal = (precioParcial + (precioParcial * 0.12)) + (postre.getAderezos().size() * 0.50);
        return precioFinal;
    }

    public static String showPrecioFinal(Postre postre) {
        return "Precio Final: $ " + calcularPrecioFinal(postre);
    }

}
