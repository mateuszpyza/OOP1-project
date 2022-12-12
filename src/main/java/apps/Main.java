package apps;

import models.BigLetters;
import models.SmallLetters;

public class Main {
    public static void main(String[] args) {
        BigLetters bigLetters = new BigLetters();
        SmallLetters smallLetters = new SmallLetters();
        System.out.println(bigLetters.formatText("dObRzE IdZiE cHyBa, NiE?"));
        System.out.println(smallLetters.formatText("dObRzE IdZiE cHyBa, NiE?"));
    }
}
