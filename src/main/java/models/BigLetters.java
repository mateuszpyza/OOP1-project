package models;

import interfaces.TextFormatter;

public class BigLetters implements TextFormatter {
    public BigLetters() {
    }

    public String formatText(String text) {
        return text.toUpperCase();
    }
}
