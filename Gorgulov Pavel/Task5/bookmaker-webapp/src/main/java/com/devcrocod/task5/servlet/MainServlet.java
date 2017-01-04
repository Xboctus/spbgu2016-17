package com.devcrocod.task5.servlet;


import com.devcrocod.task5.api.BookmakerManager;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

public class MainServlet extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger("MainServlet");

    private static final String PARAM_ACTION = "action";
    private static final String ACTION_ADD = "add";

    @EJB(mappedName = BookmakerManager.BEAN_NAME)
    private BookmakerManager bookmakerManagerEJB;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
