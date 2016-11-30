package com.exigenservices.lectures.servlets;

import com.exigenservices.lectures.model.Bookmark;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Servlet for bookmarks operations
 * Created by bolbin
 * on 07.11.2014.
 */
public class BookmarksServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

}
