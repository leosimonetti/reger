package br.com.reger.domain;

import java.io.Serializable;
import java.sql.Date;

public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nomeUsuario;
	private String senha;
	private Date ultimoLogin;
	private Boolean superUsuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getUltimoLogin() {
		return ultimoLogin;
	}

	public void setUltimoLogin(Date ultimoLogin) {
		this.ultimoLogin = ultimoLogin;
	}

	public Boolean getSuperUsuario() {
		return superUsuario;
	}

	public void setSuperUsuario(Boolean superUsuario) {
		this.superUsuario = superUsuario;
	}

}
