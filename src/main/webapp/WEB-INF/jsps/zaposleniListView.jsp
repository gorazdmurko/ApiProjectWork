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
<div align="center">
    <h1>ZAPOSLENI</h1>
    <div>
        <table style="border: blueviolet" border="1">
            <tr>
                <th style="color: mediumvioletred"> - ID ZAPOSLENI - </th>
                <th style="color: mediumvioletred"> - ZAPOSLITEV OD - </th>
                <th style="color: mediumvioletred"> - ZAPOSLITEV DO - </th>
                <th style="color: mediumvioletred"> - ID OSEBE - </th>
                <th style="color: mediumvioletred"> - ID POSL.ENOTE - </th>
                <th style="color: mediumvioletred"> - OPIS - </th>
            </tr>
            <!-- "blagajne" is the key value (attributeName) in our BlagajnaController method -->
            <c:forEach var="item" items="${zaposleni}">
                <tr>
                    <td>${item.id_zaposleni}</td>
                    <td>${item.zaposlitev_od}</td>
                    <td>${item.zaposlitev_do}</td>
                    <td>${item.id_osebe}</td>
                    <td>${item.id_poslovne_enote}</td>
                    <td>${item.opis}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <br />
    <div>
        <div>
            <c:set var="controllerUrl" value="zaposleni" />
            <form:form action="/ApiProjectWork/${controllerUrl}/get">
                <input type="submit" value="BACK" class="inputButton" />
            </form:form>
        </div>

        <button:buttonHome />
    </div>
</div>
</body>
<style>
    /* CSS */
    <%@ include file="/WEB-INF/static/css/global.css" %>
</style>
</html>
