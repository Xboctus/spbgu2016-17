package com.exigenservices.lectures.servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author slava
 */
public class DemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    res.setContentType("text/html");
    Date date = new Date();
    PrintWriter writer = res.getWriter();
    writer.println("<html>");
    writer.println("<head><title>My first page</title></head>");
    writer.println("<body>current time is: " + date.toString() + "</body>");
    writer.println("</html>");
    writer.close();
  }
    
}
