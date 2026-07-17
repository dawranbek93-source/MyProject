package main.java.football;

import java.time.LocalDate;

public class Player {

   private int id;
   private String name;
   private Position position;
   private int overall;
   private int potential;
   private int speed;
   private int shooting;
   private int passing;
   private int dribbling;            //Поля
   private int defending;
   private int physical;
   private int diving;
   private int handling;
   private int kicking;
   private int reflexes;
   private int positioning;
   private LocalDate birthDate;
   private String nationality;
   private int value;
   private int teamId;
   private String preferredFoot;
   private int height;
   private int weight;

    public Player(int id, String name, Position position,
    int overall, int potential, int speed, int shooting,
    int passing, int dribbling, int defending, int physical,
    int diving, int handling, int kicking, int reflexes,
    int positioning, LocalDate birthDate, String nationality,
    int value, int teamId, String preferredFoot, int height, int weight) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.overall = overall;
        this.potential = potential;
        this.speed = speed;
        this.shooting = shooting;
        this.passing = passing;
        this.dribbling = dribbling;
        this.defending = defending;
        this.physical = physical;     // конструкторы
        this.diving = diving;
        this.handling = handling;
        this.kicking = kicking;
        this.reflexes = reflexes;
        this.positioning = positioning;
        this.birthDate = birthDate;
        this.nationality = nationality;
        this.value = value;
        this.teamId = teamId;
        this.preferredFoot = preferredFoot;
        this.height = height;
        this.weight = weight;
    }

    public int getId() { return id; }
    public String getName() {return name; }
    public Position getPosition() {return position; }
    public int getOverall() { return overall; }
    public int getPotential() {return potential; }
    public int getSpeed() { return speed; }
    public int getShooting() { return shooting; }
    public int getPassing() { return passing; }
    public int getDribbling() { return dribbling; }
    public int getDefending() { return defending; }
    public int getPhysical() { return physical; }
    public int getDiving() { return diving; }                         //геттеры
    public int getHandling() { return handling; }
    public int getKicking() { return kicking; }
    public int getReflexes() { return reflexes; }
    public int getPositioning() { return positioning; }
    public LocalDate getBirthDate() { return birthDate; }
    public String getNationality() { return nationality; }
    public int getValue() { return value; }
    public int getTeamId() { return teamId; }
    public String getPreferredFoot() { return preferredFoot; }
    public int getHeight() { return height; }
    public int getWeight() { return weight; }



    public void setOverall(int overall) { this.overall = overall; }
    public void setPotential(int potential) { this.potential = potential; }
    public void setSpeed(int speed) { this.speed = speed; }
    public void setShooting(int shooting) { this.shooting = shooting; }
    public void setPassing(int passing) { this.passing = passing; }
    public void setDribbling(int dribbling) { this.dribbling = dribbling; }
    public void setDefending(int defending) { this.defending = defending; }
    public void setPhysical(int physical) { this.physical = physical; }                       // Сеттеры
    public void setDiving(int diving) { this.diving = diving; }         // сеттеры
    public void setHandling(int handling) { this.handling = handling; }
    public void setKicking(int kicking) { this.kicking = kicking; }
    public void setReflexes(int reflexes) { this.reflexes = reflexes; }
    public void setPositioning(int positioning) { this.positioning = positioning; }
    public void setValue(int value) { this.value = value; }
    public void setTeamId(int teamId) { this.teamId = teamId; }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position=" + position +
                ", overall=" + overall +
                ", potential=" + potential +
                ", speed=" + speed +
                ", shooting=" + shooting +
                ", passing=" + passing +
                ", dribbling=" + dribbling +        //toString
                ", defending=" + defending +
                ", physical=" + physical +
                ", diving=" + diving +
                ", handling=" + handling +
                ", kicking=" + kicking +
                ", reflexes=" + reflexes +
                ", positioning=" + positioning +
                ", birthDate=" + birthDate +
                ", nationality='" + nationality + '\'' +
                ", value=" + value +
                ", teamId=" + teamId +
                ", preferredFoot='" + preferredFoot + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}















































































































