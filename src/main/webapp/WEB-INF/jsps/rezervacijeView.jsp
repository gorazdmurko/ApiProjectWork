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

<testViewTag:testView />

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
    <c:if test="${id != null}">
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
            <tr>
                <td>${id_rez}</td>
                <td>${id_pos_en}</td>
                <td>${id_os_gos}</td>
                <td>${st_rez}</td>
                <td>${dat_cas}</td>
                <td>${prihod}</td>
                <td>${odhod}</td>
                <td>${id_zaposleni}</td>
            </tr>
        </table>
    </c:if>
</div>
</body>
</html>

<style>
    <%@ include file="/WEB-INF/static/css/global.css" %>
</style>