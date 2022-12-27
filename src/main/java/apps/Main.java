package apps;

import models.ToUpperCaseConverter;
import models.ToLowerCaseConverter;

public class Main {
    public static void main(String[] args) {
        ToUpperCaseConverter bigLetters = new ToUpperCaseConverter();
        ToLowerCaseConverter smallLetters = new ToLowerCaseConverter();
        System.out.println(bigLetters.formatText("dObRzE IdZiE cHyBa, NiE?"));
        System.out.println(smallLetters.formatText(null));
    }
}
