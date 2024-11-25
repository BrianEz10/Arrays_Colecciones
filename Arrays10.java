import java.util.Scanner;

public class Arrays10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de las matrices (n x n): ");
        int n = scanner.nextInt();
        int[][] matriz1 = new int[n][n];
        int[][] matriz2 = new int[n][n];
        int[][] suma = new int[n][n];

        System.out.println("Ingresa los valores de la primera matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ingresa los valores de la segunda matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz2[i][j] = scanner.nextInt();
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("La matriz resultante de la suma es:");
        for (int[] fila : suma) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
