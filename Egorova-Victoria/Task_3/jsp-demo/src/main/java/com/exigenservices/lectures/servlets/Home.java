package com.exigenservices.lectures.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by master on 29.11.2016.
 */
public class Home extends HttpServlet {

    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
        req.getRequestDispatcher("/home.jsp").forward(req,res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
        req.getRequestDispatcher("/home.jsp").forward(req,res);
    }
}
