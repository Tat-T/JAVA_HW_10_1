package servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
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

            out.println("<html><body>");
            out.println("<h2>Entered numbers:</h2>");
            out.printf("<p>Number 1: %.2f<br>Number 2: %.2f<br>Number 3: %.2f</p>", num1, num2, num3);

            double result = 0;
            String label = "";

            switch (operation) {
                case "max":
                    result = Math.max(num1, Math.max(num2, num3));
                    label = "Maximum";
                    break;
                case "min":
                    result = Math.min(num1, Math.min(num2, num3));
                    label = "Minimum";
                    break;
                case "avg":
                    result = (num1 + num2 + num3) / 3.0;
                    label = "Average";
                    break;
                default:
                    label = "Invalid operation";
            }

            out.printf("<h3>%s value: <span style='color:green;'>%.2f</span></h3>", label, result);
            out.println("</body></html>");
        } catch (NumberFormatException e) {
            out.println("<html><body><h3 style='color:red;'>Invalid input! Please enter valid numbers.</h3></body></html>");
        }
    }
}
