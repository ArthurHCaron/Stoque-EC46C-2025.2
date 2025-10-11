package com.mycompany.prototipo;

public class Produto {

    private String nome,
                   codigo,
                   localizacao;
    private float preco;
    private int qtde;

    public Produto() {
        this.nome = "";
        this.codigo = "";
        this.localizacao = "";
        this.preco = 0;
        this.qtde = 0;
    }

    public Produto(String nome, String codigo, String localizacao, float preco, int qtde) {
        this.nome = nome;
        this.codigo = codigo;
        this.localizacao = localizacao;
        this.preco = preco;
        this.qtde = qtde;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public float getPreco() {
        return preco;
    }

    public int getQtde() {
        return qtde;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
}
