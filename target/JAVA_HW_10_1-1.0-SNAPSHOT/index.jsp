<html>
<head><title>Calculate Max, Min, Avg</title></head>
<body>
<h2>Enter three numbers:</h2>
<form action="max" method="post">
    Number 1: <input type="text" name="num1"><br><br>
    Number 2: <input type="text" name="num2"><br><br>
    Number 3: <input type="text" name="num3"><br><br>

    <strong>Select Operation:</strong><br>
    <input type="radio" name="operation" value="max" checked> Maximum<br>
    <input type="radio" name="operation" value="min"> Minimum<br>
    <input type="radio" name="operation" value="avg"> Average<br><br>

    <input type="submit" value="Calculate">
</form>
</body>
</html>
