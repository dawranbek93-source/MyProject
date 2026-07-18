package main.java.football;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FootballManager {

    public static void main(String[] args) {
        List<Player> allPlayers = loadPlayersFromDatabase();
        System.out.println("Всего загружено игроков: " + allPlayers.size());

        // 2. Создаём команды
        Team real = new Team("Реал Мадрид", 500_000_000);
        Team barca = new Team("Барселона", 300_000_000);

        // 3. Распределяем игроков по клубам
        for (Player p : allPlayers) {
            if (p.getTeamId() == 1) {
                real.addPlayer(p);
            } else if (p.getTeamId() == 2) {
                barca.addPlayer(p);
            }
        }

        // 4. Выводим результаты
        System.out.println("Игроков в Реале: " + real.getPlayer().size());
        System.out.println("Игроков в Барселоне: " + barca.getPlayer().size());

        // 5. Красиво выводим состав Реала
        System.out.println("\n=== СОСТАВ РЕАЛ МАДРИД ===");
        for (Player p : real.getPlayer()) {
            System.out.printf("%-3d %-25s %s%n", p.getJerseyNumber(), p.getName(), p.getPosition());
        }

        // 6. Красиво выводим состав Барселоны
        System.out.println("\n=== СОСТАВ БАРСЕЛОНА ===");
        for (Player p : barca.getPlayer()) {
            System.out.printf("%-3d %-25s %s%n", p.getJerseyNumber(), p.getName(), p.getPosition());
        }


    }

    public static List<Player> loadPlayersFromDatabase() {

        List<Player> players = new ArrayList<>();
        String url = "jdbc:postgresql://localhost:5432/football_manager";
        String user = "postgres";
        String password = "Benqzowie5891";

        String sql = "SELECT id, name, position, overall, potential, speed, shooting, passing, " +
                "dribbling, defending, physical, diving, handling, kicking, reflexes, positioning, " +
                "birth_date, nationality, value, team_id, preferred_foot, height, weight, jersey_number " +
                "FROM players";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Player player = new Player(
                        rs.getInt("id"),
                        rs.getString("name"),
                        Position.valueOf(rs.getString("position")),
                        rs.getInt("overall"),
                        rs.getInt("potential"),
                        rs.getInt("speed"),
                        rs.getInt("shooting"),
                        rs.getInt("passing"),
                        rs.getInt("dribbling"),
                        rs.getInt("defending"),
                        rs.getInt("physical"),
                        rs.getInt("diving"),
                        rs.getInt("handling"),
                        rs.getInt("kicking"),
                        rs.getInt("reflexes"),
                        rs.getInt("positioning"),
                        rs.getDate("birth_date").toLocalDate(),
                        rs.getString("nationality"),
                        rs.getInt("value"),
                        rs.getInt("team_id"),
                        rs.getString("preferred_foot"),
                        rs.getInt("height"),
                        rs.getInt("weight"),
                        rs.getInt("jersey_number")  // <-- новый параметр
                );
                players.add(player);
            }

        } catch (SQLException e) {
            System.out.println("Ошибка загрузки игроков: " + e.getMessage());
        }
        return players;
    }
}
