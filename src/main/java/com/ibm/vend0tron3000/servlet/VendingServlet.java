package com.ibm.vend0tron3000.servlet;

import com.ibm.vend0tron3000.Product;
import com.ibm.vend0tron3000.repository.MVCConfiguration;
import com.ibm.vend0tron3000.repository.ProductRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/**
 * Created by hermanvanderveer on 29/09/16.
 */
public class VendingServlet extends HttpServlet {
    ProductRepository productRepository = new ProductRepository();

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("theList",productRepository.getProducts());
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }

//    HashMap<String, Object> model = new HashMap<>();
//    MVCConfiguration.resolver.resolveViewName("choiceOverview", Locale.FRANCE).render(model, req, resp);

}
