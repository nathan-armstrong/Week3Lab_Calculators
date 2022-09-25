<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="age" value="${userVal}"><br>
            <input type="submit" value="Age next birthday">
            <div>${message}</div> 
        </form>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
