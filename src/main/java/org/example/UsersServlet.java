package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Set;

public class UsersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // 1) Session varsa al, yoksa null dönsün
        HttpSession session = req.getSession(false);

        // 2) username'i güvenli şekilde çek
        String username = null;
        if (session != null) {
            username = (String) session.getAttribute("username");
        }
        req.setAttribute("username", username);

        // 3) Registered users list (UserStore'dan)
        Set<String> users = UserStore.all();
        req.setAttribute("users", users);

        // 4) JSP'ye gönder
        req.getRequestDispatcher("/WEB-INF/views/users.jsp").forward(req, resp);
    }
}