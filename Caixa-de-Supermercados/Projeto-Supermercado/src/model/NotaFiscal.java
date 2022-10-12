package model;

public class NotaFiscal {

    private int idNotaFiscal;
    private String dataDaCompra;
    private String cep;
    private Endereco endereco;

    public NotaFiscal(int idNotaFiscal, String dataDaCompra, String cep, Endereco endereco) {
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

    public Endereco getEndereco() {
        return endereco;
    }
}
