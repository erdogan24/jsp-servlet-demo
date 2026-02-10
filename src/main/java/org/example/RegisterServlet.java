package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        String name = req.getParameter("name");

        if (name == null || name.trim().isEmpty()) {
            req.setAttribute("error", "Name is required to register.");
            req.getRequestDispatcher("/WEB-INF/views/form.jsp").forward(req, resp);
            return;
        }

        UserStore.add(name);

        req.setAttribute("message", "User registered successfully.");
        req.getRequestDispatcher("/WEB-INF/views/form.jsp").forward(req, resp);
    }
}