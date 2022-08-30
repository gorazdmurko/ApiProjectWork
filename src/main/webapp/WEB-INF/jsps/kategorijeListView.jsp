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
    <h1>KATEGORIJE</h1>
    <div>
        <table style="border: blueviolet" border="1">
            <tr>
                <th style="color: mediumvioletred"> - ID KATEGORIJE - </th>
                <th style="color: mediumvioletred"> - KATEGORIJA - </th>
                <th style="color: mediumvioletred"> - OZNAKA - </th>
                <th style="color: mediumvioletred"> - OPIS - </th>
                <th style="color: mediumvioletred"> - ID NADR.KATEGORIJE - </th>
            </tr>
            <!-- "blagajne" is the key value (attributeName) in our BlagajnaController method -->
            <c:forEach var="kategorija" items="${kategorije}">
                <tr>
                    <td>${kategorija.id_kategorije}</td>
                    <td>${kategorija.kategorija}</td>
                    <td>${kategorija.oznaka}</td>
                    <td>${kategorija.opis}</td>
                    <td>${kategorija.id_nadrejene_kategorije}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <br />
    <div>
        <div>
            <c:set var="controllerUrl" value="kategorije" />
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
