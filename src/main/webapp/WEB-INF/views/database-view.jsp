<%--
  Created by IntelliJ IDEA.
  User: slawekpaciorek
  Date: 02.12.18
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="header.jsp"%>
<h2>Employees</h2>
<table class="database">
    <tr>
        <th>Id number</th>
        <th>Employee name</th>
        <th>Employee last name</th>
        <th>Employee email</th>
        <th>Employee salary</th>
        <th>Operations</th>
    </tr>
<c:forEach items="${employees}" var="employee">
    <tr>
        <td>${employee.id}</td>
        <td>${employee.name}</td>
        <td>${employee.lastName}</td>
        <td>${employee.email}</td>
        <td>${employee.salary}</td>
        <td>
            <form:form method="get" action="employee-delete-confirmation" cssClass="action-form">
                <button id="delete-record" type="submit" name="id" value="${employee.id}">Delete</button>
            </form:form>
            <form:form method="get" action="employee-modification-form" cssClass="action-form">
                <button id="modify-record" type="submit" name="id" value="${employee.id}">Modify</button>
            </form:form>
        </td>
    </tr>
</c:forEach>
</table>
</body>
</html>
