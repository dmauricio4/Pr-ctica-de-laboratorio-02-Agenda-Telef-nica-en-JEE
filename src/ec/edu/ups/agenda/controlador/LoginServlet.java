package ec.edu.ups.agenda.controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		
		if (usuario.equals("diego") && password.equals("diego")){
			HttpSession sesion = request.getSession(true);
			sesion.setAttribute("usuario", usuario);
			System.out.println("sesion TRUE");
			RequestDispatcher d = getServletContext().getRequestDispatcher("/calculadora.jsp");
			d.forward(request, response);
		}else {
			HttpSession sesion = request.getSession(false);
			System.out.println("sesion FALSE");
			RequestDispatcher d = getServletContext().getRequestDispatcher("/errorLogin.jsp");
			d.forward(request, response);
			
		}
	}

}
