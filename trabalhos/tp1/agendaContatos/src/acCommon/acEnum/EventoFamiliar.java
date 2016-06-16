package acCommon.acEnum;

/**
 * Created by douglas on 07/06/16.
 */
public enum EventoFamiliar {
    JANTAR("jantar"), FESTA("festa"), ALMOCO("almoço"), VISITA("visita a um parente");

    private String evento;

    EventoFamiliar(String evento){
        this.evento = evento;
    }

    public String getEvento() {
        return evento;
    }
}
