
import java.util.Scanner;

public class DartGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int undecided = 0;

        System.out.println("DART GAME!");
        System.out.print("Enter the number of darts to be thrown: ");
        int n_dart = input.nextInt();
        int total = 1;

        while (total <= n_dart) {

            double x = (Math.random() * 10 - 5);
            double y = (Math.random() * 10 - 5);

            System.out.println("Dart " + total + ": ");
            System.out.println("Coordinates: " + "(" +  x + ", " + y + ")");

            if ((x < 5) && (x > 0) && (y < 5) && (y > 0)) {

                if ((x + y) < 5.0) {
                    System.out.println("Region: A");
                    a++;
                } else if ((x + y) > 5.0 && (x + y) < 10.0) {
                    System.out.println("Region: B");
                    b++;
                } else {
                    undecided++;
                }

            } else if ((x < 5) && (x > 0) && (y < 0) && (y > -5)) {
                System.out.println("Region: F");
                f++;

            } else if ((x < 0) && (x > -5) && (y < 5) && (y > 0)) {
                if ((x * x + y * y > 4) && (x * x + y * y < 16)) {
                    System.out.println("Region: C");
                    c++;
                } else {
                    System.out.println("Region: G");
                    g++;
                }

            } else if ((x < 0) && (x > -5) && (y < 0) && (y > -5)) {

                if ((x + y) > -5) {
                    System.out.println("Region: D");
                    d++;
                } else if ((x + y) > -10 && (x + y) < -5) {
                    System.out.println("Region: E");
                    e++;
                } else {
                    undecided++;
                }
            } else {
                undecided++;
            }
            System.out.println();
            total++;
        }

        System.out.println("Region statistics: ");
        System.out.println("A: " + a + " dart " + "%" + ((double)a / n_dart*100));
        System.out.println("B: " + b + " dart " + "%" + ((double)b / n_dart*100));
        System.out.println("C: " + c + " dart " + "%" + ((double)c / n_dart*100));
        System.out.println("D: " + d + " dart " + "%" + ((double)d / n_dart*100));
        System.out.println("E: " + e + " dart " + "%" + ((double)e / n_dart*100));
        System.out.println("F: " + f + " dart " + "%" + ((double)f / n_dart*100));
        System.out.println("G: " + g + " dart " + "%" + ((double)g / n_dart*100));
        System.out.println("Undecided: " + undecided + " dart " + "%" + ((double)undecided / n_dart*100));

    }

}
