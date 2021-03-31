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

@WebServlet(name = "UpdateServlet", value = "/UpdateServlet")
public class UpdateServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    Customer p = new Customer();
    CustomerDAO dao = new CustomerDAO();
    String name = request.getParameter("name");
    String surname = request.getParameter("surname");
    double balance = Double.parseDouble(request.getParameter("balance"));
    int id = Integer.parseInt(request.getParameter("id"));
    p.setFirstName(name);
    p.setLastName(surname);
    p.setBalance(balance);
    p.setId(id);
    dao.doUpdate(p);
    request.setAttribute("customer", p);
    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/results/update_done.jsp");
    dispatcher.forward(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doGet(request, response);
  }
}
