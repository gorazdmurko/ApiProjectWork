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

<testViewTag:poslovne_enote />

<div>
    <form action="getEnota", method="post">
        <label for="enotaId">ID poslovne enote</label>
        <input type="number" id="enotaId" name="id" />      <!-- name="id" ... @RequestParam in controller !!! -->
        <input type="submit" value="FETCH" />
        <span>${error}</span>
    </form>
</div>
<br />
<div>
    <form action="getEnotaList", method="get">
        <label for="getAll" name="getAll">GET ALL</label>
        <input type="submit" id="getAll" value="GET ALL">
    </form>
</div>
<div>
    <form:form action="/ApiProjectWork" method="get">
        <input type="submit" value="HOME" class="inputButton" />
    </form:form>
</div>
<div>
    <c:if test="${id != null}">
        <table style="border: blueviolet" border="1">
            <tr>
                <th style="color: mediumvioletred"> - ID POSLOVNE ENOTE - </th>
                <th style="color: mediumvioletred"> - ENOTA - </th>
                <th style="color: mediumvioletred"> - OZNAKA - </th>
                <th style="color: mediumvioletred"> - NASLOV - </th>
                <th style="color: mediumvioletred"> - KRAJ - </th>
                <th style="color: mediumvioletred"> - POSTA - </th>
            </tr>
            <tr>
                <td>${id}</td>
                <td>${enota}</td>
                <td>${oznaka}</td>
                <td>${naslov}</td>
                <td>${kraj}</td>
                <td>${posta}</td>
            </tr>
        </table>
    </c:if>
</div>
</body>
</html>

<style>
    <%@ include file="/WEB-INF/static/css/global.css" %>

</style>