package modelo;

public class Cliente {

    private String nome;
    private String cod;

    //construtor de cliente recebe o cod de PF ou PJ
    //armazena na string cod que tem o get
    public Cliente(String cod){
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCod() {
        return cod;
    }

}
