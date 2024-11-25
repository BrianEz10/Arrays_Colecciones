public class Arrays13 {
    public static void main(String[] args) {
        int n = 4;
        int[][] cuadradoLatino = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cuadradoLatino[i][j] = (i + j) % n + 1;
            }
        }

        System.out.println("Cuadrado latino:");
        for (int[] fila : cuadradoLatino) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
