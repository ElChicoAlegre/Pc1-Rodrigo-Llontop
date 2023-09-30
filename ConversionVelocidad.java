import java.util.Scanner;

public class ConversionVelocidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kph, finalKph;

        System.out.print("Ingrese un número final para los kilómetros por hora mayor a 60KPH: ");
        try {
            finalKph = scanner.nextInt();
            if (finalKph <= 60 || finalKph % 10 != 0) {
                System.out.println("Programa finalizado, usted debe ingresar un valor múltiplo de 10 mayor a 60KPH");
                System.exit(0);
            }

            System.out.println("KPH\t\tMPH");
            System.out.println("-------------------");
            
            for (kph = 60; kph <= finalKph; kph += 10) {
                double mph = kph * 0.6214;
                System.out.printf("%d\t\t%.1f\n", kph, mph);
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Por favor, ingrese un número válido.");
        } finally {
            scanner.close();
        }
    }
}

