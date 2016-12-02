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
import java.util.Map;
import java.util.Set;

import static java.lang.System.out;

public class SymbolServlet extends HttpServlet {



        private static final String PARAM_ACTION = "action";
        private static final String ACTION_ADD = "add";

        @EJB
        private Symbol symbolEJB;


        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
                count(request,response);

        }

        private void count(HttpServletRequest request, HttpServletResponse res) throws IOException {
            String str = request.getParameter("firstinput");
            HashMap<Character,Integer> outp = symbolEJB.count(str);
            Set<HashMap.Entry<Character, Integer>> set = outp.entrySet();
            PrintWriter writer = res.getWriter();
            writer.println("<html>");
            writer.println("<head><title>My first page</title></head>");
            writer.println("<body>List of charachters and their counters ");
            for (HashMap.Entry<Character, Integer> me : set) {
                writer.println("<div></div>");
                writer.print(me.getKey() + ": ");
                writer.println(me.getValue());
            }
            writer.println("</body>");
            writer.println("</html>");
            writer.close();
        }




}
