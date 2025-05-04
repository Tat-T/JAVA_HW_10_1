package servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class QuoteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Quote by Linus Torvalds:</h2>");
        out.println("<blockquote>");
        out.println("Bad programmers worry about the code. Good programmers worry about data structures and their relationships.");
        out.println("</blockquote>");
        out.println("</body></html>");
    }
}
