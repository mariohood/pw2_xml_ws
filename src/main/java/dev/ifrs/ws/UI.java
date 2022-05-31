package dev.ifrs.ws;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

@WebServlet("/go")
public class UI extends HttpServlet{

    @WebServiceRef(wsdlLocation = "http://localhost:9080/Big?wsdl")
    private Big_Service service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        Big port = service.getBigPort();
        System.out.println("Convert 1: " + port.convert1(5));
        System.out.println("Convert 2: " + port.convert2(5));
    }
    
}
