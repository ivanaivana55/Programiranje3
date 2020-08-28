package app.ontologija.slisko;

import java.io.Serializable;

public class Ontologija implements Serializable {

    private int sifra;
    private String izvodac;
    private String simfonijskiOrkestar;
    private String nalaziSeU;
    private String dobilaJe;
    private int brojIzvedbi;
    private String mjesec;

    public Ontologija() {
        this.sifra = sifra;
        this.izvodac = izvodac;
        this.simfonijskiOrkestar = simfonijskiOrkestar;
        this.nalaziSeU = nalaziSeU;
        this.dobilaJe = dobilaJe;
        this.brojIzvedbi = brojIzvedbi;
        this.mjesec = mjesec;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getIzvodac() {
        return izvodac;
    }

    public void setIzvodac(String izvodac) {
        this.izvodac = izvodac;
    }

    public String getSimfonijskiOrkestar() {
        return simfonijskiOrkestar;
    }

    public void setSimfonijskiOrkestar(String simfonijskiOrkestar) {
        this.simfonijskiOrkestar = simfonijskiOrkestar;
    }

    public String getNalaziSeU() {
        return nalaziSeU;
    }

    public void setNalaziSeU(String nalaziSeU) {
        this.nalaziSeU = nalaziSeU;
    }

    public String getDobilaJe() {
        return dobilaJe;
    }

    public void setDobilaJe(String dobilaJe) {
        this.dobilaJe = dobilaJe;
    }

    public int getBrojIzvedbi() {
        return brojIzvedbi;
    }

    public void setBrojIzvedbi(int brojIzvedbi) {
        this.brojIzvedbi = brojIzvedbi;
    }

    public String getMjesec() {
        return mjesec;
    }

    public void setMjesec(String mjesec) {
        this.mjesec = mjesec;
    }
}
