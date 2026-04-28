// inorder to need this file to behave like a servlet, it should be child of HttpServlet


package web_applications;

// HttpServlet has methods -
// doGet, doPost, doPut, doDelete
// we need to override these methods.

// also we need to configure this 'MyServlet' file in web.xml file.
// i.e. inside the web.xml file we need to configure like -
// <servlet>
//          <servlet-name>FirstServlet</servlet-name>
//          <servlet-class>com.servlets.MyServlet</servlet-class>
// </servlet>
// <servlet-mapping>
//              <servlet-name>FirstServlet</servlet-name>
//              <url-pattern>/hi</url-pattern>
// </servlet-mapping>

import java.io.PrintWriter;

public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) {

        res.setContentType("text/html");  // to tell understand browser
        PrintWriter writer = res.getWriter();  // used to write on Browser
        writer.append("My First Web Application");  // same as - // System.out.println("My First Web Application");

    }

}
