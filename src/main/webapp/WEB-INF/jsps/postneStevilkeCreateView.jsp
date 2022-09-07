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
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
    <script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
</head>

<body class="body">

<div align="center">
    <testViewTag:postneStevilkeCreate />
    <div>
        <form:form action="createPostneStevilke" modelAttribute="postnestevilke" method="post">
            <table>
                <tr class="inputFormRow form">
                    <td><form:input id="idPostneStevilke" path="id_postne_stevilke" type="number" required="required" /></td><span id="error"></span>
                    <td><b><form:label for="idPostneStevilke" path="id_postne_stevilke">ID POSTNE STEVILKE</form:label></b></td>
                </tr>
                <tr class="emptySpace">
                    <td>&nbsp</td>
                </tr>
                <tr class="inputFormRow form">
                    <td><form:input id="postnaStevilka" path="postna_stevilka" type="text" required="required" /></td>
                    <td><b><form:label for="postnaStevilka" path="postna_stevilka">POSTNA STEVILKA</form:label></b></td>
                </tr>
                <tr class="emptySpace">
                    <td>&nbsp</td>
                </tr>
                <tr class="inputFormRow form">
                    <td><form:input id="kraj" path="kraj_mesto" type="text" required="required" /></td>
                    <td><b><form:label for="kraj" path="kraj_mesto">MESTO</form:label></b></td>
                </tr>
                <tr class="emptySpace">
                    <td>&nbsp</td>
                </tr>
                <tr class="inputFormRow form">
                    <td><form:input id="stateId" path="id_drzave" type="number" required="required" /></td>
                    <td><b><form:label for="stateId" path="id_drzave">ID DRZAVE</form:label></b></td>
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
            <c:set var="controllerUrl" value="postne_stevilke" />
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

<!-- JAVASCRIPT import !! -->
<script>
    <%@ include file="/WEB-INF/static/javascript/main.js"%>
</script>

<!-- CSS import !! -->
<style>
    <%@ include file="/WEB-INF/static/css/global.css" %>
</style>