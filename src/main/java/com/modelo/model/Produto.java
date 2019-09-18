package com.modelo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produto {
	
	private static final long SerialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	
	private String descricao;
	
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
