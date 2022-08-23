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
<table style="border: blueviolet" border="1">
    <tr>
        <th style="color: mediumvioletred"> - ID IZDANI RAC. POSTAVKE - </th>
        <th style="color: mediumvioletred"> - ID IZDANI RACUNI - </th>
        <th style="color: mediumvioletred"> - ID IZDELKI STORITVE - </th>
        <th style="color: mediumvioletred"> - KOLICINA - </th>
        <th style="color: mediumvioletred"> - POPUST - </th>
        <th style="color: mediumvioletred"> - ODSTOTEK DDV - </th>
        <th style="color: mediumvioletred"> - ID DAV. STOPNJE - </th>
        <th style="color: mediumvioletred"> - PLACA ZZZS - </th>
    </tr>
    <!-- "blagajne" is the key value (attributeName) in our BlagajnaController method -->
    <c:forEach var="postavka" items="${postavke}">
        <tr>
            <td>${postavka.id_izdani_racuni_postavke}</td>
            <td>${postavka.id_izdani_racuni}</td>
            <td>${postavka.id_izdelki_storitve}</td>
            <td>${postavka.kolicina}</td>
            <td>${postavka.popust}</td>
            <td>${postavka.odstotek_ddv}</td>
            <td>${postavka.id_davcne_stopnje}</td>
            <td>${postavka.placa_zzzs}</td>
        </tr>
    </c:forEach>
</table>
<br />
<div>
    <button:buttonHome />
    <div>
        <c:set var="controllerUrl" value="izdani-racuni-postavke" />
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
