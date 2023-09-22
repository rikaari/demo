
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="css/site.css">
    <title>Login Page</title>

</head>
<body>
    <h1>Login</h1>
    <c:if test="${requestScope.error !=null}">
            <div class="alert alert-danger text-center border border-danger">
                <b>${requestScope.error}</b>
            </div>
        </c:if>

        <c:if test="${requestScope.success !=null}">
                <div class="alert alert-danger text-center border border-danger">
                    <b>${requestScope.success}</b>
                </div>
        </c:if>
    <form:form action="/login" method="POST" class="login-form" modelAttribute="LoginUSer">
    <div class="input-container">
        <form:input type="text" path="name" class="input-field" placeholder="Username"/>
    </div>
    <div class="input-container">
        <form:input type="password" path="password" class="input-field" placeholder="Password"/>
    </div>
    <button id="login-button" type="submit" class="button">Login</button>
    </form:form>
</body>
</html>
