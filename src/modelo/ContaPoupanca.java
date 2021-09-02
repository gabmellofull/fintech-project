package modelo;

public class ContaPoupanca extends Conta{

    //repassa o objeto cliente para a classe Conta
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    //imprime cabeçario e chama o metodo de impressão de informações
    @Override
    public void imprimirExtrato() {
        System.out.println("===== Extrato Conta Poupança");
        super.imprimirInfosComuns();
    }


}
