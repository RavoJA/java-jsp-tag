<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="mytag" uri="/WEB-INF/countTag.tld" %>
<html>
<body>
<h1>JSTL Test</h1>

<div>
    The games we play:
    <ul>
        <c:forEach items="${list}" var="game">
            <li>${game}</li>
        </c:forEach>
    </ul>
</div>

<div>
    <c:set var="test" value="${mytag:isNullOrEmpty('test')}"/>
    Is Empty <mytag:isEmpty inputstring="Studytonight"></mytag:isEmpty>
    Null Or Empty: <h5>${test}</h5>
</div>
</body>
</html>