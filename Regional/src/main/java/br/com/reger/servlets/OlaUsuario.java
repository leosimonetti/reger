package br.com.reger.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.reger.domain.Usuario;
import br.com.reger.domain.UsuarioService;
import br.com.reger.util.RegexUtil;

@WebServlet("/usuario/*")
public class OlaUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsuarioService userService = new UsuarioService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		Long id = RegexUtil.matchId(requestURI);

		if (id != null) {
			Usuario user = userService.getUsuario(id);
			if (user != null) {
				response.getWriter().print(user.getNomeUsuario());
			} else {
				response.getWriter().print("Não achei o usuário!");
			}

		} else {
			response.getWriter().print("Não achei o usuário!");
		}

	}

}
