<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="header.jsp"%>
<h2>Employee Card</h2>

<div class="search-bar">
    <h5>Employee ID : </h5>
        <span>${searchingEmployee.id}</span>
    <h5>Employee name : </h5>
        <span>${searchingEmployee.name}</span>
    <h5>Employee last name : </h5>
        <span>${searchingEmployee.lastName}</span>
    <h5>Employee email : </h5>
        <span>${searchingEmployee.email}</span>
    <h5>Employee salary : </h5>
        <span>${searchingEmployee.salary}</span>
</div>

</body>
</html>