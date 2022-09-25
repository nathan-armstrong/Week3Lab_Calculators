
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="number" name="firstVal" value="${firstVal}">
            <br>
            Last: <input type="number" name="secondVal" value="${secondVal}">
            <br>
            <input type="submit" value="+" name="symbols">
            <input type="submit" value="-" name="symbols">
            <input type="submit" value="*" name="symbols">
            <input type="submit" value="%" name="symbols">
            <div>${result}</div>
        </form>
        <a href ="age"> Age Calculator</a> 
    </body>
</html>