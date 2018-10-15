package com.arakelyan.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.write("<h1>Hello from HelloServlet</h1>");
        writer.write("<h2>Again hello from h2</h2>");
        writer.write("<h3>Again hello from h3</h3>");
        writer.write("<h4>Again hello from h4</h4>");



    }
}
