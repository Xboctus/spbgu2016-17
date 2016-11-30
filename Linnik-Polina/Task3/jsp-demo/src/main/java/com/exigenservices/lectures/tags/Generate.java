package com.exigenservices.lectures.tags;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

/**
 * Created by Полина on 26.11.2016.
 */
public class Generate extends BodyTagSupport {
    boolean generate = false;
    int number;
    private void output(String s) {
        JspWriter out = getBodyContent().getEnclosingWriter();
        try {
            out.write(s);
        } catch (java.io.IOException e) {
        }
    }
    private void textOut(String s) {
        JspWriter out = getBodyContent().getEnclosingWriter();
        try {
            out.write("<script>\n" +
                    "console.log('" + s + "');\n" +
                    "</script>");
        } catch (java.io.IOException e) {
        }
    }



    public int doStartTag() {
        return EVAL_BODY_BUFFERED;
    }


    public int doEndTag() {
        if(pageContext.getRequest() != null) {
            String s = pageContext.getRequest().getParameter("restart");
            if(s != null) {
                if(s.equals("true")) {
                    generate = false;
                }
            }
        }
        if(!generate) {
            java.util.Random rand = new java.util.Random();
            number = rand.nextInt(100) + 1;
            generate = true;
        }
        textOut(String.valueOf(number));

        output("<input type='hidden' name='n' value='" + String.valueOf(number) + "'>");
        return EVAL_PAGE;
    }

    public void setNumber(String s) {
        if(s == null) {
            return;
        }
        if(!s.equals("")) {
            generate = true;
            number = Integer.valueOf(s);
        }
    }
}
