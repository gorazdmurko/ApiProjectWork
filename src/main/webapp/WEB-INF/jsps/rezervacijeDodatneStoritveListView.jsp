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
    REZERVACIJE DODATNE STORITVE
</h1>
<table style="border: blueviolet" border="1">
    <tr>
        <th style="color: mediumvioletred"> - ID REZ. DODATNE ST. - </th>
        <th style="color: mediumvioletred"> - DATUM REZERVACIJE - </th>
        <th style="color: mediumvioletred"> - ID OSEBE - </th>
        <th style="color: mediumvioletred"> - ID ODDELKI - </th>
        <th style="color: mediumvioletred"> - OPIS - </th>
    </tr>
    <!-- "blagajne" is the key value (attributeName) in our BlagajnaController method -->
    <c:forEach var="storitev" items="${storitve}">
        <tr>
            <td>${storitev.id_rezervacije_dodatne_storitve}</td>
            <td>${storitev.datum_rezervacije}</td>
            <td>${storitev.id_osebe}</td>
            <td>${storitev.id_oddelki}</td>
            <td>${storitev.opis}</td>
        </tr>
    </c:forEach>
</table>
<br />
<div>
    <button:buttonHome />
    <div>
        <c:set var="controllerUrl" value="rezervacije-dodatne-storitve" />
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
