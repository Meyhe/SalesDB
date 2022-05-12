package DAO;

import ConnectionUtil.DBConnect;
import beans.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {

    public List<Person> listAllPerson() throws SQLException {

        List<Person> personList = new ArrayList<>();
        String sql = "SELECT * FROM person";

        try (ResultSet resultSet = DBConnect.getInstance().getConnection().createStatement().executeQuery(sql)) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                Person person = new Person(id, name, age);
                personList.add(person);
            }
        } finally {
            return personList;
        }
    }
}
