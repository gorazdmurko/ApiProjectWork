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
        <th style="color: mediumvioletred"> - ID POSTNE STEVILKE - </th>
        <th style="color: mediumvioletred"> - POSTNA STEVILKA - </th>
        <th style="color: mediumvioletred"> - KRAJ - </th>
        <th style="color: mediumvioletred"> - ID DRZAVE - </th>
    </tr>
    <!-- "blagajne" is the key value (attributeName) in our BlagajnaController method -->
    <c:forEach var="stevilka" items="${stevilke}">
        <tr>
            <td>${stevilka.id_postne_stevilke}</td>
            <td>${stevilka.postna_stevilka}</td>
            <td>${stevilka.kraj_mesto}</td>
            <td>${stevilka.id_drzave}</td>
        </tr>
    </c:forEach>
</table>
<br />
<div>
    <button:buttonHome />
    <div>
        <form:form action="/ApiProjectWork/postne_stevilke/get">
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