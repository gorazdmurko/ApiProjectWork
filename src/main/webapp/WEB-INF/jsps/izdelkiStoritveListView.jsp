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
<h1 align="center">
    IZDELKI STORITVE
</h1>
<table style="border: blueviolet" border="1">
    <tr>
        <th style="color: mediumvioletred"> - ID IZDELKI STORITVE - </th>
        <th style="color: mediumvioletred"> - IZDELEK STORITEV - </th>
        <th style="color: mediumvioletred"> - IZDELEK STOR. K. - </th>
        <th style="color: mediumvioletred"> - PRODAJNA CENA - </th>
        <th style="color: mediumvioletred"> - ID KATEGORIJE - </th>
        <th style="color: mediumvioletred"> - ID DAVCNE STOPNJE - </th>
        <th style="color: mediumvioletred"> - ID PP PROIZVAJALCI - </th>
        <th style="color: mediumvioletred"> - PAKET - </th>
        <th style="color: mediumvioletred"> - OPIS - </th>
        <th style="color: mediumvioletred"> - ID PP ZUN. IZV. - </th>
        <th style="color: mediumvioletred"> - ZUNAJNA STORITEV - </th>
    </tr>
    <!-- "blagajne" is the key value (attributeName) in our BlagajnaController method -->
    <c:forEach var="storitev" items="${storitve}">
        <tr>
            <td>${storitev.id_izdelki_storitve}</td>
            <td>${storitev.izdelek_storitev}</td>
            <td>${storitev.izdelek_storitev_k}</td>
            <td>${storitev.prodajna_cena}</td>
            <td>${storitev.id_kategorije}</td>
            <td>${storitev.id_davcne_stopnje}</td>
            <td>${storitev.id_pp_proizvajalci}</td>
            <td>${storitev.paket}</td>
            <td>${storitev.opis}</td>
            <td>${storitev.id_pp_zunanji_izvajalec}</td>
            <td>${storitev.zunanja_storitev}</td>
        </tr>
    </c:forEach>
</table>
<br />
<div>
    <button:buttonHome />
    <div>
        <c:set var="controllerUrl" value="izdelki-storitve" />
        <form:form action="/ApiProjectWork/${controllerUrl}/get">
            <input type="submit" value="BACK" class="inputButton" />
        </form:form>
    </div>
</div>
</body>
<style>
    /* CSS */
    <%@ include file="/WEB-INF/static/css/global.css" %>
</style>
</html>
