package DAO;

import ConnectionUtil.DBConnect;
import beans.Purchase;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PurchaseDAO {

    public List<Purchase> listPurchase(int id_pers) throws SQLException {
        List<Purchase> purchaseList = new ArrayList<>();

        String sql = "SELECT * FROM purchase WHERE id_person = ?";

        try (Connection connection = DBConnect.getInstance().getConnection()){

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id_pers);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int id_persone = resultSet.getInt("id_person");

                Purchase purchase = new Purchase(id, name, price, id_persone);
                purchaseList.add(purchase);
            }
        }
        return purchaseList;
    }
    }
