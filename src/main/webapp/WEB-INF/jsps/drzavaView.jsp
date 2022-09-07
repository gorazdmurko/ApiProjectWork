<%--
  Created by IntelliJ IDEA.
  User: Gorazd
  Date: 15/07/2022
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="testViewTag" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Drzava</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
    <script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
</head>
<body class="body">

<testViewTag:drzave />

<div align="center">
    <div>
        <form action="getDrzava", method="post">
            <label for="drzavaId">ID drzave</label>
            <input type="number" id="drzavaId" name="id" required />
            <input type="submit" value="FETCH" />
<%--            <input type="button" value="DELETE" id="deleteState" />--%>
            <span>${error}</span>
        </form>
    </div>
    <br />
    <div>
        <form action="getList", method="get">
            <label for="getAll" name="getAll">GET ALL</label>
            <input type="submit" id="getAll" value="GET ALL">
        </form>
    </div>
    <div>
        <form:form action="getForm2" method="get">
            <input type="submit" value="CREATE" class="inputButton" />
        </form:form>
    </div>
    <div>
        <form:form action="/ApiProjectWork" method="get">
            <input type="submit" value="HOME" class="inputButton" />
        </form:form>
    </div>
    <div>
        <c:if test="${id != null}">
            <table style="border: blueviolet" border="1">
                <tr>
                    <th style="color: mediumvioletred"> - ID DRZAVE - </th>
                    <th style="color: mediumvioletred"> - DRZAVA - </th>
                    <th style="color: mediumvioletred"> - OZNAKA DRZAVE - </th>
                </tr>
                <tr>
                    <td>${id}</td>
                    <td>${drzava}</td>
                    <td>${oznaka}</td>
                </tr>
            </table>
        </c:if>
    </div>
</div>
</body>
</html>

<!-- JAVASCRIPT import !! -->
<script>
    <%@ include file="/WEB-INF/static/javascript/main.js"%>
</script>

<!-- CSS import !! -->
<style>
    <%@ include file="/WEB-INF/static/css/global.css" %>
</style>