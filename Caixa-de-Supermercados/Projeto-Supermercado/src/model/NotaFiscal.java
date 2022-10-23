package model;

public class NotaFiscal {

    private int idNotaFiscal;
    private String dataDaCompra;
    private String supermercado;
    private Endereco endereco;

    public NotaFiscal(int idNotaFiscal, String dataDaCompra, String supermercado,
            Endereco endereco) {
        this.idNotaFiscal = idNotaFiscal;
        this.dataDaCompra = dataDaCompra;
        this.supermercado = supermercado;
        this.endereco = endereco;
    }

    public int getIdNotaFiscal() {
        return idNotaFiscal;
    }

    public String getDataDaCompra() {
        return dataDaCompra;
    }

    public String getSupermercado() {
        return supermercado;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
