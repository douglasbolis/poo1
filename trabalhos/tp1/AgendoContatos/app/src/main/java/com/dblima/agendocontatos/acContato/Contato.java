package com.dblima.agendocontatos.acContato;

/**
 * Created by douglas on 07/06/16.
 */
import acCommon.Endereco;
import acCommon.acEnum.Genero;
import acCommon.acEnum.NivelProximidade;

import java.util.Date;

public abstract class Contato extends Endereco {
	private String nome;
	private String email;
	private String celular;
	private Date dataNasc;
	private Genero genero;
	private NivelProximidade proximidade;

	public Contato() {}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

    public void setProximidade(NivelProximidade proximidade) {
		this.proximidade = proximidade;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getCelular() {
		return celular;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public Genero getGenero() {
		return genero;
	}

	public NivelProximidade getProximidade() {
		return proximidade;
	}
}
