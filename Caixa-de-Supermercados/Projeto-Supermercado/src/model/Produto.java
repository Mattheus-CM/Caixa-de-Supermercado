package model;

import java.math.BigDecimal;

public class Produto {

    private int idProduto;
    private String nome;
    private String marca;
    private BigDecimal preco;

    public Produto(int idProduto, String nome, String marca, BigDecimal preco) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public BigDecimal getPreco() {
        return preco;
    }
}
