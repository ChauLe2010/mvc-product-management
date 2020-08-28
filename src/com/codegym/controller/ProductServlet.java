package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import com.codegym.service.ProductServiceImpl;
import org.omg.CORBA.Request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet",urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    ProductService productService=new ProductServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action==null)
            action="";
        switch (action){
            case "create":
                addProduct(request,response);


                break;
            default:

                break;
        }
    }

    private void addProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        double price=Double.parseDouble(request.getParameter("price"));
        String desc=request.getParameter("desc");
        Product product=new Product(id,name,price,desc);
        productService.save(product);
        request.setAttribute("message","Them thanh cong");
        RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/views/product/create.jsp");
        dispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action==null)
            action="";
        switch (action){
            case "create":
                showFormCreate(request,response);
                break;
            default:
                listProduct(request,response);
                break;
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/views/product/create.jsp");
        dispatcher.forward(request,response);
    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products=productService.findAllProduct();
        request.setAttribute("products",products);
        RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/views/product/list.jsp");
        dispatcher.forward(request,response);
        //Lay list
        //chuyen danh sach di view
    }
}
