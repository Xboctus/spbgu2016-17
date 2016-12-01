package com.devcrocod.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//@WebServlet("start.jsp")
public class mainServlet extends HttpServlet {

    private final static String ACTION = "start";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int count = Integer.parseInt(request.getParameter("count"));
        int res = riddle();
        String action = request.getParameter("action");


        if (ACTION.equals(action)) {
            if (count == res) {
                redirectWin(request, response);
            } else {
                redirectLose(request, response);
            }
        }
    }

    private int riddle() {
        return (int) (Math.random() * 100);
    }


    private void redirectWin(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("win.jsp").forward(request, response);
    }

    private void redirectLose(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("lose.jsp").forward(request, response);
    }
}
