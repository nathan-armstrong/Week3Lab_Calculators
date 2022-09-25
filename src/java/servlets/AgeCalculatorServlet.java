package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nathan-armstrong
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userVal = request.getParameter("age");

        int age;
        request.setAttribute("userVal", userVal);

        if (userVal == null) {
            request.setAttribute("message", "You must give your current age");
        } else {
            try {
                age = Integer.parseInt(userVal);
                request.setAttribute("message", "Your age next birthday will be " + (age + 1));
            } catch (NumberFormatException e) {
                request.setAttribute("message", "You must enter a number");
            }
        }

        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
    }

}
