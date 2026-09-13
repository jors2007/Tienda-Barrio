package com.jors.model;

public class Direccion {
    private String callePrincipal;
    private String calleSecundaria;

    public Direccion(String callePrincipal,String calleSecundaria){
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }   

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }
}
