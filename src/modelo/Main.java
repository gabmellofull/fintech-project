package modelo;

public class Main {

    public static void main(String[] args) {

        //cria novo cliente
        //repassa o argumento para o construtor de PessoaFisica
        Cliente gabriel = new PessoaFisica("048.484.777-89");
        gabriel.setNome("Gabriel Mello");


        //cria conta corrente para o cliente
        Conta cc = new ContaCorrente(gabriel);
        cc.depositar(100);


        //cria conta poupança para o cliente
        Conta poupanca = new ContaPoupanca(gabriel);
        cc.transferir(100, poupanca);


        //cria novo cliente
        //repassa o argumento para o construtor de PessoaFisica
        Cliente lara = new PessoaFisica("558.258.456-60");
        lara.setNome("Lara souza");


        //cria conta corrente para o cliente
        Conta cc1 = new ContaCorrente(lara);

        //cria conta poupança para o cliente
        Conta poupanca1 = new ContaPoupanca(lara);

        poupanca.transferir(50, cc1);

        //chama metodo de impressão de Gabriel
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        //chama metodo de impressão de Lara
        cc1.imprimirExtrato();
        poupanca1.imprimirExtrato();


    }
}
