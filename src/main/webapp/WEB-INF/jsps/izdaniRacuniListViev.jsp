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
<div  align="center">
    <h1>IZDANI RACUNI</h1>
    <div>
        <table style="border: blueviolet" border="1">
            <tr>
                <th style="color: mediumvioletred"> - ID IZDANI RACUNI - </th>
                <th style="color: mediumvioletred"> - ST. RACUNA - </th>
                <th style="color: mediumvioletred"> - DATUM RACUNA - </th>
                <th style="color: mediumvioletred"> - ID POSL. ENOTE - </th>
                <th style="color: mediumvioletred"> - ID BLAGAJNE - </th>
                <th style="color: mediumvioletred"> - ID ZAPOSLENI - </th>
                <th style="color: mediumvioletred"> - ZOI - </th>
                <th style="color: mediumvioletred"> - EOR - </th>
                <th style="color: mediumvioletred"> - ID TR. RACUN POSL. ENOTE - </th>
                <th style="color: mediumvioletred"> - ID REZERVACIJE - </th>
            </tr>
            <!-- "blagajne" is the key value (attributeName) in our BlagajnaController method -->
            <c:forEach var="racun" items="${racuni}">
                <tr>
                    <td>${racun.id_izdani_racuni}</td>
                    <td>${racun.st_racuna}</td>
                    <td>${racun.datum_racuna}</td>
                    <td>${racun.id_poslovne_enote}</td>
                    <td>${racun.id_blagajne}</td>
                    <td>${racun.id_zaposleni}</td>
                    <td>${racun.zoi}</td>
                    <td>${racun.eor}</td>
                    <td>${racun.id_transakcijski_racuni_poslovne_enote}</td>
                    <td>${racun.id_rezervacije}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <br />
    <div>
        <div>
            <c:set var="controllerUrl" value="izdani-racuni" />
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
