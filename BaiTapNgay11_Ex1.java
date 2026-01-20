package BaiTapNgay11.Exercise1;

import java.sql.*;

public class bai1 {
    Connection connection = DriverManager.getConnection(url, username, password);

    System.out.println("Connect success!");
    public void getPositions() throws SQLException {
        String sql = "SELECT id, name FROM Position";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + " - " + rs.getString("name")
            );
        }
    }

    public void createPosition(String name) throws SQLException {
        String sql = "INSERT INTO Position(name) VALUES (?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, name);
        ps.executeUpdate();
    }
    public void updatePosition() throws SQLException {
        String sql = "UPDATE Position SET name = 'Dev' WHERE id = 5";
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
    }
    public void deletePosition(int id) throws SQLException {
        String sql = "DELETE FROM Position WHERE id = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }


}
