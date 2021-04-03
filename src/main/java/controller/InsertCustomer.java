package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Customer;
import model.CustomerDAO;

@WebServlet(name = "InsertCustomer", value = "/InsertCustomer")
public class InsertCustomer extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    Customer c = new Customer();
    c.setFirstName(request.getParameter("name"));
    c.setLastName(request.getParameter("surname"));
    c.setBalance(Double.parseDouble(request.getParameter("balance")));
    CustomerDAO dao = new CustomerDAO();
    dao.doSave(c);
    request.setAttribute("customer", c);
    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/results/insert_done.jsp");
    dispatcher.forward(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doGet(request, response);
  }
}
