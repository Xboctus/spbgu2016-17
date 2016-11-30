package com.exigenservices.lectures;



import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class UserManagerServlet extends HttpServlet {

    @EJB(mappedName = "UserManagerSessionBean")
    private UserManager charCountBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String text = request.getParameter("texttoparse");
        Map<Character, Integer> charCountMap = charCountBean.countLetterAmounts(text);
        request.setAttribute("table", charCountMap.entrySet());
        request.getRequestDispatcher("table.jsp").forward(request, response);
    }
}
