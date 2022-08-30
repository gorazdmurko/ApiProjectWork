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
<div align="center">
    <h1>REZERVACIJE DNEVNIK</h1>
    <div>
        <table style="border: blueviolet" border="1">
            <tr>
                <th style="color: mediumvioletred"> - ID DNEVNIK BLAGAJNE - </th>
                <th style="color: mediumvioletred"> - DATUM - CAS - </th>
                <th style="color: mediumvioletred"> - UPORABNIK - </th>
                <th style="color: mediumvioletred"> - OPERACIJA - </th>
                <th style="color: mediumvioletred"> - KLJUC - </th>
            </tr>
            <c:forEach var="dnevnik" items="${dnevniki}">
                <tr>
                    <td>${dnevnik.id_rezervacije_dnevnik}</td>
                    <td>${dnevnik.datum_cas}</td>
                    <td>${dnevnik.uporabnik}</td>
                    <td>${dnevnik.operacija}</td>
                    <td>${dnevnik.kljuc}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <br />
    <div>
        <div>
            <c:set var="controllerUrl" value="rezervacije-dnevnik" />
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
