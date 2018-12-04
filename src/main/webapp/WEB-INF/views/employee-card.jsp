<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="header.jsp"%>
<h2>Employee Card</h2>

<c:choose>
    <c:when test="${searchingEmployee != null}">
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
            <form:form method="get" action="employee-delete-confirmation" cssClass="action-form">
                <button id="delete-record" type="submit" name="id" value="${searchingEmployee.id}">Delete</button>
            </form:form>
            <button id="modify-record" type="submit" name="id" value="${searchingEmployee.id}">Modify</button>
        </div>
    </c:when>
    <c:otherwise>
        <div class="box">
            ${message}
        </div>
    </c:otherwise>
</c:choose>

</body>
</html>