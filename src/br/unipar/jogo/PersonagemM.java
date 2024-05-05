package br.unipar.jogo;

public class PersonagemM extends ModeloPersonagem {

    private String NOMEPERSONAGEM;

    private Integer HabResitencia;

    private Integer Sexo;

    public String getNOMEPERSONAGEM() {
        return NOMEPERSONAGEM;
    }

    public void setNOMEPERSONAGEM(String NOMEPERSONAGEM) {
        this.NOMEPERSONAGEM = NOMEPERSONAGEM;
    }

    public Integer getHabResitencia() {
        return HabResitencia;
    }

    public void setHabResitencia(Integer habResitencia) {
        HabResitencia = habResitencia;
    }

    @Override
    public Integer getSexo() {
        return Sexo;
    }

    public void setSexo(Integer Sexo) {
        this.Sexo = Sexo;
    }
}
