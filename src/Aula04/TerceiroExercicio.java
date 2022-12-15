package Aula04;

import java.util.Scanner;
public class TerceiroExercicio {
    public static void mostrarMenorNumero() {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o primeiro numero: ");
        double x = in.nextDouble();

        System.out.println("Insira o segundo numero: ");
        double y = in.nextDouble();

        System.out.println("Insira o terceiro numero: ");
        double z = in.nextDouble();

        System.out.println("O menor numero é: " + calcularMenorNumero(x, y, z) + "\n" );
    }
    public static double calcularMenorNumero(double x, double y, double z)
    {
        return Math.min(Math.min(x, y), z);
    }
}
