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
    <table style="border: blueviolet" border="1">
        <tr>
            <th style="color: mediumvioletred"> - ID BLAGAJNE - </th>
            <th style="color: mediumvioletred"> - OZNAKA - </th>
            <th style="color: mediumvioletred"> - ID POSLOVNE ENOTE - </th>
        </tr>
        <!-- "blagajne" is the key value (attributeName) in our BlagajnaController method -->
        <c:forEach var="blagajna" items="${blagajne}">
            <tr>
                <td>${blagajna.id_blagajne}</td>
                <td>${blagajna.oznaka_blagajne}</td>
                <td>${blagajna.id_poslovne_enote}</td>
            </tr>
        </c:forEach>
    </table>
    <br />
    <div>
        <button:buttonHome />
        <div>
            <c:set var="url" value="blagajna" />
            ${url}
            <form:form action="/ApiProjectWork/${url}/get">
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
