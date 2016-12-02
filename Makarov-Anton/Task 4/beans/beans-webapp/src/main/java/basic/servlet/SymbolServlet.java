package basic.servlet;

import basic.interf.Symbol;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.HashMap;

import static java.lang.System.out;

/**
 * Created by Anton on 02.11.2016.
 */

public class SymbolServlet extends HttpServlet {



        private static final String PARAM_ACTION = "action";
        private static final String ACTION_ADD = "add";

        @EJB
        private Symbol symbolEJB;

       /*protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           response.sendRedirect("/beans-webapp/symb.jsp");

       }*/


        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
                count(request,response);

        }

        private void count(HttpServletRequest request, HttpServletResponse res) throws IOException {
            String str = request.getParameter("firstinput");
            HashMap<Character,Integer> outp = symbolEJB.count(str);
            PrintWriter writer = res.getWriter();
            writer.println("<html>");
            writer.println("<head><title>My first page</title></head>");
            writer.println("<body>Answer is ");
            writer.println(outp);
            writer.println("</body>");
            writer.println("</html>");
            writer.close();
        }

       /* private void saveUser(HttpServletRequest request) {
            String userName = request.getParameter("name");
            Date dateOfBirth = parseDate(request.getParameter("dateOfBirth"));

            if(StringUtils.isEmpty(userName) || dateOfBirth == null){
                request.setAttribute("error", "Incorrect form parameters, user can not be created.");
                return;
            }

            UserTO userTO = new UserTO(null, userName, dateOfBirth);
            try {
                userManagerEJB.saveUser(userTO);
            } catch (UserManagementException e) {
                LOGGER.log(Level.SEVERE, e.getMessage());
                request.setAttribute("error", e.getMessage());
            }
        }*/



}
