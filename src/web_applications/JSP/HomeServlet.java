package web_applications.JSP;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) {

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("signup.html");
        requestDispatcher.forward(req, res);
    }

}
