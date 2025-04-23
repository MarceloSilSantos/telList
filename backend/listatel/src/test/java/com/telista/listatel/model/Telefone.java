package com.telista.listatel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Telefone {
	
	private Long idTel;
	private String numeroTelefone;
	
	@ManyToOne
	@JoinColumn(name = "idUser")
	//@JsonBackReference
	private User user;

	public Telefone(Long idTel, String numeroTelefone, User user) {
		super();
		this.idTel = idTel;
		this.numeroTelefone = numeroTelefone;
		this.user = user;
	}

	public Long getIdTel() {
		return idTel;
	}

	public void setIdTel(Long idTel) {
		this.idTel = idTel;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
