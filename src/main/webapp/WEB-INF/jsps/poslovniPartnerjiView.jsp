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

<testViewTag:poslovni_partnerji />

<div align="center">
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
        <c:if test="${id_pos_par != null}">
            <table style="border: blueviolet" border="1">
                <tr>
                    <th style="color: mediumvioletred"> - ID POSL. PARTNERJI - </th>
                    <th style="color: mediumvioletred"> - ID POSTNE ST. - </th>
                    <th style="color: mediumvioletred"> - NAZIV 1 - </th>
                    <th style="color: mediumvioletred"> - NAZIV 2 - </th>
                    <th style="color: mediumvioletred"> - DAVCNA ST. - </th>
                    <th style="color: mediumvioletred"> - MATICNA ST - </th>
                    <th style="color: mediumvioletred"> - NASLOV - </th>
                </tr>
                <tr>
                    <td>${id_pos_par}</td>
                    <td>${id_pos_ste}</td>
                    <td>${naziv1}</td>
                    <td>${naziv2}</td>
                    <td>${dav_ste}</td>
                    <td>${mat_ste}</td>
                    <td>${naslov}</td>
                </tr>
            </table>
        </c:if>
    </div>
</div>
</body>
</html>

<style>
    <%@ include file="/WEB-INF/static/css/global.css" %>
</style>