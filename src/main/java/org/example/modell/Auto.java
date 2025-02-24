package org.example.modell;

import java.security.KeyStore;
import java.util.Objects;

public class Auto{
    private String rendszam;
    private int férőhely, ára;

    public Auto(String rendszam, int férőhely, int ára) {
        if(this.rendszam.length() < 6){
            String message = "Az auto nem létezik mivel nem 6 betü.";
            throw new NemLetezoAutoExeption(message);
        } else {
            this.rendszam = rendszam;
        }
        this.férőhely = férőhely;
        this.ára = ára;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public int getFérőhely() {
        return férőhely;
    }

    public void setFérőhely(int férőhely) {
        this.férőhely = férőhely;
    }

    public int getÁra() {
        return ára;
    }

    public void setÁra(int ára) {
        this.ára = ára;
    }

    public boolean egyenlo(Auto a2){
        if (this.getFérőhely() == a2.getFérőhely() && this.getÁra() == a2.getÁra()){
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return férőhely == auto.férőhely && ára == auto.ára;
    }

    @Override
    public int hashCode() {
        return Objects.hash(férőhely, ára);
    }

    public void rendezni(){

    }

    public void masolhato(){

    }

    @Override
    public String toString() {
        return "Auto{" +
                "rendszam='" + rendszam + '\'' +
                ", férőhely=" + férőhely +
                ", ára=" + ára +
                '}';
    }
}
