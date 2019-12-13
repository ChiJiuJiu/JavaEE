package edu.yctc.filter.servlet;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class CharacterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        System.out.println(request.getParameter("name"));
        System.out.println(request.getParameter("password"));
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        doGet(request, response);
    }
}
