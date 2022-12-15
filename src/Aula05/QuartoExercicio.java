package Aula05;

import java.util.*;
public class QuartoExercicio {

    public static void calcularMedia()
    {
        double[] numeros = {1, 4, 17, 7, 25, 3, 100};
        double soma = 0;

        System.out.println("Array Original: ");
        System.out.println(Arrays.toString(numeros));

        for (double numero : numeros) {
            soma = soma + numero;
        }

        double media = soma / numeros.length;

        System.out.println("A media desse array é: " + media);
    }
}