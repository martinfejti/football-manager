package seasons;

import teams.Player;
import teams.Team;

import java.util.Arrays;

/**
 * 4 csapatos bajnokság teszteléshez
 */
public class TestSeason {

    public static Season create() {
        return new Season("Teszt Szezon", Arrays.asList(
                new Team("Manchester City", Arrays.asList(
                        new Player("Ederson", "GKP", 88, 0, 0),
                        new Player("Walker", "DEF", 83, 0.51, 0.69),
                        new Player("García", "DEF", 81, 0.29, 0.38),
                        new Player("Laporte", "DEF", 97, 0.45, 0.47),
                        new Player("Cancelo", "DEF", 88, 0.58, 0.68),
                        new Player("Rodri", "MID", 85, 0.64, 0.76),
                        new Player("De Bruyne", "MID", 91, 0.82, 0.90),
                        new Player("Silva", "MID", 93, 0.72, 0.73),
                        new Player("Foden", "FOR", 86, 0.79, 0.80),
                        new Player("Agüero", "FOR", 90, 0.94, 0.84),
                        new Player("Sterling", "FOR", 88, 0.85, 0.79)
                )),
                new Team("Manchester United", Arrays.asList(
                        new Player("De Gea", "GKP", 88, 0, 0),
                        new Player("Wan-Bisakka", "DEF", 82, 0.68, 0.44),
                        new Player("Maguire", "DEF", 83, 0.48, 0.52),
                        new Player("Lindelöf", "DEF", 81, 0.42, 0.52),
                        new Player("Shaw", "DEF", 80, 0.44, 0.54),
                        new Player("Fred", "MID", 82, 0.69, 0.70),
                        new Player("Pogba", "MID", 89, 0.75, 0.82),
                        new Player("Fernandes", "MID", 93, 0.77, 0.89),
                        new Player("Greenwood", "FOR", 74, 0.74, 0.73),
                        new Player("Martial", "FOR", 83, 0.82, 0.77),
                        new Player("Rashford", "FOR", 84, 0.83, 0.81)
                )),
                new Team("Liverpool", Arrays.asList(
                        new Player("Allison", "GKP", 90, 0, 0),
                        new Player("Arnold", "DEF", 85, 0.56, 0.70),
                        new Player("Gomez", "DEF", 82, 0.26, 0.26),
                        new Player("Van Dijk", "DEF", 91, 0.52, 0.64),
                        new Player("Robertson", "DEF", 86, 0.57, 0.65),
                        new Player("Henderson", "MID", 85, 69, 0.72),
                        new Player("Thiago", "MID", 96, 0.63, 0.65),
                        new Player("Wijnaldum", "MID", 90, 0.74, 0.71),
                        new Player("Salah", "FOR", 90, 0.90, 0.84),
                        new Player("Firmino", "FOR", 88, 0.84, 0.79),
                        new Player("Mane", "FOR", 90, 0.90, 0.78)
                )),
                new Team("Chelsea", Arrays.asList(
                        new Player("Mendy", "GKP", 76, 0, 0),
                        new Player("James", "DEF", 73, 0.41, 0.36),
                        new Player("Thiago Silva", "DEF", 72, 0.35, 0.55),
                        new Player("Christensen", "DEF", 71, 0.30, 0.36),
                        new Player("Chillwell", "DEF", 72, 0.59, 0.60),
                        new Player("Jorginho", "MID", 71, 0.56, 0.68),
                        new Player("Kante", "MID", 45, 0.66, 0.69),
                        new Player("Kovacic", "MID", 47, 0.69, 0.64),
                        new Player("Mount", "FOR", 74, 0.71, 0.62),
                        new Player("Werner", "FOR", 76, 0.76, 0.68),
                        new Player("Hudson-Odoi", "FOR", 80, 0.8, 0.64)
                ))
        ));
    }
}
