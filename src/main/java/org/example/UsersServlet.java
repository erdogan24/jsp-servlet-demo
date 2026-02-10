package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class UsersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        HttpSession session = req.getSession(false);

        if (session == null || session.getAttribute("username") == null) {
            // Not logged in -> go to login page
            resp.sendRedirect(req.getContextPath() + "/login-page");
            return;
        }

        String username = (String) session.getAttribute("username");
        req.setAttribute("username", username);

        req.getRequestDispatcher("/WEB-INF/views/users.jsp").forward(req, resp);
    }
}