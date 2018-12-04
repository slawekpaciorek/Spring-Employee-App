
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%@ include file="header.jsp"%>
<h2>Find Employee</h2>
    <div class="search-bar">
        <h4>Find by ID number</h4>
            <form:form action="employee-card" method="get" modelAttribute="employee">
                <form:input path="id" placeholder="type in id number"/>
                <button type="submit">search</button>
            </form:form>
    </div>
    <div class="search-bar">
        <h4>Find by email address</h4>
            <form:form action="employee-card" method="get" modelAttribute="employee">
                <form:input  path="email" placeholder="type in email address" />
                <button type="submit">search</button>
            </form:form>
    </div>
</body>
</html>
