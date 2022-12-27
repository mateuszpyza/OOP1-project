package models;

import interfaces.TextFormatter;

public class ToLowerCaseConverter implements TextFormatter {
    public String formatText(String text) {
        if (text != null)
            return text.toLowerCase();
        else
            return "Złe dane wejściowe!!!";
    }
}
