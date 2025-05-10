package servlets;

import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            double num1 = Double.parseDouble(request.getParameter("num1"));
            double num2 = Double.parseDouble(request.getParameter("num2"));
            String operation = request.getParameter("operation");

            double result = 0;
            String label = "";

            switch (operation) {
                case "add":
                    result = num1 + num2;
                    label = "\"+\"";
                    break;
                case "subtract":
                    result = num1 - num2;
                    label = "\"-\"";
                    break;
                case "multiply":
                    result = num1 * num2;
                    label = "\"*\"";
                    break;
                case "divide":
                    if (num2 == 0) {
                        out.println("<html><body><h3 style='color:red;'>Невозможно делить на ноль!</h3></body></html>");
                        return;
                    }
                    result = num1 / num2;
                    label = "\"/\"";
                    break;
                case "power":
                    result = Math.pow(num1, num2);
                    label = "\"^\"";
                    break;
                case "percent":
                    result = (num1 * num2) / 100.0;
                    label = "\"%\"";
                    break;
                default:
                    out.println("<html><body><h3 style='color:red;'>Выбрана недопустимая операция!</h3></body></html>");
                    return;
            }

            String html = String.format("""
                    <!DOCTYPE html>
                    <html lang="ru">
                    <head>
                        <meta charset="UTF-8">
                        <title>Результат</title>
                        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
                    </head>
                    <body class="bg-light">
                        <div class="container mt-5">
                            <div class="card p-4 shadow">
                                <h3 class="mb-3">Результат операции:</h3>
                                <h3><strong>%s:</strong> <span class='text-success'>%.2f</span></h3>
                                <a href="numbers.jsp" class="btn btn-outline-primary mt-3">Назад</a>
                            </div>
                        </div>
                    </body>
                    </html>
                    """, label, result);
            out.println(html);


        } catch (NumberFormatException e) {
            out.println("<html><body><h3 style='color:red;'>Неверный ввод! Пожалуйста, введите цифры.</h3></body></html>");
        }
    }
}
