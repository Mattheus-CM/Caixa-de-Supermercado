package model;

public class EnderecoSupermercado extends Endereco{

    private String cep;

    public EnderecoSupermercado(int idEndereco, String rua, String numero, String bairro, String cidade, String cep) {
        super(idEndereco, rua, numero, bairro, cidade);
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }
}
