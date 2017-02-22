package br.com.reger.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO extends BaseDAO {
	
	public Usuario getUsuarioPorID(Long id) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = getConnection();
			stmt = conn.prepareStatement("SELECT * FROM colaboradores WHERE ID=?");
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				Usuario user = criaUsuario(rs);
				rs.close();
				return user;
			}
		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return null;
	}

	public List<Usuario> encontrarPorNome(String nome) throws SQLException {
		List<Usuario> usuarios = new ArrayList<>();
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = getConnection();
			stmt = conn.prepareStatement("SELECT * FROM colaboradores WHERE lower(Usuario) LIKE ?");
			stmt.setString(1, "%" + nome.toLowerCase() + "%");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Usuario user = criaUsuario(rs);
				usuarios.add(user);
			}
			rs.close();
		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}

		}
		return usuarios;
	}

	public Usuario criaUsuario(ResultSet rs) throws SQLException {
		Usuario user = new Usuario();
		user.setId(rs.getLong("ID"));
		user.setNomeUsuario(rs.getString("Usuario"));
		user.setSenha(rs.getString("Senha"));
		if (rs.getString("SuperUsuario") == "1") {
			user.setSuperUsuario(true);
		} else {
			user.setSuperUsuario(false);
		}
		user.setUltimoLogin(rs.getDate("DataCadastro"));
		return user;
	}

}
