package main.java.football;

import java.time.LocalDate;

public class FootballManager {

    public static void main(String[] args) {

        // Создаём лигу
        League laLiga = new League("Ла Лига");

// Создаём команды
        Team real = new Team("Реал Мадрид", 500_000_000);
        Team barca = new Team("Барселона", 300_000_000);

// Добавляем команды в лигу
        laLiga.addTeam(real);
        laLiga.addTeam(barca);

// Вручную проставляем статистику для проверки
        real.setWins(2); real.setDraws(1); real.setLosses(0);
        real.setGoalsScored(7); real.setGoalsConceded(2);
        real.setGamesPlayed(3); real.setPoints(2*3 + 1); // 7 очков

        barca.setWins(1); barca.setDraws(2); barca.setLosses(0);
        barca.setGoalsScored(5); barca.setGoalsConceded(4);
        barca.setGamesPlayed(3); barca.setPoints(1*3 + 2); // 5 очков

// Выводим таблицу
        laLiga.printTable();




    }

}
