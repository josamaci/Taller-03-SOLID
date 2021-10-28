package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

public abstract class Postre {

    protected String sabor;
    protected double precioParcial;
    protected ArrayList<Aderezo> aderezos = new ArrayList<>();

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    public String getSabor() {
        return sabor;
    }

    public double getPrecioParcial() {
        return precioParcial;
    }

    public static void addAderezo(Postre postre, Aderezo aderezo) {
        postre.getAderezos().add(aderezo);
    }

    public static void rmAderezo(Postre postre, Aderezo aderezo) {
        postre.getAderezos().remove(aderezo);
    }
}
