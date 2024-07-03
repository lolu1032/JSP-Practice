package com.jsp.board.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/gugudan")
public class GugudanServlet extends HelloServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");; // 들어오는 데이터를 UTF-8로 하겠다
        resp.setCharacterEncoding("UTF-8"); // 완성되는 HTML 인코딩 utf-8로 하겠다
        resp.setContentType("text/html; charset utf-8"); // 브라우저에게 우리가 하는 결과물이 utf-8이란걸 알린다

        int dan = Integer.parseInt(req.getParameter("dan"));
        int limit = Integer.parseInt(req.getParameter("limit"));


        resp.getWriter().append("<h1>==%d단==</h1>".formatted(dan));
        for(int i = 1; i <= limit; i++) {
            resp.getWriter().append("<div>%d * %d = %d</div>".formatted(dan,i,dan*i));
        }
    }
}
