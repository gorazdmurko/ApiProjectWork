<%--
  Created by IntelliJ IDEA.
  User: Gorazd
  Date: 27/06/2022
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="homeView" tagdir="/WEB-INF/tags" %>

<%-- css --%>
<%--<spring:url value="/src/main/webapp/static/css/global.css" var="globalCss" />--%>
<%-- jQuery --%>
<%--<spring:url value="../static/jquery/jquery.1.10.2.min.js" var="jqueryJs" />--%>
<%-- javascript --%>
<%--<c:url value="../static/javascript/main.js" var="globalJS" />--%>

<%--<script src="${globalJS}"></script>--%>
<%--<link href="${globalCss}" rel="stylesheet" />--%>
<%--<link href="<c:url value="../static/javascript/main.js" />" rel="stylesheet" />--%>

<!-- https://github.com/TinaXing2012/Spring/blob/master/SpringValidationXML/src/main/java/xing/rujuan/controller/HomeController.java -->

<html>
<head>
    <title>Home</title>
</head>
<!-- BODY -->
<body class="body">

    <homeView:homeView />

    <div>
        <form:form action="blagajna/get" method="post">
            <input type="submit" name="getBlagajne" value="BLAGAJNE" class="inputButton">
        </form:form>
    </div>

    <div>
        <form:form action="poslovne_enote/get" method="post">
            <input type="submit" name="getPoslovneEnote" value="POSLOVNE ENOTE" class="inputButton">
        </form:form>
    </div>

    <div>
        <form:form action="postne_stevilke/get" method="post">
            <input type="submit" name="getPostneStevilke" value="POSTNE STEVILKE" class="inputButton">
        </form:form>
    </div>

    <div>
        <form:form action="drzava/get" method="post">
            <input type="submit" name="getDrzava" value="DRZAVE" class="inputButton">
        </form:form>
    </div>

    <div>
        <form:form action="davcne-stopnje/get" method="post">
            <input type="submit" name="getDavcnaStopnja" value="DAVCNA STOPNJA" class="inputButton">
        </form:form>
    </div>

    <div>
        <form:form action="dodatne-storitve-postavke/get" method="post">
            <input type="submit" name="getDodatneStoritve" value="DODATNE STORITVE" class="inputButton">
        </form:form>
    </div>

</body>
<style>
    /* CSS */
    <%@ include file="/WEB-INF/static/css/global.css" %>
</style>
</html>
