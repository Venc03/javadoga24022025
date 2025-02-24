package org.example.modell;



import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {
@BeforeAll
    private Auto a1 = new Auto("123asd", 5, 1000000);
    private Auto a2 = new Auto("124dsd", 5, 1000000);
    private Auto a3 = new Auto("012gsd", 2, 10000000);
    private Auto a4 = new Auto("asd", 2, 2000000000);

@Test
void rendszam(){
    assertArrayEquals(true, a1.egyenlo(a2));
    assertArrayEquals(false, a1.egyenlo(a3));
}

@Test
    void(){

}
}