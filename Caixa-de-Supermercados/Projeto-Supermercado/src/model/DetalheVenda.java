package model;

import java.math.BigDecimal;

public class DetalheVenda {

    private int idDetalheVenda;
    private BigDecimal precoTotal;
    private String dataDaCompra;
    private int idFuncionario;

    public DetalheVenda(BigDecimal precoTotal, String dataDaCompra,
            int idFuncionario) {

        this.precoTotal = precoTotal;
        this.dataDaCompra = dataDaCompra;
        this.idFuncionario = idFuncionario;
    }

    public DetalheVenda(int idDetalheVenda, BigDecimal precoTotal,
            String dataDaCompra, int idFuncionario) {

        this(precoTotal, dataDaCompra, idFuncionario);
        this.idDetalheVenda = idDetalheVenda;
    }

    public int getIdDetalheVenda() {
        return idDetalheVenda;
    }

    public BigDecimal getPrecoTotal() {
        return precoTotal;
    }

    public String getDataDaCompra() {
        return dataDaCompra;
    }

    public int getFuncionario() {
        return idFuncionario;
    }

}
