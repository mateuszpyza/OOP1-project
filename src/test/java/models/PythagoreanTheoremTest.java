package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class PythagoreanTheoremTest {

    @org.junit.jupiter.api.Test
    void isRectangularTriangle() {
        //given
        double a = 3;
        double b = 4;
        double c = 5;
        //when
        boolean result = PythagoreanTheorem.isRectangularTriangle(a, b, c);
        //then
        Assertions.assertTrue(result);

    }

    @Test
    void isNotRectangularTriangle() {
        //given
        double a = 2.5;
        double b = 4;
        double c = 5;
        //when
        boolean result = PythagoreanTheorem.isRectangularTriangle(a, b, c);
        //then
        Assertions.assertFalse(result);
    }

    @Test
    void isNotTriangle() {
        //given
        double a = 10;
        double b = 4;
        double c = 5;
        //when
        boolean result = PythagoreanTheorem.isRectangularTriangle(a, b, c);
        //then
        Assertions.assertFalse(result);
    }
}