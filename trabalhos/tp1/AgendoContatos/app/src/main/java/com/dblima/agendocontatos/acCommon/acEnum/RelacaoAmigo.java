package com.dblima.agendocontatos.acCommon.acEnum;

/**
 * Created by douglas on 14/06/16.
 */
import acCommon.acInterface.Relacao;

public enum RelacaoAmigo implements Relacao {
    TENSMED("Turma do Ensino Médio"),
    VBAIRRO("Vizinho de Bairro"),
    LOCTRAB("Local de Trabalho"),
    CONTATCOM("Contato comercial"),
    NAMO("Namorado(a)"),
    EXNAMO("Ex-namorado(a)"),
    AMIFACUL("Amigo da faculdade"),
    AMIINF("amigo de infância");

    private String relacao;

    RelacaoAmigo(String relacao) {
        this.relacao = relacao;
    }

    @Override
    public String getRelacao() {
        return relacao;
    }
}
