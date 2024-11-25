import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int suma = 0, contador = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa el número en la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
            if (i % 2 == 0) {
                suma += numeros[i];
                contador++;
            }
        }

        double media = (double) suma / contador;
        System.out.println("La media de los números en posiciones pares es: " + media);
    }
}
