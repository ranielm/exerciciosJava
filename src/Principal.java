import Aula08.ContaCorrente;
import Aula08.SaldoInsuficienteException;

public class Principal {

    public static void main(String[] args) throws Exception {
        criaContaCorrente();
    }

    private static void criaContaCorrente() throws Exception {
        System.out.println("Criando conta");
        ContaCorrente cc = new ContaCorrente();

        System.out.println("Depositando dinheiro");
        cc.deposita(10);

        try {
            System.out.println("Dinheiro atual: " + cc.saldo);
            System.out.println("Sacando dinheiro");
            cc.saca(9);
            System.out.println("Dinheiro atual: " + cc.saldo);
            System.out.println("Sacando mais dinheiro");
//            cc.saca(100);
            System.out.println("Dinheiro atual pós saques: " + cc.saldo);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
            criaContaCorrente();
        }

        System.out.println("Dinheiro atual pós saques: " + cc.saldo);
    }
}