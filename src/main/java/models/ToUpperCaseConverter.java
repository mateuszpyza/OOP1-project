package models;

import interfaces.TextFormatter;

public class ToUpperCaseConverter implements TextFormatter {
    public String formatText(String text) {
        if (text != null)
            return text.toUpperCase();
        else
            return "Złe dane wejściowe!!!";

    }
}
