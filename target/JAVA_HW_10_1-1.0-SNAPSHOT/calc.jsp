<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Calculator</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5 d-flex justify-content-center">
    <div class="p-4 shadow w-50">
        <h2 class="mb-4 text-center">Простой калькулятор</h2>
        <form action="calc" method="post">
            <div class="mb-3">
                <label for="num1" class="form-label">Число 1:</label>
                <input type="text" class="form-control" id="num1" name="num1">
            </div>

            <div class="mb-3">
                <label for="num2" class="form-label">Число 2:</label>
                <input type="text" class="form-control" id="num2" name="num2">
            </div>

            <div class="mb-3">
                <strong>Выберите операцию:</strong><br>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="operation" value="add" id="add" checked>
                    <label class="form-check-label" for="add">Сложение "+" </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="operation" value="subtract" id="subtract">
                    <label class="form-check-label" for="subtract">Вычитание "-" </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="operation" value="multiply" id="multiply">
                    <label class="form-check-label" for="multiply">Умножение "*" </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="operation" value="divide" id="divide">
                    <label class="form-check-label" for="divide">Деление "/" </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="operation" value="power" id="power">
                    <label class="form-check-label" for="power">Возведение в степень "^" </label>
                </div>
                <div class="form-check mb-3">
                    <input class="form-check-input" type="radio" name="operation" value="percent" id="percent">
                    <label class="form-check-label" for="percent">Подсчёт процента "%" </label>
                </div>
            </div>

            <button type="submit" class="btn btn-primary w-100">Посчитать</button>

        </form>
    </div>
</div>
</body>
</html>
