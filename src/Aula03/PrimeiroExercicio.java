package Aula03;

public class PrimeiroExercicio {
    // CONSTANTE
    public static final float PI = 3.1416F;
    public static void mostrarVariaveis() {
        /*
            01. Criar um programa em java que contenha variáveis float, double, string, int e boolean.
                Imprima essas variáveis.
            Force erros colocando valores diferentes dos tipos de cada uma.
         */

        float myFloat = 11;
        double myDouble = 54.5;
        String myString = "Quarta";
        int myNumber = 12;
        boolean myBoolean = false;

        System.out.println("myFloat: " + myFloat);
        myFloat = 1.99f;
        System.out.println("myFloat: " + myFloat);
        System.out.println("myDouble: " + myDouble);
        System.out.println("myString: " + myString);
        System.out.println("myNumber: " + myNumber);
        System.out.println("myBoolean: " + myBoolean);

        double sec = 1234.12345;
        float  sum  = 1234.12345f;
        System.out.printf("%,.6f ~ %,.6f", sec, sum);
        System.out.println(" ");

        // VARIAVEL FINAL
        final String msgPadrao = "Olá!";
        System.out.println("msgPadrao: " + msgPadrao);

        final String msgPadraoEdit;
        msgPadraoEdit = "Olá!";
        System.out.println("msgPadraoEdit: " + msgPadraoEdit);

        System.out.println(PI);

    }

}
