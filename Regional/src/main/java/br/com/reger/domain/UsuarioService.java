package br.com.reger.domain;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioService {

	private UsuarioDAO db = new UsuarioDAO();

	public Usuario getUsuario(Long id) {
		try {
			return db.getUsuarioPorID(id);
		} catch (SQLException e) {
			return null;
		}
	}

}
