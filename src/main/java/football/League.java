package main.java.football;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class League {

    private String name;                    //поля
    private List<Team> teams;

    public League(String name)
    {this.name = name; this.teams = new ArrayList<>();}   // конструкторы

    public String getName() {return name;}                 // геттеры
    public List<Team> getTeams() {return teams;}

    public void addTeam(Team team) {                    // метод для добавление команд
        this.teams.add(team);
    }

    public void printTable(){
        teams.sort(Comparator.comparingInt(Team::getPoints)
                .thenComparingInt(Team::getGoalDifference)    // таблица лиги сортируем по очкам после по разница голов
                .reversed());

        System.out.println("№  | Команда            | И  | В  | Н  | П  | ЗГ | ПГ | РМ | О");
        System.out.println("---|--------------------|----|----|----|----|----|----|----|---");

        for (int i = 0; i <teams.size() ; i++) {
            Team team = teams.get(i);                                                       // таблица
            System.out.printf("%-3d| %-19s| %-3d| %-3d| %-3d| %-3d| %-3d| %-3d| %-3d| %-3d%n",
             i+ 1, team.getName(), team.getGamesPlayed(), team.getWins(), team.getDraws(),
             team.getLosses(), team.getGoalsScored(), team.getGoalsConceded(),team.getGoalDifference(), team.getPoints());
        }
    }
    public String toString() {return "Лига: " + name + ", команд: " + teams.size();}   //toString
}
