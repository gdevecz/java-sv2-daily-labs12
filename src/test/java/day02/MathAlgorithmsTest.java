package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    @Test
    void lnkoTest() {
        MathAlgorithms mathAlgorithms = new MathAlgorithms();

        int actualOne = mathAlgorithms.lnko(12, 18);
        int actualTwo = mathAlgorithms.lnko(12, 15);
        int actualThree = mathAlgorithms.lnko(30, 15);
        int actuaFour = mathAlgorithms.lnko(31, 17);

        assertEquals(6, actualOne);
        assertEquals(3, actualTwo);
        assertEquals(15, actualThree);
        assertEquals(1, actuaFour);
    }
}