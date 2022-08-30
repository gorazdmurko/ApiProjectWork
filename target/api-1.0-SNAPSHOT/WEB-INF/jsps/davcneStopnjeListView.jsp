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
    <h1>DAVCNE STOPNJE</h1>
    <div>
        <table style="border: blueviolet" border="1">
            <tr>
                <th style="color: mediumvioletred"> - ID DAVCNE STOPNJE - </th>
                <th style="color: mediumvioletred"> - OZNAKA_DDV - </th>
                <th style="color: mediumvioletred"> - DAVCNA STOPNJA - </th>
                <th style="color: mediumvioletred"> - ODSTOTEK - </th>
            </tr>
            <!-- "blagajne" is the key value (attributeName) in our BlagajnaController method -->
            <c:forEach var="stopnja" items="${stopnje}">
                <tr>
                    <td>${stopnja.id_davcne_stopnje}</td>
                    <td>${stopnja.oznaka_ddv}</td>
                    <td>${stopnja.davcna_stopnja}</td>
                    <td>${stopnja.odstotek}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <br />
    <div>
        <div>
            <c:set var="controllerUrl" value="davcne-stopnje" />
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
