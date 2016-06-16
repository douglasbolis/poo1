package acCommon.acEnum;

/**
 * Created by douglas on 07/06/16.
 */
public enum Exclusividade {
    FECHADO("fechado"),
    RESERVADO("reservado"),
    GRANDE("grande"),
    ABERTO("aberto");

    private String exclusividade;

    Exclusividade(String exclusividade){
        this.exclusividade = exclusividade;
    }

    public String getExclusividade() {
        return exclusividade;
    }
}
