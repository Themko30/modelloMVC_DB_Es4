package controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Customer;
import model.CustomerDAO;

@WebServlet(name = "ShowAll", value = "/ShowAll")
public class ShowAll extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    CustomerDAO service = new CustomerDAO();
    ArrayList<Customer> customers = service.doRetrieveAll();
    
    request.setAttribute("customers", customers);
    String address;
    
    if(customers.size()==0){
      address= "/WEB-INF/results/unknown-customer.jsp";
    }
    else{
      address=""}
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doGet(request, response);
  }
}
