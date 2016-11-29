package com.exigenservices.lectures.tags;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

/**
 * Created by Полина on 26.11.2016.
 */
public class Result extends BodyTagSupport {
    private void output(String s) {
        JspWriter out = getBodyContent().getEnclosingWriter();
        try {
            out.write(s);
        } catch (java.io.IOException e) {
        }
    }

    private void redirect(String s) {
        HttpServletResponse response = (HttpServletResponse) pageContext.getResponse();
        try {
            response.sendRedirect(s);
        } catch (java.io.IOException e) {
        }
    }

    public static boolean checkString(String string) {
        boolean t = false;
        try {
            int n = Integer.valueOf(string);
            if (n > 0 && n <= 100) t = true;
        } catch (Exception e) {
            return false;
        }
        return t;
    }

    public int doStartTag() {
        if (pageContext.getRequest() != null) {
            int number = 0;
            String s1 = pageContext.getRequest().getParameter("number");

            if (s1 != null) {
                if (checkString(s1)) {
                    number = Integer.valueOf(s1);
                } else {
                    return EVAL_BODY_INCLUDE;
                }
            }

            String s2 = pageContext.getRequest().getParameter("n");
            if (s2 != null) {
                if (!s2.equals("")) {
                    int n = Integer.valueOf(s2);
                    if (n == number) {
                        redirect("win.jsp");
                    } else {
                        redirect("lose.jsp");
                    }
                }
            }

        }
        return SKIP_BODY;
    }


    public int doEndTag() {
        return EVAL_PAGE;
    }
}
