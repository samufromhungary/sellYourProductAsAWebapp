package com.codecool.web.servlet;

import com.codecool.web.model.Email;
import com.codecool.web.service.EmailService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/email")
public class EmailServlet extends HttpServlet {

    private final EmailService service = new EmailService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        service.addEmail(new Email(req.getParameter("e_mail")));
        req.setAttribute("service", service.getEmails());
        req.getRequestDispatcher("email.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
