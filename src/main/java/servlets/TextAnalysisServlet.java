package servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.*;

public class TextAnalysisServlet extends HttpServlet {
    private static final Set<Character> VOWELS = new HashSet<>(Arrays.asList(
            'a','e','i','o','u','y','а','е','ё','и','о','у','ы','э','ю','я'));
    private static final Set<Character> PUNCTUATION = new HashSet<>(Arrays.asList(
            '.', ',', '!', '?', ':', ';', '-', '(', ')', '"', '\''
    ));

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String input = request.getParameter("text");

        if (input == null || input.isEmpty()) {
            request.setAttribute("error", "Текст не предоставлен.");
            request.getRequestDispatcher("result.jsp").forward(request, response);
            return;
        }

        input = input.toLowerCase();
        Set<Character> foundVowels = new TreeSet<>();
        Set<Character> foundConsonants = new TreeSet<>();
        Set<Character> foundPunctuation = new TreeSet<>();

        int vowelCount = 0, consonantCount = 0, punctCount = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if (VOWELS.contains(c)) {
                    vowelCount++;
                    foundVowels.add(c);
                } else {
                    consonantCount++;
                    foundConsonants.add(c);
                }
            } else if (PUNCTUATION.contains(c)) {
                punctCount++;
                foundPunctuation.add(c);
            }
        }

        // Установка атрибутов
        request.setAttribute("vowelCount", vowelCount);
        request.setAttribute("foundVowels", foundVowels);
        request.setAttribute("consonantCount", consonantCount);
        request.setAttribute("foundConsonants", foundConsonants);
        request.setAttribute("punctCount", punctCount);
        request.setAttribute("foundPunctuation", foundPunctuation);

        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
