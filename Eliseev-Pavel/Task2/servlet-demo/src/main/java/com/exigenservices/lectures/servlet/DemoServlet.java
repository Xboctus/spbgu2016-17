package com.exigenservices.lectures.servlet;

import javax.servlet.http.HttpServlet;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DemoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        out.print("current time is "+ new Date(System.currentTimeMillis()));
        res.setContentType("text/html");

        PrintWriter writer = res.getWriter();
        writer.println("<html>");
        writer.println("<head><title>My first page</title></head>");
        writer.println("<body>This is my first page</body>");
        writer.println("</html>");
        writer.close();
    }
}

