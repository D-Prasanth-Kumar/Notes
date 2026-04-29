package web_applications.JSP;

@WebServlet("/SignUp")
public class SignUpServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) {

        String userName = req.getParameter("username");
        String password = req.getParamter("password");

        // we can also open session to have scope across the browser
        // HttpSession session = req.getSession();
        // session.setAttribute("pass", password);


        req.setAttribute("name", userName);  // "name" -> these are keys used for getting result in result.jsp file
        req.setAttribute("pass", password);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("result.jsp");
        requestDispatcher.forward(req, res);

    }
}
