import football.Player;
import football.Position;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Player mbappe = new Player(1,"Mbappe", Position.ФРВ, 92, 99,
                97, 95, 80, 90, 30, 35,
                15, 19, 20, 14, 22, LocalDate.of(1998,12,20),
                "Франция", 180000000, 1, "Правая", 186, 80);

        System.out.println(mbappe);
    }
}