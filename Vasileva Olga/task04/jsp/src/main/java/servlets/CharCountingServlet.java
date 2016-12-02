package servlets;

import beans.ICharCountingService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class CharCountingServlet extends HttpServlet {

    @EJB(mappedName = "StandartCharCountingBean")
    private ICharCountingService charCountBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String text = request.getParameter("text");
        Map<Character, Integer> charCountMap = charCountBean.countWords(text);
        request.setAttribute("table", charCountMap.entrySet());
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
