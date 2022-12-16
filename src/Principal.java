import java.util.Scanner;

public class Principal {
        public static void main(String[] args)
        {
            double minutosNoAno = 60 * 24 * 365;

            Scanner input = new Scanner(System.in);

            System.out.println("Digite o numero de minutos: ");

            double minutos = input.nextDouble();

            long anos = (long) (minutos / minutosNoAno);
            int dias = (int) (minutos / 60 / 24) % 365;

            System.out.println((int) minutos + " minutos são aproximandamente " + anos + " anos e " + dias + " dias");

        }
}