package model;

public class EnderecoSupermercado {

    private int idEnderecoSupermercado;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String cep;

    public EnderecoSupermercado(int idEnderecoSupermercado, String rua, String numero, String bairro, String cidade, String cep) {
        this.idEnderecoSupermercado = idEnderecoSupermercado;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }

    public int getIdEnderecoSupermercado() {
        return idEnderecoSupermercado;
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
