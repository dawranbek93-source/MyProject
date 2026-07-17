package main.java.football;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private int budget;
    private List<Player> player;
    private int gamesPlayed;
    private int points;
    private int wins;
    private int draws;
    private int losses;
    private int goalsScored;
    private int goalsConceded;


    public Team(String name, int budget) {
        this.name = name; this.budget = budget;        //конструкторы
        this.player = new ArrayList<>();

    }

    public String getName () { return name;}
    public int getBudget() {return budget;}                 //геттеры
    public List<Player> getPlayer() {return player;}
    public int getGamesPlayed() {return gamesPlayed;}
    public int getPoints () {return points;}
    public int getWins() {return wins;}
    public int getDraws() {return draws;}                //геттеры
    public int getLosses() {return losses;}
    public int getGoalsScored() {return goalsScored;}
    public int getGoalsConceded() {return goalsConceded;}

    public void setBudget(int budget) {this.budget = budget;}         //сеттеры
    public void setGamesPlayed(int gamesPlayed) {this.gamesPlayed = gamesPlayed;}
    public void setPoints(int points) {this.points = points;}
    public void setWins(int wins) {this.wins = wins;}
    public void setDraws(int draws) {this.draws = draws;}              // сеттеры
    public void setLosses(int losses) {this.losses = losses;}
    public void setGoalsScored(int goalsScored) {this.goalsScored = goalsScored;}
    public void setGoalsConceded(int goalsConceded) {this.goalsConceded = goalsConceded;}

    public void addPlayer(Player player) {
        this.player.add(player);                    //метод для добавление игрока
    }
    public void removePlayer(Player player) {
        this.player.remove(player);                   //метод для удаление игрока
    }

    public int getGoalDifference() {return goalsScored - goalsConceded;}  // метод для считывание разницу голов

    @Override
    public String toString() { return "Team{" + "name='" + name + '\'' + ", " +
    "budget=" + budget + ", player=" + player.size() + "}";}
}
