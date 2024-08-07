<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <h2>Welcome</h2> <br>
     <%
        String registerId = (String) request.getAttribute("registerID");     
     %>
     <h3>Register Id: </h3>
     <%= registerId %>
      

</body>
</html>