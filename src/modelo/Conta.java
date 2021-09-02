package modelo;

public class Conta implements IConta{

    //inicializa
    private  static final int  AGENCIA_PADRAO = 1;
    private  static int SEQUENCIAL = 1;

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;

    //Construtor de conta
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    //metodos sobrescritos da interface IConta

    //subtrai valor de saque da conta
    @Override
    public void sacar(double valor) {
            this.saldo = saldo - valor;
    }

    //deposita valor na conta
    @Override
    public void depositar(double valor) {
            this.saldo = saldo + valor;
    }

    //saca da conta atual e deposita na contaDestino
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    @Override
    public void imprimirExtrato() {

    }

    //imprime as informações comuns do cliente
    protected void imprimirInfosComuns() {

        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}



