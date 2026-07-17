package Test;

import java.sql.*;

public class HighRatedPlayers {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/football_manager";
        String user = "postgres";
        String password = "Benqzowie5891";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT name, overall FROM players WHERE overall > 88")) {

            while (rs.next()) {
                String name = rs.getString("name");
                int overall = rs.getInt("overall");
                System.out.println(name + " (" + overall + ")");
            }

        } catch (SQLException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
