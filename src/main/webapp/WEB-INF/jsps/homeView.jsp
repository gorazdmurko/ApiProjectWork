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

    <homeView:allEntities />

    <div class="grid_container" align="center">
        <div class="grid_item grid_item_1">
            <form:form action="blagajna/get" method="post">
                <input type="submit" name="get" value="BLAGAJNE" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_2">
            <form:form action="davcne-stopnje/get" method="post">
                <input type="submit" name="get" value="DAVCNA STOPNJA" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_3">
            <form:form action="dodatne-storitve-postavke/get" method="post">
                <input type="submit" name="get" value="DODATNE STOR. POSTAVKE" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_4">
            <form:form action="dnevnik-blagajne/get" method="post">
                <input type="submit" name="get" value=" DNEVNIK BLAGAJNE" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_5">
            <form:form action="drzava/get" method="post">
                <input type="submit" name="get" value="DRZAVE" class="inputButton transactional">
            </form:form>
        </div>

        <div class="grid_item grid_item_6">
            <form:form action="izdani-racuni/get" method="post">
                <input type="submit" name="get" value="IZDANI RACUNI" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_7">
            <form:form action="izdani-racuni-postavke/get" method="post">
                <input type="submit" name="get" value="IZDANI RACUNI POSTAVKE" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_8">
            <form:form action="izdelki-storitve/get" method="post">
                <input type="submit" name="get" value="IZDELKI STORITVE" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_9">
            <form:form action="izdelki-storitve-sobe/get" method="post">
                <input type="submit" name="get" value="IZDELKI STORITVE SOBE" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_10">
            <form:form action="kategorije/get" method="post">
                <input type="submit" name="get" value="KATEGORIJE" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_11">
            <form:form action="objekti/get" method="post">
                <input type="submit" name="get" value="OBJEKTI" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_12">
            <form:form action="oddelki/get" method="post">
                <input type="submit" name="get" value="ODDELKI" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_13">
            <form:form action="osebe/get" method="post">
                <input type="submit" name="get" value="OSEBE" class="inputButton transactional">
            </form:form>
        </div>

        <div class="grid_item grid_item_14">
            <form:form action="paketi-pozicije/get" method="post">
                <input type="submit" name="get" value="PAKETI POZICIJE" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_15">
            <form:form action="poslovne_enote/get" method="post">
                <input type="submit" name="getPoslovneEnote" value="POSLOVNE ENOTE" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_16">
            <form:form action="poslovni-partnerji/get" method="post">
                <input type="submit" name="get" value="POSLOVNI PARTNERJI" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_17">
            <form:form action="postne_stevilke/get" method="post">
                <input type="submit" name="getPostneStevilke" value="POSTNE STEVILKE" class="inputButton transactional">
            </form:form>
        </div>

        <div class="grid_item grid_item_18">
            <form:form action="kontakti/get" method="post">
                <input type="submit" name="get" value="PP KONTAKTI" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_19">
            <form:form action="racuni-placila/get" method="post">
                <input type="submit" name="get" value="RACUNI PLACILA" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_20">
            <form:form action="rezervacije/get" method="post">
                <input type="submit" name="get" value="REZERVACIJE" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_21">
            <form:form action="rezervacije-dnevnik/get" method="post">
                <input type="submit" name="get" value="REZERVACIJE DNEVNIK" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_22">
            <form:form action="rezervacije-dodatne-storitve/get" method="post">
                <input type="submit" name="get" value="REZERVACIJE DODATNE STORITVE" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_23">
            <form:form action="rezervacije-pozicije/get" method="post">
                <input type="submit" name="get" value="REZERVACIJE POZICIJE" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_24">
            <form:form action="rezervacije-sobe/get" method="post">
                <input type="submit" name="get" value="REZERVACIJE SOBE" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_25">
            <form:form action="sobe/get" method="post">
                <input type="submit" name="get" value="SOBE" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_26">
            <form:form action="sobe-statusi/get" method="post">
                <input type="submit" name="get" value="SOBE STATUSI" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_27">
            <form:form action="transakcijski-racuni/get" method="post">
                <input type="submit" name="get" value="TRANSAKCIJSKI RACUNI" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_28">
            <form:form action="transakcijski-racuni-enote/get" method="post">
                <input type="submit" name="get" value="TR. RACUNI POSL. ENOTE" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_29">
            <form:form action="vrste-placil/get" method="post">
                <input type="submit" name="get" value="VRSTE PLACIL" class="inputButton">
            </form:form>
        </div>

        <div class="grid_item grid_item_30">
            <form:form action="zaposleni/get" method="post">
                <input type="submit" name="get" value="ZAPOSLENI" class="inputButton">
            </form:form>
        </div>
    </div>
</body>
<style>
    /* CSS */
    <%@ include file="/WEB-INF/static/css/global.css" %>

    .grid_container {
        display: grid;
        grid-template-columns: repeat(5, 1fr);
        grid-auto-rows: 1fr;
        grid-row-gap: 0px;
        grid-column-gap: 0px;
    }
</style>
</html>
