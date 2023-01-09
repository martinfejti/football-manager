package seasons;

import data.Player;
import data.Season;
import data.Team;

import java.util.Arrays;

import static data.PlayerPosition.*;

/**
 * 4 csapatos bajnokság teszteléshez
 */
public class TestSeason {

    public static Season create() {
        return new Season("Teszt Szezon", Arrays.asList(
                new Team("Manchester City", Arrays.asList(
                        new Player("Ederson", GOALKEEPER, 88, 0, 0),
                        new Player("Walker", DEFENDER, 83, 0.51, 0.69),
                        new Player("García", DEFENDER, 81, 0.29, 0.38),
                        new Player("Laporte", DEFENDER, 97, 0.45, 0.47),
                        new Player("Cancelo", DEFENDER, 88, 0.58, 0.68),
                        new Player("Rodri", MIDFIELDER, 85, 0.64, 0.76),
                        new Player("De Bruyne", MIDFIELDER, 91, 0.82, 0.90),
                        new Player("Silva", MIDFIELDER, 93, 0.72, 0.73),
                        new Player("Foden", FORWARD, 86, 0.79, 0.80),
                        new Player("Agüero", FORWARD, 90, 0.94, 0.84),
                        new Player("Sterling", FORWARD, 88, 0.85, 0.79)
                )),
                new Team("Manchester United", Arrays.asList(
                        new Player("De Gea", GOALKEEPER, 88, 0, 0),
                        new Player("Wan-Bisakka", DEFENDER, 82, 0.68, 0.44),
                        new Player("Maguire", DEFENDER, 83, 0.48, 0.52),
                        new Player("Lindelöf", DEFENDER, 81, 0.42, 0.52),
                        new Player("Shaw", DEFENDER, 80, 0.44, 0.54),
                        new Player("Fred", MIDFIELDER, 82, 0.69, 0.70),
                        new Player("Pogba", MIDFIELDER, 89, 0.75, 0.82),
                        new Player("Fernandes", MIDFIELDER, 93, 0.77, 0.89),
                        new Player("Greenwood", FORWARD, 74, 0.74, 0.73),
                        new Player("Martial", FORWARD, 83, 0.82, 0.77),
                        new Player("Rashford", FORWARD, 84, 0.83, 0.81)
                )),
                new Team("Liverpool", Arrays.asList(
                        new Player("Allison", GOALKEEPER, 90, 0, 0),
                        new Player("Arnold", DEFENDER, 85, 0.56, 0.70),
                        new Player("Gomez", DEFENDER, 82, 0.26, 0.26),
                        new Player("Van Dijk", DEFENDER, 91, 0.52, 0.64),
                        new Player("Robertson", DEFENDER, 86, 0.57, 0.65),
                        new Player("Henderson", MIDFIELDER, 85, 69, 0.72),
                        new Player("Thiago", MIDFIELDER, 96, 0.63, 0.65),
                        new Player("Wijnaldum", MIDFIELDER, 90, 0.74, 0.71),
                        new Player("Salah", FORWARD, 90, 0.90, 0.84),
                        new Player("Firmino", FORWARD, 88, 0.84, 0.79),
                        new Player("Mane", FORWARD, 90, 0.90, 0.78)
                )),
                new Team("Chelsea", Arrays.asList(
                        new Player("Mendy", GOALKEEPER, 76, 0, 0),
                        new Player("James", DEFENDER, 73, 0.41, 0.36),
                        new Player("Thiago Silva", DEFENDER, 72, 0.35, 0.55),
                        new Player("Christensen", DEFENDER, 71, 0.30, 0.36),
                        new Player("Chillwell", DEFENDER, 72, 0.59, 0.60),
                        new Player("Jorginho", MIDFIELDER, 71, 0.56, 0.68),
                        new Player("Kante", MIDFIELDER, 45, 0.66, 0.69),
                        new Player("Kovacic", MIDFIELDER, 47, 0.69, 0.64),
                        new Player("Mount", FORWARD, 74, 0.71, 0.62),
                        new Player("Werner", FORWARD, 76, 0.76, 0.68),
                        new Player("Hudson-Odoi", FORWARD, 80, 0.8, 0.64)
                ))
        ));
    }

}
