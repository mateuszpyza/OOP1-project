package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ToLowerCaseConverterTest {

    @Test
    void shouldGetLowerCaseText() {
        //given
        String exampleText = "mAteUsz";
        ToLowerCaseConverter toLowerCaseConverter1 = new ToLowerCaseConverter();
        //when
        String result = toLowerCaseConverter1.formatText(exampleText);
        //then
        Assertions.assertArrayEquals("mateusz".toCharArray(), result.toCharArray());
    }

    @Test
    void shouldGetErrorMessage() {
        //given
        String exampleText = null;
        ToLowerCaseConverter toLowerCaseConverter1 = new ToLowerCaseConverter();
        //when
        String result = toLowerCaseConverter1.formatText(exampleText);
        //then
        Assertions.assertArrayEquals("Złe dane wejściowe!!!".toCharArray(), result.toCharArray());
    }
}