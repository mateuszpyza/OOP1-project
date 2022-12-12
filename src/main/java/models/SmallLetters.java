package models;

import interfaces.TextFormatter;

public class SmallLetters implements TextFormatter {
    public SmallLetters() {
    }

    public String formatText(String text) {
        return text.toLowerCase();
    }
}
