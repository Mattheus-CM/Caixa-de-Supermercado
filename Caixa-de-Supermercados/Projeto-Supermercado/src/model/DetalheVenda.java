package model;

import java.math.BigDecimal;

public class DetalheVenda {

    private int idDetalheVenda;
    private BigDecimal precoUnitario;
    private BigDecimal precoTotal;
    private int quantidade;
    private String dataDaCompra;
    private Funcionario funcionario;
    private NotaFiscal notaFiscal;

    public DetalheVenda(int idDetalheVenda, BigDecimal precoUnitario, BigDecimal precoTotal, int quantidade,
                        String dataDaCompra, Funcionario funcionario, NotaFiscal notaFiscal) {
        this.idDetalheVenda = idDetalheVenda;
        this.precoUnitario = precoUnitario;
        this.precoTotal = precoTotal;
        this.quantidade = quantidade;
        this.dataDaCompra = dataDaCompra;
        this.funcionario = funcionario;
        this.notaFiscal = notaFiscal;
    }

    public int getIdDetalheVenda() {
        return idDetalheVenda;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public BigDecimal getPrecoTotal() {
        return precoTotal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getDataDaCompra() {
        return dataDaCompra;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }
}
