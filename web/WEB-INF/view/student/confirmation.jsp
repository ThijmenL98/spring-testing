<%--
  Created by IntelliJ IDEA.
  User: thijm
  Date: 29/08/2022
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Student Confirmation</title>
    </head>
    <body>
        Student confirmed: ${student.firstName} ${student.lastName} from ${student.continent}.
        <br/>
        Favourite language: ${student.favouriteLanguage}.
        <br/>
        Using OS's:
        <ul>
            <c:forEach var="temp" items="${student.operatingSystems}">
                <li>${temp}</li>
            </c:forEach>
        </ul>
    </body>
</html>
