package model;

public class Funcionario {

    private int idFuncionario;
    private String nome;
    private String cargo;
    private String cpf;
    private String usuario;
    private String senha;
    private int idEndereco;

    public Funcionario(String nome, String cargo, String cpf, String usuario, String senha, int idEndereco, int idFuncionario) {
        this(nome, cargo, cpf, usuario, senha, idEndereco);
        this.idFuncionario = idFuncionario;
    }

    public Funcionario(String nome, String cargo, String cpf, String usuario, String senha, int idEndereco) {
        this.nome = nome;
        this.cargo = cargo;
        this.cpf = cpf;
        this.usuario = usuario;
        this.idEndereco = idEndereco;
        this.usuario = usuario;
        this.senha = senha;
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

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public int getEndereco() {
        return idEndereco;
    }
}
