package br.com.reger.domain;

import java.io.Serializable;
import java.util.List;

import br.com.reger.domain.Usuario;
import br.com.reger.domain.UsuarioService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "dtUserView")
@ViewScoped
public class UsuarioView implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<Usuario> users;

	@ManagedProperty("#{UsuarioService}")
	private UsuarioService userService;

	@PostConstruct
	public void init() {
		users = userService.getUsuarios();
	}

	public List<Usuario> getUsers() {
		return users;
	}

	public void setService(UsuarioService userServie) {
		this.userService = userServie;
	}

}
