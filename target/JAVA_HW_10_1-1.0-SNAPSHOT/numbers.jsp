<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Числовой анализ</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5 d-flex justify-content-center">
    <form action="numbers" method="post" class="p-4 shadow-sm w-50">
    <h2 class="text-center mb-4">Анализ трёх чисел</h2>
        <div class="mb-3">
            <label class="form-label">Число 1:</label>
            <input type="text" name="num1" class="form-control" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Число 2:</label>
            <input type="text" name="num2" class="form-control" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Число 3:</label>
            <input type="text" name="num3" class="form-control" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Выберите операцию:</label><br>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="operation" value="max" checked>
                <label class="form-check-label">Максимум</label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="operation" value="min">
                <label class="form-check-label">Минимум</label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="operation" value="avg">
                <label class="form-check-label">Среднее</label>
            </div>
        </div>
        <button type="submit" class="btn btn-primary w-100">Вычислить</button>
    </form>
</div>
</body>
</html>
