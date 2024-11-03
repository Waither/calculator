import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("\nWybierz obliczenie do wykonania:");
            System.out.println("1. Przyszła wartość inwestycji");
            System.out.println("2. Siła przyciągania grawitacyjnego");
            System.out.println("3. Tożsamości trygonometryczne");
            System.out.println("4. Pierwiastki równania kwadratowego");
            System.out.println("5. Zakończ program");
            System.out.print("Wpisz numer opcji (1-5): ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Nieprawidłowy wybór. Proszę wprowadzić liczbę od 1 do 5.");
                scanner.next(); // Wyczyść nieprawidłowe wejście
                continue;
            }

            switch (choice) {
                case 1:
                    // Przyszła wartość inwestycji
                    System.out.print("Podaj wartość obecną (p): ");
                    double p = scanner.nextDouble();
                    System.out.print("Podaj oprocentowanie w skali roku (r): ");
                    double r = scanner.nextDouble();
                    System.out.print("Podaj czas w latach (n): ");
                    double n = scanner.nextDouble();
                    double fv = Calculator.calculateFutureValue(p, r, n);
                    System.out.println("Przyszła wartość inwestycji: " + fv);
                    break;
                case 2:
                    // Siła przyciągania grawitacyjnego
                    System.out.print("Podaj masę pierwszego obiektu (m1) w kg: ");
                    double m1 = scanner.nextDouble();
                    System.out.print("Podaj masę drugiego obiektu (m2) w kg: ");
                    double m2 = scanner.nextDouble();
                    System.out.print("Podaj odległość między obiektami (r) w metrach: ");
                    double distance = scanner.nextDouble();
                    double force = Calculator.calculateGravitationalAttraction(m1, m2, distance);
                    System.out.println("Siła przyciągania grawitacyjnego: " + force + " N");
                    break;
                case 3:
                    // Tożsamości trygonometryczne
                    System.out.print("Podaj kąt s w stopniach: ");
                    double sDegrees = scanner.nextDouble();
                    System.out.print("Podaj kąt t w stopniach: ");
                    double tDegrees = scanner.nextDouble();
                    double sRadians = Math.toRadians(sDegrees);
                    double tRadians = Math.toRadians(tDegrees);
                    double sinSum = Calculator.calculateSinSum(sRadians, tRadians);
                    double cosSum = Calculator.calculateCosSum(sRadians, tRadians);
                    System.out.println("sin(s + t): " + sinSum);
                    System.out.println("cos(s + t): " + cosSum);
                    break;
                case 4:
                    // Pierwiastki równania kwadratowego
                    System.out.print("Podaj współczynnik a: ");
                    double a = scanner.nextDouble();
                    System.out.print("Podaj współczynnik b: ");
                    double b = scanner.nextDouble();
                    System.out.print("Podaj współczynnik c: ");
                    double c = scanner.nextDouble();
                    double[] roots = Calculator.calculateQuadraticRoots(a, b, c);
                    if (roots != null) {
                        if (roots.length == 2) {
                            System.out.println("Równanie ma dwa pierwiastki rzeczywiste:");
                            System.out.println("Pierwiastek r1: " + roots[0]);
                            System.out.println("Pierwiastek r2: " + roots[1]);
                        }
                        else if (roots.length == 1) {
                            System.out.println("Równanie ma jeden pierwiastek rzeczywisty:");
                            System.out.println("Pierwiastek r: " + roots[0]);
                        }
                    }
                    else {
                        System.out.println("Brak rzeczywistych pierwiastków.");
                    }
                    break;
                case 5:
                    // Zakończ program
                    System.out.println("Program zakończony.");
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór. Proszę wprowadzić liczbę od 1 do 5.");
                    break;
            }
        }

        scanner.close();
    }
}
