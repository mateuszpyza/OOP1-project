package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class PythagoreanTheoremTest {

    @Test
    void shouldBeRectangularLongestA() {
        //given
        double a = 5;
        double b = 4;
        double c = 3;
        //when
        boolean result = PythagoreanTheorem.isRectangularTriangle(a, b, c);
        //then
        Assertions.assertTrue(result);


    }
    @Test
    void shouldBeRectangularLongestB() {
        //given
        double a = 3;
        double b = 5;
        double c = 4;
        //when
        boolean result = PythagoreanTheorem.isRectangularTriangle(a, b, c);
        //then
        Assertions.assertTrue(result);


    }
    @Test
    void shouldBeRectangularLongestC() {
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
    void shouldBeNotRectangular() {
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
    void shouldBeNotTriangle() {
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