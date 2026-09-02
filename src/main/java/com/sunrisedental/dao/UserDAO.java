package com.sunrisedental.dao;
import com.sunrisedental.model.User;
import com.sunrisedental.util.DatabaseConnection;
import java.sql.*;

public class UserDAO {
     public boolean authenticate(String username, String password)
            throws SQLException {

        String sql = "SELECT 1 FROM users WHERE username=? AND password=?";

        try (Connection c = DatabaseConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);

            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    public boolean usernameExists(String username) {

        String sql = "SELECT 1 FROM users WHERE username=?";

        try (Connection c = DatabaseConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, username);

            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }

        } catch (SQLException e) {

            e.printStackTrace();
            return false;
        }
    }


    // REGISTER NEW USER
    public boolean registerUser(User user) {

        String sql = "INSERT INTO users "
                + "(username, email, password) "
                + "VALUES (?, ?, ?)";

        try (Connection c = DatabaseConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, user.getUsername());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());

            int rows = ps.executeUpdate();

            return rows > 0;

        } catch (SQLException e) {

            e.printStackTrace();
            return false;
        }
    }
}
