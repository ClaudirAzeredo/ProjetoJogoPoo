package br.unipar.jogo;

public class PersonagemF extends ModeloPersonagem {

    private String NOMEPERSONAGEM;

    private Integer HabVelocidade;

    private Integer Sexo;


    public String getNOMEPERSONAGEM() {
        return NOMEPERSONAGEM;
    }

    public void setNOMEPERSONAGEM(String NOMEPERSONAGEM) {
        this.NOMEPERSONAGEM = NOMEPERSONAGEM;
    }

    public Integer getHabVelocidade() {
        return HabVelocidade;
    }

    public void setHabVelocidade(Integer habVelocidade) {
        HabVelocidade = habVelocidade;
    }

    @Override
    public Integer getSexo() {
        return Sexo;
    }

    @Override
    public void setSexo(Integer sexo) {
        Sexo = sexo;
    }
}
