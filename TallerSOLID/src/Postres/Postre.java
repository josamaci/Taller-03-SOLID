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

    public void addAderezos(Aderezo aderezo) {
        this.getAderezos().add(aderezo);
    }

    public void rmAderezos(Aderezo aderezo) {
        this.getAderezos().remove(aderezo);
    }
}
