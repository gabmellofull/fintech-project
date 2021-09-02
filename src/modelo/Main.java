package modelo;

public class Main {

    public static void main(String[] args) {

        //cria novo cliente
        Cliente gabriel = new Cliente();
        gabriel.setNome("Gabriel Mello");

        //cria conta corrente para o cliente
        Conta cc = new ContaCorrente(gabriel);
        cc.depositar(100);

        //cria conta poupança para o cliente
        Conta poupanca = new ContaPoupanca(gabriel);
        cc.transferir(100, poupanca);

        //chama metodo de impressão
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }
}
