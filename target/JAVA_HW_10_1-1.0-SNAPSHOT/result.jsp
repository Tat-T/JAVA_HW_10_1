<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
   <html lang="en">
      <head>
          <meta charset="UTF-8">
          <title>Результат анализа</title>
          <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
      </head>
         <body style="background-color: #e3f2fd;">
            <div class="container mt-5 d-flex justify-content-center">
               <div class="p-4 shadow w-50 rounded-3">
                  <h2 class="text-primary">Результат анализа текста:</h2>

                 <c:if test="${not empty error}">
                 <p style="color:red;">${error}</p>
               </c:if>

               <c:if test="${empty error}">
                 <p><strong>Гласные:</strong> ${vowelCount} — ${foundVowels}</p>
                 <p><strong>Согласные:</strong> ${consonantCount} — ${foundConsonants}</p>
                 <p><strong>Пунктуация:</strong> ${punctCount} — ${foundPunctuation}</p>
               </c:if>
               <br>
               <a class="btn btn-primary mt-3" href="analyze.jsp">Вернуться назад</a>
            </div>
         </div>
      </body>
   </html>
