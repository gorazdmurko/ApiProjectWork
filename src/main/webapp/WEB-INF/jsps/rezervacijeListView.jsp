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
        <th style="color: mediumvioletred"> - ID REZERVACIJE - </th>
        <th style="color: mediumvioletred"> - ID POSL.ENOTE - </th>
        <th style="color: mediumvioletred"> - ID OSEBE GOSTI - </th>
        <th style="color: mediumvioletred"> - ST.REZERVACIJE - </th>
        <th style="color: mediumvioletred"> - DATUM / CAS - </th>
        <th style="color: mediumvioletred"> - PRIHOD - </th>
        <th style="color: mediumvioletred"> - ODHOD - </th>
        <th style="color: mediumvioletred"> - ID ZAPOSLENI - </th>
    </tr>
    <!-- "blagajne" is the key value (attributeName) in our BlagajnaController method -->
    <c:forEach var="rezervacija" items="${rezervacije}">
        <tr>
            <td>${rezervacija.id_rezervacije}</td>
            <td>${rezervacija.id_poslovne_enote}</td>
            <td>${rezervacija.id_osebe_gosti}</td>
            <td>${rezervacija.stevilka_rezervacije}</td>
            <td>${rezervacija.datum_cas}</td>
            <td>${rezervacija.datum_prihod}</td>
            <td>${rezervacija.datum_odhod}</td>
            <td>${rezervacija.id_zaposleni}</td>
        </tr>
    </c:forEach>
</table>
<br />
<div>
    <button:buttonHome />
    <div>
        <c:set var="controllerUrl" value="rezervacije" />
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
