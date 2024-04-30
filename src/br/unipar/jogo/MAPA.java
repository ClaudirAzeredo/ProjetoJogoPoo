package br.unipar.jogo;

public class MAPA {

    private Integer Cidade;

    private Integer VEICULOS;

    private Integer VEGETACAO;

    private Integer TEMPOJOGO;

    private Integer CLIMA;


    public Integer getCidade() {
        return Cidade;
    }

    public void setCidade(Integer cidade) {
        Cidade = cidade;
    }

    public Integer getVEICULOS() {
        return VEICULOS;
    }

    public void setVEICULOS(Integer VEICULOS) {
        this.VEICULOS = VEICULOS;
    }

    public Integer getVEGETACAO() {
        return VEGETACAO;
    }

    public void setVEGETACAO(Integer VEGETACAO) {
        this.VEGETACAO = VEGETACAO;
    }

    public Integer getTEMPOJOGO() {
        return TEMPOJOGO;
    }

    public void setTEMPOJOGO(Integer TEMPOJOGO) {
        this.TEMPOJOGO = TEMPOJOGO;
    }

    public Integer getCLIMA() {
        return CLIMA;
    }

    public void setCLIMA(Integer CLIMA) {
        this.CLIMA = CLIMA;
    }
}
