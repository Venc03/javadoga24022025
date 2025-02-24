package org.example.modell;


import java.util.ArrayList;

public class Garazs {
    private ArrayList<Object> garazs = new ArrayList<>(5);

    public Garazs(ArrayList<Object> garazs) {
        this.garazs = garazs;
    }

    public ArrayList<Object> getGarazs() {
        return garazs;
    }

    public void setGarazs(ArrayList<Object> garazs) {
        this.garazs = garazs;
    }

    public boolean garazstele(){
        boolean teli = false;
        if (garazs.size() == 5){
            teli = true;
        }
        teli = false;
        return teli;
    }

    public void be(Auto auto){
       if (garazstele()){
           System.out.println("A garázs tele van.");
       } else {
           garazs.add(auto);
       }
    }

    public void ki(Auto auto){
       
    }

    @Override
    public String toString() {
        return "Garazs{" +
                ", garazs=" + garazs +
                '}';
    }
}
