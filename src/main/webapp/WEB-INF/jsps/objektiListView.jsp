<%--
  Created by IntelliJ IDEA.
  User: Gorazd
  Date: 22/08/2022
  Time: 09:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="button" tagdir="/WEB-INF/tags" %>

<html>
<head>
    <title>API</title>
</head>
<body class="body">
<h1 align="center">
    OBJEKTI
</h1>
<table style="border: blueviolet" border="1">
    <tr>
        <th style="color: mediumvioletred"> - ID OBJEKTI - </th>
        <th style="color: mediumvioletred"> - OBJEKT - </th>
        <th style="color: mediumvioletred"> - OPIS - </th>
        <th style="color: mediumvioletred"> - ID POSL. ENOTE - </th>
    </tr>
    <!-- "blagajne" is the key value (attributeName) in our BlagajnaController method -->
    <c:forEach var="objekt" items="${objekti}">
        <tr>
            <td>${objekt.id_objekti}</td>
            <td>${objekt.objekt}</td>
            <td>${objekt.opis}</td>
            <td>${objekt.id_poslovne_enote}</td>
        </tr>
    </c:forEach>
</table>
<br />
<div>
    <button:buttonHome />
    <div>
        <c:set var="controllerUrl" value="objekti" />
        <form:form action="/ApiProjectWork/${controllerUrl}/get">
            <input type="submit" value="BACK" class="inputButton" />
        </form:form>
    </div>
</div>
</body>
<style>
    /* CSS */
    <%@ include file="/WEB-INF/static/css/global.css" %>
</style>
</html>
