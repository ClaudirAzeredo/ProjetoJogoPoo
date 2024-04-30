package br.unipar.jogo;

public class Usuario {

    private Integer IDUSUARIO;

    private Integer NOMEUSUARIO;

    private String EMAILUSUARIO;

    private String SENHAUSUARIO;

    private String CPFUSUARIO;


    public Integer getIDUSUARIO() {
        return IDUSUARIO;
    }

    public void setIDUSUARIO(Integer IDUSUARIO) {
        this.IDUSUARIO = IDUSUARIO;
    }

    public Integer getNOMEUSUARIO() {
        return NOMEUSUARIO;
    }

    public void setNOMEUSUARIO(Integer NOMEUSUARIO) {
        this.NOMEUSUARIO = NOMEUSUARIO;
    }

    public String getSENHAUSUARIO() {
        return SENHAUSUARIO;
    }

    public void setSENHAUSUARIO(String SENHAUSUARIO) {
        this.SENHAUSUARIO = SENHAUSUARIO;
    }

    public String getCPFUSUARIO() {
        return CPFUSUARIO;
    }

    public void setCPFUSUARIO(String CPFUSUARIO) {
        this.CPFUSUARIO = CPFUSUARIO;
    }

    public String getEMAILUSUARIO() {
        return EMAILUSUARIO;
    }

    public void setEMAILUSUARIO(String EMAILUSUARIO) {
        this.EMAILUSUARIO = EMAILUSUARIO;
    }
}
