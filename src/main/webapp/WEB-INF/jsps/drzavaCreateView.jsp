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
  <testViewTag:drzaveCreate />
  <div>
    <form:form action="createDrzave" modelAttribute="drzave" method="post">
      <table>
        <tr>
          <td><form:input id="idDrzave" path="id_drzave" type="number" /></td>
          <td><form:label for="idDrzave" path="id_drzave">ID</form:label></td>
        </tr>
        <tr>
          <td>&nbsp</td>
        </tr>
        <tr>
          <td><form:input id="drzava" path="drzava" type="text" /></td>
          <td><form:label for="drzava" path="drzava">DRZAVA</form:label></td>
        </tr>
        <tr>
          <td>&nbsp</td>
        </tr>
        <tr>
          <td><form:input id="oznaka" path="oznaka_drzave" type="text" /></td>
          <td><form:label for="oznaka" path="oznaka_drzave">OZNAKA</form:label></td>
        </tr>
        <tr>
          <td>&nbsp</td>
        </tr>
        <tr colspan="2">
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

<style>
  <%@ include file="/WEB-INF/static/css/global.css" %>
</style>