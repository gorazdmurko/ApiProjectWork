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
<%@ taglib prefix="button" tagdir="/WEB-INF/tags" %>

<html>
<head>
    <title>Drzava</title>
</head>
<body class="body">

<div align="center">
    <testViewTag:osebaCreate />
    <div>
        <form:form action="createOsebe" modelAttribute="osebe" method="post">
            <table>
                <tr class="inputFormRow form">
                    <td><form:input id="idosebe" path="id_osebe" type="number" /></td>
                    <td><b><form:label for="idosebe" path="id_osebe">ID OSEBE</form:label></b></td>
                </tr>
                <tr class="emptySpace">
                    <td>&nbsp</td>
                </tr>
                <tr class="inputFormRow form">
                    <td><form:input id="ime" path="ime" type="text" /></td>
                    <td><b><form:label for="ime" path="ime">IME</form:label></b></td>
                </tr>
                <tr class="emptySpace">
                    <td>&nbsp</td>
                </tr>
                <tr class="inputFormRow form">
                    <td><form:input id="priimek" path="priimek" type="text" /></td>
                    <td><b><form:label for="priimek" path="priimek">PRIIMEK</form:label></b></td>
                </tr>
                <tr class="emptySpace">
                    <td>&nbsp</td>
                </tr>
                <tr class="inputFormRow form">
                    <td><form:input id="emso" path="emso" type="text" /></td>
                    <td><b><form:label for="emso" path="emso">EMSO</form:label></b></td>
                </tr>
                <tr class="emptySpace">
                    <td>&nbsp</td>
                </tr>
                <tr class="inputFormRow form">
                    <td><form:input id="spol" path="spol" type="text" /></td>
                    <td><b><form:label for="spol" path="spol">SPOL</form:label></b></td>
                </tr>
                <tr class="emptySpace">
                    <td>&nbsp</td>
                </tr>
                <tr class="inputFormRow form">
                    <td><form:input id="datumRojstva" path="datum_rojstva" type="date" /></td>
                    <td><b><form:label for="datumRojstva" path="datum_rojstva">DATUM ROJSTVA</form:label></b></td>
                </tr>
                <tr class="emptySpace">
                    <td>&nbsp</td>
                </tr>
                <tr class="inputFormRow form">
                    <td><form:input id="naslov" path="naslov" type="text" /></td>
                    <td><b><form:label for="naslov" path="naslov">NASLOV</form:label></b></td>
                </tr>
                <tr class="emptySpace">
                    <td>&nbsp</td>
                </tr>
                <tr class="inputFormRow form">
                    <td><form:input id="davcnaStevilka" path="davcna_stevilka" type="text" /></td>
                    <td><b><form:label for="davcnaStevilka" path="davcna_stevilka">DAVCNA STEVILKA</form:label></b></td>
                </tr>
                <tr class="emptySpace">
                    <td>&nbsp</td>
                </tr>
                <tr class="inputFormRow form">
                    <td><form:input id="idPostneStevilke" path="id_postne_stevilke" type="text" /></td>
                    <td><b><form:label for="idPostneStevilke" path="id_postne_stevilke">ID POSTNE STEVILKE</form:label></b></td>
                </tr>
                <tr class="emptySpace">
                    <td>&nbsp</td>
                </tr>
                <tr class="inputFormRow emptySpace" colspan="2">
                    <td><input class="action" type="submit" value="SAVE"></td>
                </tr>
            </table>
        </form:form>
    </div>
    <br />
    <div>
        <div class="inline">
            <c:set var="controllerUrl" value="osebe" />
            <form:form action="/ApiProjectWork/${controllerUrl}/get">
                <input type="submit" value="BACK" class="inputButton" />
            </form:form>
        </div>

        <div class="inline">
            <button:buttonHome />
        </div>
    </div>
</div>

</body>
</html>

<style>
    <%@ include file="/WEB-INF/static/css/global.css" %>
</style>