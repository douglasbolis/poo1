package acCommon.acEnum;

/**
 * Created by douglas on 07/06/16.
 */
public enum EventoProfissional {
    REUNIAOAREA("reunião de área"), LEILAO("leilão"), REUNIAOLANCPROD("reunião de lançamento de produtos"),
    REUNIAOTRAB("reunião de trabalho"), REUNIAOEQ("reunião de equipe");

    private String evento;

    EventoProfissional(String evento){
        this.evento = evento;
    }

    public String getEvento() {
        return evento;
    }
}
