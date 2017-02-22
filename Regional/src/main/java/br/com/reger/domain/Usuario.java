package br.com.reger.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.annotation.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean(value = "Usuario")
@ViewScoped
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManagedProperty("#{id}")
	private Long id;
	
	@ManagedProperty("#{nomeUsuario}")
	private String nomeUsuario;
	
	@ManagedProperty("#{senha}")
	private String senha;
	
	@ManagedProperty("#{ultimoLogin}")
	private Date ultimoLogin;
	
	@ManagedProperty("#{superUsuario}")
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
