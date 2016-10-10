package com.ibm.vend0tron3000.servlet;

import com.ibm.vend0tron3000.repository.ProductRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

/**
 * Created by hermanvanderveer on 29/09/16.
 */
public class TransactionServlet extends HttpServlet {
    ProductRepository productRepository = new ProductRepository();

    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("You picked " + req.getParameter("theChoice"));
        req.setAttribute("theProduct",productRepository.getProductByid(req.getParameter("theChoice")));
        req.getRequestDispatcher("/views/transaction.jsp").forward(req,resp);
    }
}
