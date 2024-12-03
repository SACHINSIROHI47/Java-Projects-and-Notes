<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <jsp:useBean id="date" class="java.util.Date"/>
        today is:
        <fmt:formatDate value="${date}" type="date" pattern="dd-mm-yyy"/>
        <jsp:useBean id="now" class="java.util.Date"/>
        <p>date format is us locale:
            <fmt:setLocale value="en_us"/>
            <fmt:formatDate value="${now}"/>
        </p>
        <c:set var="balance" value="1140.5309"/>
        <p>Currency in usa:
            <fmt:setLocale value="en_us"/>
            <fmt:formatNumber value="${balance}" type="currency"/>
        </p>
        <c:set var="balance" value="12000.2309"/>
        <p>formatted number(1):
            <fmt:formatNumber type="percent"  maxIntegerDigits="3" value="${balance}"/> 
        </p>
        <p>formatted number(2):
            <fmt:formatNumber type="percent"  minFractionDigits="10" value="${balance}"/> 
        </p>
        <p>formatted number(3):
            <fmt:formatNumber type="percent"  maxIntegerDigits="3" value="${balance}"/> 
        </p>
        <fmt:message key="welcome">
        <fmt:param value="${welcomeuser}"/>
        </fmt:message>
    </body>
</html>
