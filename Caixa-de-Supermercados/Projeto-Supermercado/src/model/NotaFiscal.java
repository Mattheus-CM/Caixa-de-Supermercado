package model;

public class NotaFiscal {

    private int idNotaFiscal;
    private String dataDaCompra;
    private String cep;
    private EnderecoSupermercado endereco;

    public NotaFiscal(int idNotaFiscal, String dataDaCompra, String cep, EnderecoSupermercado endereco) {
        this.idNotaFiscal = idNotaFiscal;
        this.dataDaCompra = dataDaCompra;
        this.cep = cep;
        this.endereco = endereco;
    }

    public int getIdNotaFiscal() {
        return idNotaFiscal;
    }

    public String getDataDaCompra() {
        return dataDaCompra;
    }

    public String getCep() {
        return cep;
    }

    public EnderecoSupermercado getEndereco() {
        return endereco;
    }
}
