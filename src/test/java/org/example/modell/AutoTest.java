package org.example.modell;



import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {
    private Garazs g1 = new Garazs(new ArrayList<>(5));
    private Auto a1 = new Auto("123asd", 5, 1000000);
    private Auto a2 = new Auto("124dsd", 5, 1000000);
    private Auto a3 = new Auto("012gsd", 2, 10000000);
    private Auto a4 = new Auto("asd", 2, 2000000000);
    private Auto a5 = new Auto("asdasd", 2, 30000000);
    private Auto a6 = new Auto("asdqweq", 2, 53432500);

@Test
void Egyforma(){
    assertTrue(a1.egyenlo(a2));
    assertFalse(a1.egyenlo(a3));
}

@Test
    void Ferohely(){
    g1.be(a1);
    g1.be(a2);
    g1.be(a3);
    g1.be(a4);
    assertEquals(4, g1.getGarazs().size());
    g1.be(a5);
    assertTrue(g1.garazstele());
    g1.ki(a3);
    assertFalse(g1.garazstele());
}
}

// VEGE