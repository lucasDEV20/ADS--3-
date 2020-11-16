package br.com.torrentz.model;

import java.sql.Date;

public class Cupom {

    private int iden;
    private float porcentagem;
    private Date dataGeracao;

    public int getIden() {
        return iden;
    }

    public void setIden(int iden) {
        this.iden = iden;
    }

    public float getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(float porcentagem) {
        this.porcentagem = porcentagem;
    }

    public Date getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(Date dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    @Override
    public String toString() {
        return "Cupons{" + "iden=" + iden + ", porcentagem=" + porcentagem
                + ", dataGeracao=" + dataGeracao + '}';
    }

}
