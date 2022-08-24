<%--
  Created by IntelliJ IDEA.
  User: Gorazd
  Date: 15/07/2022
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="testViewTag" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Test</title>
</head>
<body class="body">

<testViewTag:osebe />

<div>
    <form:form action="getEntity" method="post">
        <label for="id">ID blagajne</label>
        <input type="number" id="id" name="id" />
        <input type="submit" value="FETCH" />
        <span>${error}</span>
    </form:form>
</div>
<br />
<div>
    <form:form action="getList" method="get">
        <label for="getAll" name="getAll">GET ALL</label>
        <input type="submit" id="getAll" value="GET ALL">
    </form:form>
</div>
<div>
    <form:form action="/ApiProjectWork" method="get">
        <input type="submit" value="HOME" class="inputButton" />
    </form:form>
</div>
<div>
    <c:if test="${id_osebe != null}">
        <table style="border: blueviolet" border="1">
            <tr>
                <th style="color: mediumvioletred"> - ID OSEBE - </th>
                <th style="color: mediumvioletred"> - IME - </th>
                <th style="color: mediumvioletred"> - PRIIMEK - </th>
                <th style="color: mediumvioletred"> - EMSO - </th>
                <th style="color: mediumvioletred"> - SPOL - </th>
                <th style="color: mediumvioletred"> - DATUM ROJSTVA - </th>
                <th style="color: mediumvioletred"> - NASLOV - </th>
                <th style="color: mediumvioletred"> - DAVCNA ST. - </th>
                <th style="color: mediumvioletred"> - ID POSTNE ST. - </th>
            </tr>
            <tr>
                <td>${id_osebe}</td>
                <td>${ime}</td>
                <td>${priimek}</td>
                <td>${emso}</td>
                <td>${spol}</td>
                <td>${dat_roj}</td>
                <td>${naslov}</td>
                <td>${davcna}</td>
                <td>${id_pos_ste}</td>
            </tr>
        </table>
    </c:if>
</div>
</body>
</html>

<style>
    <%@ include file="/WEB-INF/static/css/global.css" %>
</style>