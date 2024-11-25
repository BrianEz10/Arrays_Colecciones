import java.util.Scanner;

public class Arrays1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("¿Cuántos números deseas ingresar? ");
            int n = scanner.nextInt();
            double[] numeros = new double[n];
            double suma = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Ingresa el número " + (i + 1) + ": ");
                numeros[i] = scanner.nextDouble();
                suma += numeros[i];
            }

            double media = suma / n;
            System.out.println("La media es: " + media);
        }
    }