package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");

        if (username == null || username.trim().isEmpty()) {
            req.setAttribute("error", "Username is required.");
            req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
            return;
        }

        // Create/get session and store logged-in user
        HttpSession session = req.getSession(true);
        session.setAttribute("username", username.trim());

        // Redirect to a protected page (we will implement /users next)
        resp.sendRedirect(req.getContextPath() + "/users");
    }
}