package Aula05;

public class QuintoExercicio {
    public static void mostrarResultados() {
        // SOLUCAO 01
        int w = -5 + 8 * 6;
        int x = (55 + 9) % 9;
        int y = 20 + (-3 * 5 / 8);
        int z = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.print(w + "\n" + x + "\n" + y + "\n" + z);

        // SOLUCAO 02
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }
}
