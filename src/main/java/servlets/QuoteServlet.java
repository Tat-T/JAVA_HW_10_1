package servlets;

import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class QuoteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("""
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <title>Quote by Linus Torvalds</title>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
        </head>
        <body class="bg-light d-flex align-items-center justify-content-center vh-100">
            <div class="card shadow-lg p-4" style="max-width: 700px;">
                <div class="card-body text-center">
                    <blockquote class="blockquote mb-4">
                        <p class="fs-4">
                            “Bad programmers worry about the code.<br>
                            Good programmers worry about data structures and their relationships.”
                        </p>
                    </blockquote>
                    <footer class="blockquote-footer mt-3">Linus Torvalds</footer>
                </div>
            </div>
        </body>
        </html>
    """);
    }
}