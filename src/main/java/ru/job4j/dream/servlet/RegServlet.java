package ru.job4j.dream.servlet;

import ru.job4j.dream.model.User;
import ru.job4j.dream.store.DBStore;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        if (DBStore.instOf().findUser(email) == null) {
            DBStore.instOf().reg(new User(name, email, password));
            resp.sendRedirect(req.getContextPath() + "/");
        } else {
            req.setAttribute("error", "Пользователь зарегестрирован");
            req.getRequestDispatcher("reg.jsp").forward(req, resp);
        }

    }
}