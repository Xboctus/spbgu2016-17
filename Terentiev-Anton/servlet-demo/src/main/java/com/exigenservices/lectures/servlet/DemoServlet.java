package com.exigenservices.lectures.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created by АТ on 27.11.2016.
 */
public class DemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        Date date = new Date();
        PrintWriter out = resp.getWriter();
        out.println("<h1>" + date.toString() + "</h1>");
    }
}

