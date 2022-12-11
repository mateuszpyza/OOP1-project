package models;

public class PythagoreanTheorem {

    public static boolean isRectangularTriangle(double a, double b, double c) {
        if ((c < a + b) && (a < b + c) && (b < a + c)) {
            boolean isRectangular = false;
            if ((a > b) && (a > c)) {
                return ((a * a) == ((b * b) + (c * c)));
            } else if ((b > a) && (b > c)) {
                return ((b * b) == (a * a) + (c * c));
            } else if ((c > a) && (c > b)) {
                return ((c * c) == (a * a) + (b * b));
            } else {
                return false;
            }
        } else {
            System.out.println("To nie jest trójkąt!!!");
            return false;
        }
    }
}
