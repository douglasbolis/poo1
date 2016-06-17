package com.dblima.agendocontatos.acContato;

/**
 * Created by douglas on 07/06/16.
 */
import acCommon.acEnum.RelacaoColega;

public class Colega extends Contato {
    private String localTrabalho;
    private String profissao;
    private RelacaoColega relacao;

    public String getLocalTrabalho() {
        return localTrabalho;
    }

    public String getProfissao() {
        return profissao;
    }

    public RelacaoColega getRelacao() {
        return relacao;
    }

    public void setLocalTrabalho(String localTrabalho) {
        this.localTrabalho = localTrabalho;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setRelacao(RelacaoColega relacao) {
        this.relacao = relacao;
    }
}
