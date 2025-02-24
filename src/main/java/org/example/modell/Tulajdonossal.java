package org.example.modell;

public class Tulajdonossal {
    String nev;

    public Tulajdonossal(String nev) {
        this.nev = nev;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    @Override
    public String toString() {
        return "Tulajdonossal{" +
                "nev='" + nev + '\'' +
                '}';
    }
}

// VEGE