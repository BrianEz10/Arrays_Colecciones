import java.util.Scanner;

public class Arrays8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[20];
        double[] sueldos = new double[20];
        double maxSueldo = 0;
        String mejorEmpleado = "";

        for (int i = 0; i < 20; i++) {
            System.out.print("Ingresa el nombre del empleado " + (i + 1) + ": ");
            nombres[i] = scanner.next();
            System.out.print("Ingresa el sueldo de " + nombres[i] + ": ");
            sueldos[i] = scanner.nextDouble();

            if (sueldos[i] > maxSueldo) {
                maxSueldo = sueldos[i];
                mejorEmpleado = nombres[i];
            }
        }

        System.out.println("El empleado que más gana es " + mejorEmpleado + " con un sueldo de " + maxSueldo);
    }

}
