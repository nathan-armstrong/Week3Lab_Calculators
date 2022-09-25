
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
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstVal = request.getParameter("firstVal");
        String secondVal = request.getParameter("secondVal");

        request.setAttribute("firstVal", firstVal);
        request.setAttribute("secondVal", secondVal);

        if (firstVal == null || secondVal == null) {
            request.setAttribute("result", "Invalid");

        } else {
            int num1 = Integer.parseInt(firstVal);
            int num2 = Integer.parseInt(secondVal);
            int value = 0;
            
            if (request.getParameter("symbols").equals("+")) {
                value = num1 + num2;
            }
            if (request.getParameter("symbols").equals("-")) {
                value = num1 - num2;
            }
            if (request.getParameter("symbols").equals("*")) {
                value = num1 * num2;
            }
            if (request.getParameter("symbols").equals("%")) {
                value = num1 % num2;
            }

            request.setAttribute("result",value);
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }
}