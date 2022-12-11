package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TimeTest {


    @Test
    void shouldChangeMinutesToSeconds() {
        //given
        double timeInMinutes = 2;
        //when
        double result = Time.changeMinutesToSeconds(timeInMinutes);
        //then
        Assertions.assertEquals(120, result);
    }
}