<%--
  Created by IntelliJ IDEA.
  User: slawekpaciorek
  Date: 30.11.18
  Time: 22:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h2>Employee Data</h2>
<table>
    <tr>
        <th>Name</th>
        <td>${employee.name}</td>
    </tr>
    <tr>
        <th>Surname</th>
        <td>${employee.lastName}</td>
    </tr>
    <tr>
        <th>Email</th>
        <td>${employee.email}</td>
    </tr>
    <tr>
        <th>Salary</th>
        <td>${employee.salary}</td>
    </tr>
    <tr>
        <td>
            <a href="/db/add-employee">
                <button class="back">Back</button>
            </a>
        </td>
        <td>
        <form:form action="confirmation-success" method="get">
        <button type="submit" class="submit">Confirmatiom</button>
        </form:form>
        </td>
    </tr>
</table>

</body>
</html>
