<%--
  Created by IntelliJ IDEA.
  User: slawekpaciorek
  Date: 02.12.18
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp"%>
<h2>Emloyees</h2>
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
            <button id="delete-record">Delete</button>
            <button id="modify-record">Modify</button>
        </td>
    </tr>
</c:forEach>
</table>
</body>
</html>
