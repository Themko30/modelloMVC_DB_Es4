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

@WebServlet("/show-balance")
public class ShowBalance extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    String customerId = request.getParameter("customerId");

    var service = new CustomerDAO();
    int id = Integer.parseInt(customerId);

    Customer customer = service.doRetrieveById(id);

    request.setAttribute("customer", customer);
    String address;

    if (customer == null) {
      request.setAttribute("badId", customerId);
      address = "/WEB-INF/results/unknown-customer.jsp";
    } else if (customer.getBalance() < 0) {
      address = "/WEB-INF/results/negative-balance.jsp";
    } else if (customer.getBalance() < 10000) {
      address = "/WEB-INF/results/normal-balance.jsp";
    } else {
      address = "/WEB-INF/results/high-balance.jsp";
    }

    RequestDispatcher dispatcher = request.getRequestDispatcher(address);
    dispatcher.forward(request, response);
  }
}
