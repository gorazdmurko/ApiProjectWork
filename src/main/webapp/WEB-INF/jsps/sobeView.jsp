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

<testViewTag:sobe />

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
    <c:if test="${id_sobe != null}">
        <table style="border: blueviolet" border="1">
            <tr>
                <th style="color: mediumvioletred"> - ID SOBE - </th>
                <th style="color: mediumvioletred"> - ST.SOBE - </th>
                <th style="color: mediumvioletred"> - ID OBJEKTI - </th>
                <th style="color: mediumvioletred"> - ID KATEGORIJE - </th>
                <th style="color: mediumvioletred"> - ID SOBE STATUSI - </th>
            </tr>
            <tr>
                <td>${id_sobe}</td>
                <td>${st_sob}</td>
                <td>${id_objekti}</td>
                <td>${id_kat}</td>
                <td>${id_sob_st}</td>
            </tr>
        </table>
    </c:if>
</div>
</body>
</html>

<style>
    <%@ include file="/WEB-INF/static/css/global.css" %>
</style>