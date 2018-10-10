package com.hk.idea;

import com.hk.idea.com.hk.idea.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo")
public class DemoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("DemoServlet.service");
        setMethon();
        work();
        req.getRequestDispatcher("/WEB-INF/hello.jsp").forward(req, resp);
    }

    private void work() {
        System.out.println("-----------");
        new User().setUserAge();
    }

    private void setMethon() {
        System.out.println("----------");
    }

}
