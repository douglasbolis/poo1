package com.dblima.agendocontatos.acContato;

/**
 * Created by douglas on 07/06/16.
 */
import acCommon.acEnum.TipoParentesco;

public class Familia extends Contato {
	private TipoParentesco parentesco;

	public Familia() {}

	public void setParentesco(TipoParentesco parentesco) {
	this.parentesco = parentesco;
}

	public TipoParentesco getParentesco() {
				return parentesco;
		}
}
