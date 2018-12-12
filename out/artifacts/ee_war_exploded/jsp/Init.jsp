<%--
  Created by IntelliJ IDEA.
  User: jarik
  Date: 12.12.2018
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Init JSP</title>
</head>
<body>
init jsp
    <%!
        public void jspInit(){
            System.out.println("Initialize JSP");
        }
        public void jspDestroy(){
            System.out.println("JSP destroy");
        }


    %>
</body>
</html>
