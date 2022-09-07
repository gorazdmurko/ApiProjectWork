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
  <testViewTag:drzaveCreate />
  <div>
    <form:form action="createDrzave" modelAttribute="drzave" method="post">
      <table>
        <tr class="inputFormRow form">
          <td><form:input id="idDrzave" path="id_drzave" type="number" required="required" /></td>
          <td><b><form:label for="idDrzave" path="id_drzave">ID</form:label></b></td><span id="errorMessage"></span>
        </tr>
        <tr class="emptySpace">
          <td>&nbsp</td>
        </tr>
        <tr class="inputFormRow form">
          <td><form:input id="drzava" path="drzava" type="text" required="required" /></td>
          <td><b><form:label for="drzava" path="drzava">DRZAVA</form:label></b></td>
        </tr>
        <tr class="emptySpace">
          <td>&nbsp</td>
        </tr>
        <tr class="inputFormRow form">
          <td><form:input id="oznaka" path="oznaka_drzave" type="text" required="required" /></td>
          <td><b><form:label for="oznaka" path="oznaka_drzave">OZNAKA</form:label></b></td>
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
      <c:set var="controllerUrl" value="drzava" />
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