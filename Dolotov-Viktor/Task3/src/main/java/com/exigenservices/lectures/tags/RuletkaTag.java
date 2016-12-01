package com.exigenservices.lectures.tags;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Random;

import static org.apache.commons.lang3.math.NumberUtils.isNumber;

/**
 * Created by Ti_g_programmist(no) on 01.12.2016.
 */
public class RuletkaTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        JspContext con = getJspContext();
        String number = (String) con.getAttribute("number");
        if (isNumber(number)) {
            Random r = new Random();
            int n = Integer.parseInt(number);
            if (n == r.nextInt(99) + 1) {
                con.setAttribute("action","win");
            } else {
                con.setAttribute("action","lose");
            }
        } else {
            con.setAttribute("error", "Incorrect number! Enter again.");
            con.setAttribute("action","error");
        }
    }
}
