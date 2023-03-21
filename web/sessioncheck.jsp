<%--
  Created by IntelliJ IDEA.
  User: jay
  Date: 2023/3/21
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        if((session.getAttribute("code")==null)||session.getAttribute("code").equals("")){
            response.sendRedirect("login.html");
        }
    %>
</body>
</html>
