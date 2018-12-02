<%--
  Created by IntelliJ IDEA.
  User: slawekpaciorek
  Date: 29.11.18
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp"%>
<h2>Add employee</h2>
<form:form modelAttribute="employee" action="employee-confirm">

    <div>
        <span>Name : </span>
        <form:input path="name" />
    </div>

    <div>
        <span>Last name :</span>
        <form:input path="lastName"/>
    </div>

    <div>
        <span>Email : </span>
        <form:input path="email"/>
        <form:errors path="email" cssClass="error"/>
    </div>

    <div>
        <span>Salary : </span>
        <form:input path="salary"/>
        <form:errors path="salary" cssClass="error"/>
    </div>

    <div>
        <button type="submit">Submit</button>
    </div>

</form:form>

</body>
</html>
