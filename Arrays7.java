import java.util.Scanner;

public class Arrays7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántas alturas deseas ingresar? ");
        int n = scanner.nextInt();
        double[] alturas = new double[n];
        double suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa la altura " + (i + 1) + ": ");
            alturas[i] = scanner.nextDouble();
            suma += alturas[i];
        }

        double media = suma / n;
        int superiores = 0, inferiores = 0;

        for (double altura : alturas) {
            if (altura > media) superiores++;
            else if (altura < media) inferiores++;
        }

        System.out.println("Altura media: " + media);
        System.out.println("Superiores a la media: " + superiores);
        System.out.println("Inferiores a la media: " + inferiores);
    }
}
