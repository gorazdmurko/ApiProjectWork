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

<testViewTag:izdani_rac_postavke />

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
        <c:if test="${id_izd_rac_pos != null}">
            <table style="border: blueviolet" border="1">
                <tr>
                    <th style="color: mediumvioletred"> - ID IZDANI RAC. POSTAVKE - </th>
                    <th style="color: mediumvioletred"> - ID IZDANI RACUNI - </th>
                    <th style="color: mediumvioletred"> - ID IZDELKI STORITVE - </th>
                    <th style="color: mediumvioletred"> - KOLCINA - </th>
                    <th style="color: mediumvioletred"> - POPUST - </th>
                    <th style="color: mediumvioletred"> - ODSTOTEK DDV - </th>
                    <th style="color: mediumvioletred"> - ID DAV. STOPNJE - </th>
                    <th style="color: mediumvioletred"> - PLACA ZZZS - </th>
                </tr>
                <tr>
                    <td>${id_izd_rac_pos}</td>
                    <td>${id_izd_rac}</td>
                    <td>${id_izd_sto}</td>
                    <td>${kolicina}</td>
                    <td>${popust}</td>
                    <td>${ods_ddv}</td>
                    <td>${id_dav_sto}</td>
                    <td>${placa_zzzs}</td>
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