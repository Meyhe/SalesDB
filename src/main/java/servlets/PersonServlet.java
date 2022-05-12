package servlets;

import ConnectionUtil.DBConnect;
import DAO.PersonDAO;
import beans.Person;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


public class PersonServlet extends HttpServlet {

    private PersonDAO personDAO;

    @Override
    public void init() {
        personDAO = new PersonDAO();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        try {
            List<Person> personList = personDAO.listAllPerson();
            req.setAttribute("personList", personList);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/");
            dispatcher.forward(req, resp);
        } catch (SQLException e){
            throw new ServletException(e);
        }
    }
}
