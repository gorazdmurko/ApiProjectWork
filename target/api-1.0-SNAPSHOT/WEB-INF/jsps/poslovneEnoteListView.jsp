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
    POSLOVNE ENOTE
</h1>
<table style="border: blueviolet" border="1">
    <tr>
        <th style="color: mediumvioletred"> - ID POSLOVNE ENOTE - </th>
        <th style="color: mediumvioletred"> - ENOTA - </th>
        <th style="color: mediumvioletred"> - OZNAKA - </th>
        <th style="color: mediumvioletred"> - NASLOV - </th>
        <th style="color: mediumvioletred"> - KRAJ - </th>
        <th style="color: mediumvioletred"> - POSTA - </th>
    </tr>
    <!-- "blagajne" is the key value (attributeName) in our BlagajnaController method -->
    <c:forEach var="enota" items="${enote}">
        <tr>
            <td>${enota.id_poslovne_enote}</td>
            <td>${enota.poslovna_enota}</td>
            <td>${enota.oznaka_poslovne_enote}</td>
            <td>${enota.naslov}</td>
            <td>${enota.kraj_izdaje_racuna}</td>
            <td>${enota.id_postne_stevilke}</td>
        </tr>
    </c:forEach>
</table>
<br />
<div>
    <button:buttonHome />
    <div>
        <form:form action="/ApiProjectWork/poslovne_enote/get">
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
