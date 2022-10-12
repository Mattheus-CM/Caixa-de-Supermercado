package model;

public class Funcionario {

    private int idFuncionario;
    private String nome;
    private String cargo;
    private String cpf;
    private Usuario usuario;
    private Endereco endereco;

    public Funcionario(String nome, String cargo, String cpf, Usuario usuario, Endereco endereco) {
        this.nome = nome;
        this.cargo = cargo;
        this.cpf = cpf;
        this.usuario = usuario;
        this.endereco = endereco;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
