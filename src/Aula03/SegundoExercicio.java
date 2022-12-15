package Aula03;

import java.util.Scanner;


public class SegundoExercicio {
    public static void converterGraus(){
        /*
            02. Criar um programa em java que converta a temperatura de Fahrenheit para graus Celsius
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Insira um grau em Fahrenheit: ");

        double fahrenheit = input.nextDouble();
        double celsius = ((fahrenheit-32)*5)/9;

        System.out.printf("Essa temperatura em celsius é: %.2f", celsius);
        System.out.println(" ");

    }
}
