package com.dblima.agendocontatos.acCommon.acEnum;

/**
 * Created by douglas on 01/06/16.
 */
public enum NivelProximidade {
    MPROXIMO("Muito próximo"),
    PROXIMO("Próximo"),
    REGULAR("Regular"),
    DISTANTE("Distante"),
    INCOMPAT("Incompatível");

    private String nivelProx;

    NivelProximidade(String nivelProx){
        this.nivelProx = nivelProx;
    }

    public String getNivelProx() {
        return nivelProx;
    }
}
