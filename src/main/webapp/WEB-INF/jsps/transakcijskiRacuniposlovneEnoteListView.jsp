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
    TRANSAKCIJSKI RACUNI POSLOVNE ENOTE
</h1>
<table style="border: blueviolet" border="1">
    <tr>
        <th style="color: mediumvioletred"> - ID TR.RACUNI POSLOVNE EN. - </th>
        <th style="color: mediumvioletred"> - TR.RACUN - </th>
        <th style="color: mediumvioletred"> - ID POSL.ENOTE - </th>
        <th style="color: mediumvioletred"> - ID PP BANKE - </th>
        <th style="color: mediumvioletred"> - PRIVZETI - </th>
    </tr>
    <!-- "blagajne" is the key value (attributeName) in our BlagajnaController method -->
    <c:forEach var="enota" items="${enote}">
        <tr>
            <td>${enota.id_transakcijski_racuni_poslovne_enote}</td>
            <td>${enota.transakcijski_racun}</td>
            <td>${enota.id_poslovne_enote}</td>
            <td>${enota.id_pp_banke}</td>
            <td>${enota.privzeti}</td>
        </tr>
    </c:forEach>
</table>
<br />
<div>
    <button:buttonHome />
    <div>
        <c:set var="controllerUrl" value="transakcijski-racuni-enote" />
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
