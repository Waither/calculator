public class Calculator {

    // Stałe statyczne na poziomie klasy
    public static final double G = 6.67e-11;

    // Metoda obliczająca przyszłą wartość inwestycji
    public static double calculateFutureValue(double p, double r, double n) {
        return p * Math.pow(1 + r, n);
    }

    // Metoda obliczająca przyciąganie grawitacyjne
    public static double calculateGravitationalAttraction(double m1, double m2, double r) {
        return G * (m1 * m2) / (r * r);
    }

    // Metoda obliczająca sin(s + t)
    public static double calculateSinSum(double s, double t) {
        return Math.sin(s) * Math.cos(t) + Math.sin(t) * Math.cos(s);
    }

    // Metoda obliczająca cos(s + t)
    public static double calculateCosSum(double s, double t) {
        return Math.cos(s) * Math.cos(t) - Math.sin(s) * Math.sin(t);
    }

    // Metoda obliczająca pierwiastki równania kwadratowego
    public static double[] calculateQuadraticRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double sqrtDelta = Math.sqrt(delta);
            double[] roots = new double[2];
            roots[0] = (-b + sqrtDelta) / (2 * a);
            roots[1] = (-b - sqrtDelta) / (2 * a);
            return roots;
        }
        else if (delta == 0) {
            double[] roots = new double[1];
            roots[0] = -b / (2 * a);
            return roots;
        }
        else {
            // Brak rzeczywistych pierwiastków
            return null;
        }
    }
}
