package com.example.javaweb_tomcat;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String fname = request.getParameter("fname");
        String pricrStr = request.getParameter("price");
        Integer price =Integer.parseInt(pricrStr);
        String fcountStr = request.getParameter("fcount");
        Integer fcount =Integer.parseInt(fcountStr);
        String remark = request.getParameter("remark");
        System.out.println("fname="+fname);
        System.out.println("price="+pricrStr);
        System.out.println("fcount="+fcountStr);
        System.out.println("remark="+remark);
    }
}