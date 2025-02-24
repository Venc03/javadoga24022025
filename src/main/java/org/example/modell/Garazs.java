package org.example.modell;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.io.FileDescriptor.in;
import static java.io.FileDescriptor.out;

public class Garazs {
    private int gférőhely;
    private ArrayList<Object> garazs = new ArrayList<>(5);

    public Garazs(int gférőhely, ArrayList<Object> garazs) {
        this.gférőhely = gférőhely;
        this.garazs = garazs;
    }

    public int getGférőhely() {
        return gférőhely;
    }

    public void setGférőhely(int gférőhely) {
        this.gférőhely = gférőhely;
    }

    public ArrayList<Object> getGarazs() {
        return garazs;
    }

    public void setGarazs(ArrayList<Object> garazs) {
        this.garazs = garazs;
    }

    public void be(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("garazs.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            fis.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void ki(){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("garazs.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            fos.write(0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Garazs{" +
                "gférőhely=" + gférőhely +
                ", garazs=" + garazs +
                '}';
    }
}
