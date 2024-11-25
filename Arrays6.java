import java.util.Scanner;

public class Arrays6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        double sumaPos = 0, sumaNeg = 0;
        int contadorPos = 0, contadorNeg = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] > 0) {
                sumaPos += numeros[i];
                contadorPos++;
            } else if (numeros[i] < 0) {
                sumaNeg += numeros[i];
                contadorNeg++;
            }
        }

        double mediaPos = contadorPos > 0 ? sumaPos / contadorPos : 0;
        double mediaNeg = contadorNeg > 0 ? sumaNeg / contadorNeg : 0;

        System.out.println("Media de positivos: " + mediaPos);
        System.out.println("Media de negativos: " + mediaNeg);
    }
}
