import Aula08.Conta;

public class Principal {
    public static void main(String[] args) {

        // criarContas();
        criarContaSimples();
    }

    private static void criarContaSimples() {
        try {
            Conta contaPoupanca;
            contaPoupanca = new Conta();
            contaPoupanca.depositar(120);
            contaPoupanca.sacar(130);
        } catch (Exception e) {
            // erro no método depositar ou erro no método sacar
            // print o erro por favor
            System.out.println("Não foi possível criar sua conta: " + e.getMessage());
        }
    }

    private static void criarContas() throws Exception {
        // criando a conta poupanca
        Conta contaPoupanca;
        contaPoupanca = new Conta();

        // alterando os valores de minhaConta
        contaPoupanca.titular = "Raniel Mendonça";
        contaPoupanca.saldo = 1000;

        // saca 200 reais
        contaPoupanca.sacar(200);

        // deposita 500 reais
        contaPoupanca.depositar(500);

        System.out.println("Saldo atual da conta poupanca: " + contaPoupanca.saldo);

        // criando a conta corrente
        Conta contaCorrente = new Conta();

        contaPoupanca.depositar(100);
        contaPoupanca.sacar(1000);

        System.out.println("Saldo atual da conta poupanca: " + contaPoupanca.saldo);

        contaCorrente.depositar(100);
        contaCorrente.sacar(1000);
    }
}