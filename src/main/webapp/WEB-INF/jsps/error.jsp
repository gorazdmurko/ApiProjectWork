<%--
  Created by IntelliJ IDEA.
  User: Gorazd
  Date: 22. 06. 2022
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Error Page</title>
</head>
    <body>
        <h1>This is a customized error page</h1>

        <div class="error">
            <h4>${error}</h4>
        </div>

        <div align="center">
            <c:set var="controllerUrl" value="${url}" />
            <form:form action="/ApiProjectWork/${controllerUrl}/getForm1" method="get">
                <input type="submit" value="BACK" class="submitButton" />
            </form:form>
        </div>

    </body>
</html>

<style>
    body {
        background-color: lightgray;
        color: darkblue;
    }

    h1 {
        margin: 20px;
        display: block;
        background-color: lightpink;
        text-align: center;
    }

    .submitButton {
        width: 8vw;
        height: 4vh;
        margin-top: 4vw;
        background-color: #333;
        color: bisque;
        border: 2px solid bisque;
    }

    .submitButton:hover {
        cursor: pointer;
    }

    .error {
        margin: 10px 0;
        padding: 0 20px;
        font-family: sans-serif;
        line-height: normal;
        letter-spacing: normal;
        text-align: center;
    }

    .submitButton:hover {
        background-color: bisque;
        color: #333;
        border-color: #333;
    }
</style>
