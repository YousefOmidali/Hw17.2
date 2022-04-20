package com.example.hw17_2;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Now that you're an <strong> HTML5 ninja </strong>, it's time for you to show us what can do. Have a look at the html files we " +
                "created throughout the course as reference. Now go and try making your own website with just HTML5! Once you" +
                " are done, share your website" +
                " with the slack community and fellow students of this course! I will alsi be checking the #html channel with" +
                " any new submissions. You can send your files as a a message or wait until later in in the course where I show " +
                "you how to put it online";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<p>" + message + "</p>");
        out.println("<p>"+"<strong>" +" I will be picking my favourite ones and showcasing them in a future video in the course."
                +"</strong>" + "</p>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}