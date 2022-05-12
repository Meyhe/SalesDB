package servlets;

import DAO.PurchaseDAO;
import beans.Purchase;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class PurchaseServlet extends HttpServlet {

    private PurchaseDAO purchaseDAO;

    @Override
    public void init() {
        purchaseDAO = new PurchaseDAO();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        try {
            int id_person = Integer.parseInt(req.getParameter("id_person"));
            List<Purchase> purchaseList = purchaseDAO.listPurchase(id_person);
            req.setAttribute("purchaseList", purchaseList);
            RequestDispatcher dispatcher = req.getRequestDispatcher("PurchaseList.jsp");
            dispatcher.forward(req, resp);
        } catch (SQLException e){
            throw new ServletException(e);
        }
    }
}
