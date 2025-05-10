package servlets;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class MaxNumberServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            double num1 = Double.parseDouble(request.getParameter("num1"));
            double num2 = Double.parseDouble(request.getParameter("num2"));
            double num3 = Double.parseDouble(request.getParameter("num3"));
            String operation = request.getParameter("operation");

            double result = 0;
            String label = "";
            result = Math.max(num1, Math.max(num2, num3));
            label = "Максимум";

            out.println("""
                        <!DOCTYPE html>
                        <html lang="ru">
                        <head>
                            <meta charset="UTF-8">
                            <title>Результат</title>
                            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
                        </head>
                        <body class="bg-light">
                            <div class="container mt-5">
                                <div class="p-4 shadow">
                                    <h3 class="mb-3">Введённые числа:</h3>
                                    <p>Число 1: %.2f<br>Число 2: %.2f<br>Число 3: %.2f</p>
                                    <h4 class="mt-4 text-success">%s: %.2f</h4>
                                    <a href="numb.jsp" class="btn btn-outline-primary mt-3">Назад</a>
                                </div>
                            </div>
                        </body>
                        </html>
                    """.formatted(num1, num2, num3, label, result));

        } catch (NumberFormatException e) {
            out.println("""
                        <!DOCTYPE html>
                        <html lang="ru">
                        <head>
                            <meta charset="UTF-8">
                            <title>Ошибка</title>
                            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
                        </head>
                        <body class="bg-light d-flex justify-content-center align-items-center vh-100">
                            <div class="alert alert-danger p-4 shadow">
                                <h4 class="mb-0">Ошибка: Введите корректные числовые значения!</h4>
                                <a href="numb.jsp" class="btn btn-link mt-3">Назад</a>
                            </div>
                        </body>
                        </html>
                    """);
        }
    }
}
