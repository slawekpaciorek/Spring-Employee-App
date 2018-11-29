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
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Add employee</h2>
<form:form modelAttribute="employee" action="show-record">

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
        <input type="submit" value="Submit">
    </div>

</form:form>

</body>
</html>
