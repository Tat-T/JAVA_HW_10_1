<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Text Analysis</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
   <body style="background-color: #e3f2fd;">
      <div class="container mt-5 d-flex justify-content-center">
         <div class="p-4 shadow w-50 rounded-3">
            <h1 class="text-primary">Введите текст для анализа</h1>
            <form action="analyze" method="post" >
            <textarea name="text" rows="10" cols="50"></textarea><br><br>
            <button class="btn btn-primary mt-3" type="submit">
                Анализировать
            </button>
            </form>
         </div>
      </div>
   </body>
</html>
