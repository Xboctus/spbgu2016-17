import org.apache.commons.lang3.StringUtils;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;


public class MessageServlets extends HttpServlet {

    private static final String ACTION_ENTER = "enter";

    @EJB(mappedName = Symbols.BEAN_NAME)
    private Symbols symbolsEJB;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("enter");

        if(ACTION_ENTER.equals(action)) {
            saveMessage(req);
        }

        redirectToView(req, resp);
    }

    private void saveMessage(HttpServletRequest request) {
        String messageUser = request.getParameter("message");

        if (StringUtils.isEmpty(messageUser)){
            request.setAttribute("error", "Message is null");
            return;
        }

        Message message = new Message(messageUser);
    }

    private void redirectToView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Map<Character, Integer> symbols = symbolsEJB.getAll();


        request.setAttribute("symbols", symbols);
        request.getRequestDispatcher("symbols.jsp").forward(request, response);
    }

}
