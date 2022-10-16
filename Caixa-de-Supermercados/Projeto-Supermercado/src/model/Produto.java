package model;

import java.math.BigDecimal;

public class Produto {

    private int idProduto;
    private String nome;
    private String marca;
    private BigDecimal preco;
    private String codigo;

    public Produto(String nome, String marca, BigDecimal preco, String codigo) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.codigo = codigo;
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

    public String getCodigo() {
        return codigo;
    }
}
