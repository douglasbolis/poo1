package com.dblima.agendocontatos.acCommon.acEnum;

/**
 * Created by douglas on 14/06/16.
 */
import acCommon.acInterface.Relacao;

public enum RelacaoColega implements Relacao {
    TENSMED("Turma do Ensino Médio"),
    VBAIRRO("Vizinho de Bairro"),
    LOCTRAB("Local de Trabalho"),
    CONTATCOM("Contato comercial");

    private String relacao;

    RelacaoColega(String relacao) {
        this.relacao = relacao;
    }

    @Override
    public String getRelacao() {
        return relacao;
    }
}
