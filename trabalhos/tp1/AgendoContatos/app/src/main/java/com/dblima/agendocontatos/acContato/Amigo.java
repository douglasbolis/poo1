package com.dblima.agendocontatos.acContato;

/**
 * Created by douglas on 07/06/16.
 */
import acCommon.acEnum.RelacaoAmigo;

import java.util.HashMap;
import java.util.Map;

public class Amigo extends Contato {
    private String nivel;
    private RelacaoAmigo relacao;

    // Gostos
    private Map<String,Boolean> musicais = new HashMap<>();
    private Map<String,Boolean> literarios = new HashMap<>();
    private Map<String,Boolean> diversoes = new HashMap<>();
    private Map<String,Boolean> esportes = new HashMap<>();

    // preenchendo gostos musicais
    musicais.put("mpb", 0);
    musicais.put("rock", 0);
    musicais.put("classico", 0);

    // preenchendo gostos literários
    literarios.put("arte", 0);
    literarios.put("drama", 0);
    literarios.put("policial", 0);
    literarios.put("filosofia", 0);
    literarios.put("romanceficcao", 0);

    // preenchendo gostos diversões preferidas
    diversoes.put("barzinho", 0);
    diversoes.put("boite", 0);
    diversoes.put("cinema", 0);
    diversoes.put("circo", 0);

    // preenchendo gostos esportivos
    esportes.put("futebol". 0);
    esportes.put("basquete". 0);
    esportes.put("baseball". 0);
    esportes.put("escalada", 0);
    esportes.put("criquet", 0);
    esportes.put("ping-pong", 0);
    esportes.put("baralho", 0);

    public String getNivel() {
            return nivel;
    }

    public void setNivel(String nivel) {
				this.nivel = nivel;
		}

    public RelacaoAmigo getRelacao() {
        return relacao;
    }

    public void setRelacao(RelacaoAmigo relacao) {
        this.relacao = relacao;
    }
}
