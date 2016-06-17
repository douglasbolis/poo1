package com.dblima.agendocontatos.acCommon.acEnum;

/**
 * Created by douglas on 14/06/16.
 */
public enum TipoParentesco {
    PAI("Pai"), MAE("Mae"), FILHO("Filho(a)"), IRMAO("Irmão(ã)"), TIO("Tio(a)"), AVO("Avô(ó)");

    private String parent;

    TipoParentesco(String parent) {
        this.parent = parent;
    }

    public String getParentesco() {
        return parent;
    }
}
