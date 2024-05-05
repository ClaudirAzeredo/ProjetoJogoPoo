package br.unipar.jogo;

public class Itens extends JINGLE {

    private String Nome;

    private Integer Raridade;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Integer getRaridade() {
        return Raridade;
    }

    public void setRaridade(Integer raridade) {
        Raridade = raridade;
    }
}
