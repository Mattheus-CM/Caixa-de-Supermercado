package model;

public class Endereco {

    private int idEndereco;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;

    public Endereco(int idEndereco, String rua, String numero, String bairro, String cidade) {
        this.idEndereco = idEndereco;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }
}
