package br.com.torrentz.model;

import java.sql.Date;

public class Contrato {

    private int iden;
    private String status;
    private Date fim;
    private Date inicio;

    public int getIden() {
        return iden;
    }

    public void setIden(int iden) {
        this.iden = iden;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    @Override
    public String toString() {
        return "Contrato{" + "iden=" + iden + ", status=" + status
                + ", fim=" + fim + ", inicio=" + inicio + '}';
    }

}
