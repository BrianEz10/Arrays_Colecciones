public class Arrays12 {
    public static void main(String[] args) {
        int n = 3;
        int[][] cuadradoMagico = new int[n][n];

        int num = 1;
        int i = 0, j = n / 2;

        while (num <= n * n) {
            cuadradoMagico[i][j] = num++;
            i--;
            j++;
            if (num % n == 1) {
                i += 2;
                j--;
            } else if (i < 0) {
                i = n - 1;
            } else if (j == n) {
                j = 0;
            }
        }

        System.out.println("Cuadrado mágico:");
        for (int[] fila : cuadradoMagico) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
