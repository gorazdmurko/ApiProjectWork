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
        <th style="color: mediumvioletred"> - ID OSEBE - </th>
        <th style="color: mediumvioletred"> - IME - </th>
        <th style="color: mediumvioletred"> - PRIIMEK - </th>
        <th style="color: mediumvioletred"> - EMSO - </th>
        <th style="color: mediumvioletred"> - SPOL - </th>
        <th style="color: mediumvioletred"> - DATUM ROJSTVA - </th>
        <th style="color: mediumvioletred"> - NASLOV - </th>
        <th style="color: mediumvioletred"> - E-NASLOV - </th>
        <th style="color: mediumvioletred"> - TELEFON - </th>
        <th style="color: mediumvioletred"> - DAVCNA ST. - </th>
        <th style="color: mediumvioletred"> - ID POSTNE ST. - </th>
    </tr>
    <!-- "blagajne" is the key value (attributeName) in our BlagajnaController method -->
    <c:forEach var="oseba" items="${osebe}">
        <tr>
            <td>${oseba.id_osebe}</td>
            <td>${oseba.ime}</td>
            <td>${oseba.priimek}</td>
            <td>${oseba.emso}</td>
            <td>${oseba.spol}</td>
            <td>${oseba.datum_rojstva}</td>
            <td>${oseba.naslov}</td>
            <td>${oseba.enaslov}</td>
            <td>${oseba.telefon}</td>
            <td>${oseba.davcna_stevilka}</td>
            <td>${oseba.id_postne_stevilke}</td>
        </tr>
    </c:forEach>
</table>
<br />
<div>
    <button:buttonHome />
    <div>
        <c:set var="controllerUrl" value="osebe" />
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
