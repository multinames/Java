package service;

import bl.Util;
import dao.AddressDAO;
import entity.Address;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AddressService extends Util implements AddressDAO {

    Connection connection = getConnection();

    @Override
    public void add(Address address) throws SQLException {
        PreparedStatement preparedStatement = null; // ???????

        String sql = "INSERT INTO ADDRESS (ID, COUNTRY, CITY, STREET, POSTCODE) VALUES (?, ?, ?, ?, ?)";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1,address.getId());
            preparedStatement.setString(2,address.getCountry());
            preparedStatement.setString(3,address.getCity());
            preparedStatement.setString(4,address.getStreet());
            preparedStatement.setString(5,address.getPostCode());

            preparedStatement.executeUpdate();

        }catch (SQLException e){
        e.printStackTrace();
       }finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if(connection != null) {
                connection.close();
            }

        }
    }

    @Override
    public List<Address> getAll() throws SQLException {
        List<Address> addressList = new ArrayList<>();

        String sql = "SELECT ID, COUNTRY, CITY, STREET, POSTCODE FROM ADDRESS";

        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Address address = new Address();
                address.setId(resultSet.getLong("ID"));
                address.setCountry(resultSet.getString("COUNTRY"));
                address.setCity(resultSet.getString("CITY"));
                address.setStreet(resultSet.getString("STREET"));
                address.setPostCode(resultSet.getString("POSTCODE"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (statement != null) {
                statement.close();
            }
            if (connection !=null) {
                connection.close();
            }
        }

        return addressList;
    }

    @Override
    public Address getById(long id) throws SQLException {

        PreparedStatement preparedStatement = null; // ???????

        String sql = "SELECT ID, COUNTRY, CITY, STREET, POSTCODE FROM ADDRESS WHERE ID = ?)";

        Address address = new Address();

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1,id);

            ResultSet resultSet = preparedStatement.executeQuery();

            address.setId(resultSet.getLong("ID"));
            address.setCountry(resultSet.getString("COUNTRY"));
            address.setCity(resultSet.getString("CITY"));
            address.setStreet(resultSet.getString("STREET"));
            address.setPostCode(resultSet.getString("POSTCODE"));

            preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection !=null) {
                connection.close();
            }
        }

        return address;
    }

    @Override
    public void update(Address address) throws SQLException {

        PreparedStatement preparedStatement = null; // ???????

        String sql = "UPDATE ADDRESS SET  COUNTRY =?, CITY=?, STREET=?, POSTCODE=? WHERE ID = ?)";

        try {

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1,address.getCountry());
            preparedStatement.setString(2,address.getCountry());
            preparedStatement.setString(3,address.getCountry());
            preparedStatement.setString(4,address.getCountry());
            preparedStatement.setLong(5,address.getId());


            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection !=null) {
                connection.close();
            }
        }

    }

    @Override
    public void delete(Address address) throws SQLException {

        PreparedStatement preparedStatement = null; // ???????

        String sql = "DELETE FROM ADDRESS WHERE ID = ?)";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1,address.getId());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection !=null) {
                connection.close();
            }
        }
    }
}
