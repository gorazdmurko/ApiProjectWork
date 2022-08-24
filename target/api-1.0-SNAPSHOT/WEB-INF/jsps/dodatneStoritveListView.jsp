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
    <title>ALL BLAGAJNE</title>
</head>
<body class="body">
<h1 align="center">
    DODATNE STORITVE POSTAVKE
</h1>
<table style="border: blueviolet" border="1">
    <tr>
        <th style="color: mediumvioletred"> - ID DODATNE STORITVE - </th>
        <th style="color: mediumvioletred"> - ID REZERVACIJE DODATNE STORITVE - </th>
        <th style="color: mediumvioletred"> - ID STORITVE - </th>
        <th style="color: mediumvioletred"> - KOLICINA - </th>
        <th style="color: mediumvioletred"> - POPUST - </th>
        <th style="color: mediumvioletred"> - ZACETEK - </th>
        <th style="color: mediumvioletred"> - KONEC - </th>
        <th style="color: mediumvioletred"> - OPIS - </th>
    </tr>
    <!-- "blagajne" is the key value (attributeName) in our BlagajnaController method -->
    <c:forEach var="storitev" items="${storitve}">
        <tr>
            <td>${storitev.id_dodatne_storitve_postavke}</td>
            <td>${storitev.id_rezervacije_dodatne_storitve}</td>
            <td>${storitev.id_izdelki_storitve}</td>
            <td>${storitev.kolicina}</td>
            <td>${storitev.popust}</td>
            <td>${storitev.cas_zacetek}</td>
            <td>${storitev.cas_konec}</td>
            <td>${storitev.opis}</td>
        </tr>
    </c:forEach>
</table>
<br />
<div>
    <button:buttonHome />
    <div>
        <c:set var="controllerUrl" value="dodatne-storitve-postavke" />
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
