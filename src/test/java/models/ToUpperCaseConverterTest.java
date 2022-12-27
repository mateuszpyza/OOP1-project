package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ToUpperCaseConverterTest {

    @Test
    void shouldGetUpperCaseText() {
        //given
        String exampleText = "mAteUsz";
        ToUpperCaseConverter toUpperCaseConverter1 = new ToUpperCaseConverter();
        //when
        String result = toUpperCaseConverter1.formatText(exampleText);
        //then
        Assertions.assertArrayEquals("MATEUSZ".toCharArray(), result.toCharArray());
    }

    @Test
    void shouldGetErrorMessage() {
        //given
        String exampleText = null;
        ToUpperCaseConverter toUpperCaseConverter1 = new ToUpperCaseConverter();
        //when
        String result = toUpperCaseConverter1.formatText(exampleText);
        //then
        Assertions.assertArrayEquals("Złe dane wejściowe!!!".toCharArray(), result.toCharArray());
    }
}