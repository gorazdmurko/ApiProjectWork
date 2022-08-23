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
<table style="border: blueviolet" border="1">
    <tr>
        <th style="color: mediumvioletred"> - ID PAKETI POZICIJE - </th>
        <th style="color: mediumvioletred"> - ID IZDELKI STORITVE PAKETI - </th>
        <th style="color: mediumvioletred"> - ID IZDELKI STORITVE - </th>
        <th style="color: mediumvioletred"> - KOLICINA - </th>
    </tr>
    <!-- "blagajne" is the key value (attributeName) in our BlagajnaController method -->
    <c:forEach var="paket" items="${paketi}">
        <tr>
            <td>${paket.id_paketi_pozicije}</td>
            <td>${paket.id_izdelki_storitve_paketi}</td>
            <td>${paket.id_izdelki_storitve}</td>
            <td>${paket.kolicina}</td>
        </tr>
    </c:forEach>
</table>
<br />
<div>
    <button:buttonHome />
    <div>
        <c:set var="controllerUrl" value="paketi-pozicije" />
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