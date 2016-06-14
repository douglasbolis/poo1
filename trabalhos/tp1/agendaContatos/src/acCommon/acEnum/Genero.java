package acCommon.acEnum;

/**
 * Created by douglas on 07/06/16.
 */
public enum Genero {
    M("Homem"),
    F("Mulher");

    private String sexo;

    Genero(String _sexo){
        sexo = _sexo;
    }

    public String getGenero() {
        return sexo;
    }
}
