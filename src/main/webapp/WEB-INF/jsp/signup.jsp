
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="css/site.css">
    <title>Sign Up Page</title>
</head>
<body>
    <h1>Sign Up</h1>

    <c:if test="${requestScope.passwordMismatch !=null}">
        <div class="alert alert-danger text-center border border-danger">
            <b>${requestScope.passwordMismatch}</b>
        </div>
    </c:if>

    <c:if test="${requestScope.success !=null}">
            <div class="alert alert-danger text-center border border-danger">
                <b>${requestScope.success}</b>
            </div>
        </c:if>

    <form:form action="/signup" class="signup-form" modelAttribute="signupUser">
        <div class="input-container">
            <form:input type="text" path="name" class="input-field" placeholder="Name" />
            <form:errors path="name" class="text-white bg-danger"/>
        </div>

        <div class="input-container">
            <form:input type="password" path="password" class="input-field" placeholder="Password" />
            <form:errors path="password" class="text-white bg-danger"/>
        </div>
        <div class="input-container">
            <input type="password" name="confirm_password" class="input-field" placeholder="Confirm Password" required>
            <small class="text-white bg-danger">${confirm}</small>
        </div>
        <button type="submit" id="signup-button" class="button">Sign Up</button>
    </form:form>
</body>
</html>
