<%--
  Created by IntelliJ IDEA.
  User: slawekpaciorek
  Date: 05.12.18
  Time: 00:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="header.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h2>Employee modification</h2>
<form:form modelAttribute="employee" action="employee-modification-confirm">

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
        <button type="submit" id="submit-button">Modify</button>
    </div>

</form:form>

</body>
</html>
