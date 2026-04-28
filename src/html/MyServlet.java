package html;

import java.io.PrintWriter;

@WebServlet("/hello")
public class MyServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) {

        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();
        writer.append("<h1>This is Heading</h1> +" +
                      "<h6>This is small Heading</h6>");
    }
}

// if want to work with direct html file (index.html) instead of writing in this file,'
// create a .html file inside the webapp/ folder in the project.
// index.html will be the by default homepage which gets loaded when open the url.

// RequestDispatcher - Request to Servlet will be dispatched to new html page. (we have to create new class and include new endpoint in @WebServlet)
// Ex: RequestDispatcher requestDispatcher = req.getRequestDispatcher("signup.html");
//     requestDispatcher.forward(req, res);
