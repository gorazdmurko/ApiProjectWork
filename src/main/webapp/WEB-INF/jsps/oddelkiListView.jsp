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
    ODDELKI
</h1>
<table style="border: blueviolet" border="1">
    <tr>
        <th style="color: mediumvioletred"> - ID ODDELKI - </th>
        <th style="color: mediumvioletred"> - ODDELEK NAZIV - </th>
        <th style="color: mediumvioletred"> - STEVILKA ODDELKA - </th>
        <th style="color: mediumvioletred"> - ID POSL.ENOTE ZDRAVILISCA - </th>
        <th style="color: mediumvioletred"> - TELEFON - </th>
        <th style="color: mediumvioletred"> - OPIS - </th>
        <th style="color: mediumvioletred"> - ID PP ZUN.IZVAJALEC - </th>
    </tr>
    <!-- "blagajne" is the key value (attributeName) in our BlagajnaController method -->
    <c:forEach var="oddelek" items="${oddelki}">
        <tr>
            <td>${oddelek.id_oddelki}</td>
            <td>${oddelek.oddelek_naziv}</td>
            <td>${oddelek.stevilka_oddelka}</td>
            <td>${oddelek.id_poslovne_enote_zdravilisce}</td>
            <td>${oddelek.telefon}</td>
            <td>${oddelek.opis}</td>
            <td>${oddelek.id_pp_zunanji_izvajalec}</td>
        </tr>
    </c:forEach>
</table>
<br />
<div>
    <button:buttonHome />
    <div>
        <c:set var="controllerUrl" value="oddelki" />
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
