package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SubmitServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        String name = req.getParameter("name");
        String age  = req.getParameter("age");

        if (name == null || name.trim().isEmpty() || age == null || age.trim().isEmpty()) {
            resp.sendRedirect(req.getContextPath() + "/form");
            return;
        }

        req.setAttribute("name", name.trim());
        req.setAttribute("age", age.trim());

        req.getRequestDispatcher("/WEB-INF/views/result.jsp").forward(req, resp);
    }
}