<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Text Analysis</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <h1>Введите текст для анализа</h1>
    <form action="textForm.jsp" method="post" >
        <textarea name="text" rows="10" cols="50"></textarea><br><br>
        <input type="submit" value="Анализировать">
    </form>
</body>
</html>
