<%--
  Created by IntelliJ IDEA.
  User: thijm
  Date: 29/08/2022
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <title>New Student Registration Form</title>

        <style>
            .error {color:red}
        </style>
    </head>

    <body>
        <form:form action="processForm" modelAttribute="student">
            First name: <form:input path="firstName"/>
            <form:errors path="firstName" cssClass="error"/>
            <br/>
            Last name: <form:input path="lastName"/>
            <form:errors path="lastName" cssClass="error"/>
            <br/>

            <br/>
            Continent:
            <form:select path="continent">
                <form:options items="${student.continentOptions}"/>
            </form:select>
            <br/>

            <br/>
            Favourite Language:
            <br/>
            <form:radiobuttons path="favouriteLanguage" items="${student.languageOptions}"/>
            <form:errors path="favouriteLanguage" cssClass="error"/>
            <br/>

            <br/>
            Operating Systems:
            <br/>
            <form:checkboxes path="operatingSystems" items="${student.operatingSystemOptions}"/>
            <br/>

            <br/>
            <input type="submit" value="Submit"/>
        </form:form>
    </body>
</html>
