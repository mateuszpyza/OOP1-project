package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ClassTest {


    @Test
    void shouldReturnProperChangeResult120() {
        //given
        double timeInMinutes = 2;
        //when
        double result = Class.changeMinutesToSeconds(timeInMinutes);
        //then
        Assertions.assertEquals(120, result);
    }

    @Test
    void shouldReturnProperChangeResult666() {
        //given
        double timeInMinutes = 11.1;
        //when
        double result = Class.changeMinutesToSeconds(timeInMinutes);
        //then
        Assertions.assertEquals(666, result);
    }
}