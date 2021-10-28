package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

public abstract class Postre {

    protected String sabor;
    protected double precioParcial;
    protected ArrayList<Aderezo> aderezos;

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    public String getSabor() {
        return sabor;
    }

    public double getPrecioParcial() {
        return precioParcial;
    }

    public static void anadirAderezo(Postre postre, Aderezo aderezo) {
        postre.getAderezos().add(aderezo);
    }

    public static void quitarAderezo(Postre postre, Aderezo aderezo) {
        postre.getAderezos().remove(aderezo);
    }
}
