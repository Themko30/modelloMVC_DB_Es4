package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Customer;
import model.CustomerDAO;

@WebServlet(name = "UpdateCustomer", value = "/UpdateCustomer")
public class UpdateCustomer extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    Customer customer;
    int id = Integer.parseInt(request.getParameter("id"));
    CustomerDAO dao = new CustomerDAO();
    customer = dao.doRetrieveById(id);
    request.setAttribute("customer", customer);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doGet(request, response);
  }
}
