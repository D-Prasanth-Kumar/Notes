<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <!-- Using JSP we can dynamically render the data -->
    <%
      String name = (String) request.getAttribute("name");
      out.println(name);
     %>

     <%= name %>
    <h1>Welcome <%= name %>!!!</h1>
</body>
</html>