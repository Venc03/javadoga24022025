package org.example.modell;

import java.util.Objects;
import java.util.UUID;

public class Jarmu extends Auto {
    private UUID id;
    private String színnel;
    private Tulajdonossal tulaj;

    public Jarmu(String rendszam, int férőhely, int ára, UUID id, String színnel, Tulajdonossal tulaj) {
        super(rendszam, férőhely, ára);
        this.id = id;
        this.színnel = színnel;
        this.tulaj = tulaj;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getSzínnel() {
        return színnel;
    }

    public void setSzínnel(String színnel) {
        this.színnel = színnel;
    }

    public Tulajdonossal getTulaj() {
        return tulaj;
    }

    public void setTulaj(Tulajdonossal tulaj) {
        this.tulaj = tulaj;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Jarmu{" +
                "id=" + id +
                ", színnel='" + színnel + '\'' +
                ", tulaj=" + tulaj +
                '}';
    }
}
