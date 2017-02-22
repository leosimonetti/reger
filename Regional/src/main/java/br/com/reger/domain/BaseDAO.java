package br.com.reger.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {

	public BaseDAO() {
		try {
			// Biblioteca para usar o JDBC do MySQL
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// Erro de Driver
			e.printStackTrace();
		}
	}

	protected Connection getConnection() throws SQLException {
		// URL do banco de dados
		String urlDB = "jdbc:mysql://localhost/fesp";
		// Conecta
		Connection conn = DriverManager.getConnection(urlDB, "fesp", "48748724");
		return conn;
	}

	public static void main(String[] args) throws SQLException {
		BaseDAO db = new BaseDAO();
		// Testa a conexão
		Connection conn = db.getConnection();
		System.out.println(conn);
	}
}
