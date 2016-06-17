package com.dblima.agendocontatos.acCommon.acEnum;

/**
 * Created by douglas on 07/06/16.
 */
public enum EventoSocial {
    FESTA("festa"), SHOW("show"), BAR("saída num bar"), CINEMA("cinema"), TEATRO("teatro"),
    PARQUE("parque"), FUTEBOL("jogo de futebol"), VOLEI("vôlei");

    private String evento;

    EventoSocial(String evento){
        this.evento = evento;
    }

    public String getEvento() {
        return evento;
    }
}
