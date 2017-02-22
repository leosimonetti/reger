package br.com.reger.domain;

import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "UsuarioService")
@ApplicationScoped
public class UsuarioService {

	private UsuarioDAO db = new UsuarioDAO();

	public Usuario getUsuario(Long id) {
		try {
			return db.getUsuarioPorID(id);
		} catch (SQLException e) {
			return null;
		}
	}

	public List<Usuario> getUsuarios() {
		try {
			List<Usuario> users = db.getUsuarios();
			return users;
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Usuario>();
		}
	}

}
