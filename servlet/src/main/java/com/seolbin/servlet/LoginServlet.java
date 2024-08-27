package com.seolbin.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private static String name = "박설빈";
    private static String pwd = "1234";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        StringBuilder sb = new StringBuilder();
        sb.append("<h1>Login")
                .append("</h1>")
                .append("<form action=\"login\" method=\"post\">")
                .append("<label>사용자명 : ")
                .append("</label>")
                .append("<input type=\"text\" name=\"username\">")
                .append("<br>")
                .append("<label>비밀번호 : ")
                .append("</label>")
                .append("<input type=\"text\" name=\"password\">")
                .append("<br>")
                .append("<input type=\"submit\" value=\"POST 요청\">")
                .append("</p>")
                .append("</form>");

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.print(sb);
        out.flush();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        StringBuilder sb = new StringBuilder();

        if (username.equals(name) && password.equals(pwd)) {
            System.out.println("성공");
            sb.append("<h2>로그인에 성공하셨습니다~")
                    .append("</h2>");
        } else {
            System.out.println("실패");
            sb.append("<h2>로그인에 실패하셨습니다...")
                    .append("</h2>");
        }

        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.print(sb);
        writer.flush();
        writer.close();

    }
}
