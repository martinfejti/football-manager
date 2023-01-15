package seasons;

import data.*;

import java.util.Arrays;

import static data.PlayerPosition.*;
import static data.TeamFormation.FOUR_THREE_THREE;
import static data.TeamFormation.THREE_FOUR_THREE;

/**
 * 4 csapatos bajnokság teszteléshez
 */
public class TestSeason {

    public static Season create() {
        return new Season("Teszt Szezon", Arrays.asList(
                new Team("Manchester City", FOUR_THREE_THREE, Arrays.asList(
                        new Player("Ederson", GOALKEEPER, SpecificPlayerPosition.GOALKEEPER, 89, 0, 0),
                        new Player("Kyle Walker", DEFENDER, SpecificPlayerPosition.RIGHT_BACK, 85, 0.51, 0.69),
                        new Player("Rúben Días", DEFENDER, SpecificPlayerPosition.RIGHT_CENTRAL_BACK, 88, 0.29, 0.26),
                        new Player("Aymerick Laporte", DEFENDER, SpecificPlayerPosition.LEFT_CENTRAL_BACK, 86, 0.45, 0.47),
                        new Player("Joao Cancelo", DEFENDER, SpecificPlayerPosition.LEFT_BACK, 88, 0.69, 0.79),
                        new Player("Rodri", MIDFIELDER, SpecificPlayerPosition.CENTRAL_DEFENSIVE_MIDFIELDER, 87, 0.64, 0.82),
                        new Player("Kevin De Bruyne", MIDFIELDER, SpecificPlayerPosition.RIGHT_CENTRAL_MIDFIELDER, 91, 0.85, 0.91),
                        new Player("Bernardo Silva", MIDFIELDER, SpecificPlayerPosition.LEFT_CENTRAL_MIDFIELDER, 88, 0.79, 0.78),
                        new Player("Phil Foden", FORWARD, SpecificPlayerPosition.RIGHT_WINGER, 85, 0.79, 0.77),
                        new Player("Erling Haaland", FORWARD, SpecificPlayerPosition.STRIKER, 88, 0.94, 0.87),
                        new Player("Jack Grealish", FORWARD, SpecificPlayerPosition.LEFT_WINGER, 84, 0.76, 0.79),
                        new Player("Stefan Ortega", GOALKEEPER, SpecificPlayerPosition.GOALKEEPER, 80, 0, 0),
                        new Player("Rico Lewis", DEFENDER, SpecificPlayerPosition.RIGHT_BACK, 65, 0.44, 0.37),
                        new Player("John Stones", DEFENDER, SpecificPlayerPosition.RIGHT_CENTRAL_BACK, 83, 0.52, 0.44),
                        new Player("Manuel Akanji", DEFENDER, SpecificPlayerPosition.LEFT_CENTRAL_BACK, 81, 0.38, 0.48),
                        new Player("Sergio Gómez", DEFENDER, SpecificPlayerPosition.LEFT_BACK, 74, 0.67, 0.70),
                        new Player("Kalvin Phillips", MIDFIELDER, SpecificPlayerPosition.CENTRAL_DEFENSIVE_MIDFIELDER, 81, 0.62, 0.68),
                        new Player("Ilkay Gündogan", MIDFIELDER, SpecificPlayerPosition.RIGHT_CENTRAL_MIDFIELDER, 85, 0.81, 0.81),
                        new Player("James McAtee", MIDFIELDER, SpecificPlayerPosition.LEFT_CENTRAL_MIDFIELDER, 63, 0.60, 0.59),
                        new Player("Riyad Mahrez", FORWARD, SpecificPlayerPosition.RIGHT_WINGER, 86, 0.84, 0.83),
                        new Player("Julián Álvarez", FORWARD, SpecificPlayerPosition.STRIKER, 78, 0.80, 0.80),
                        new Player("Cole Palmer", FORWARD, SpecificPlayerPosition.LEFT_WINGER, 67, 0.69, 0.62)
                )),
                new Team("Manchester United", FOUR_THREE_THREE, Arrays.asList(
                        new Player("David De Gea", GOALKEEPER, SpecificPlayerPosition.GOALKEEPER, 87, 0, 0),
                        new Player("Diogo Dalot", DEFENDER, SpecificPlayerPosition.RIGHT_BACK, 78, 0.52, 0.64),
                        new Player("Harry Maguire", DEFENDER, SpecificPlayerPosition.RIGHT_CENTRAL_BACK, 81, 0.48, 0.52),
                        new Player("Raphael Varane", DEFENDER, SpecificPlayerPosition.LEFT_CENTRAL_BACK, 84, 0.46, 0.53),
                        new Player("Luke Shaw", DEFENDER, SpecificPlayerPosition.LEFT_BACK, 80, 0.44, 0.54),
                        new Player("Casemiro", MIDFIELDER, SpecificPlayerPosition.CENTRAL_DEFENSIVE_MIDFIELDER, 89, 0.64, 0.81),
                        new Player("Fred", MIDFIELDER, SpecificPlayerPosition.RIGHT_CENTRAL_MIDFIELDER, 80, 0.61, 0.68),
                        new Player("Bruno Fernandes", MIDFIELDER, SpecificPlayerPosition.LEFT_CENTRAL_MIDFIELDER, 86, 0.83, 0.88),
                        new Player("Anthony", FORWARD, SpecificPlayerPosition.RIGHT_WINGER, 82, 0.76, 0.76),
                        new Player("Wout Weghorst", FORWARD, SpecificPlayerPosition.STRIKER, 79, 0.78, 0.70),
                        new Player("Jadon Sancho", FORWARD, SpecificPlayerPosition.LEFT_WINGER, 84, 0.77, 0.65),
                        new Player("Tom Heaton", GOALKEEPER, SpecificPlayerPosition.GOALKEEPER, 73, 0, 0),
                        new Player("Aaron Wan-Bisakka", DEFENDER, SpecificPlayerPosition.RIGHT_BACK, 80, 0.44, 0.44),
                        new Player("Victor Lindelöf", DEFENDER, SpecificPlayerPosition.RIGHT_CENTRAL_BACK, 80, 0.42, 0.52),
                        new Player("Lisandro Martínez", DEFENDER, SpecificPlayerPosition.LEFT_CENTRAL_BACK, 81, 0.52, 0.66),
                        new Player("Tyrell Malacia", DEFENDER, SpecificPlayerPosition.LEFT_BACK, 79, 0.40, 0.62),
                        new Player("Scott McTominay", MIDFIELDER, SpecificPlayerPosition.CENTRAL_DEFENSIVE_MIDFIELDER, 80, 0.70, 0.80),
                        new Player("Donny van de Beek", MIDFIELDER, SpecificPlayerPosition.RIGHT_CENTRAL_MIDFIELDER, 79, 0.75, 0.77),
                        new Player("Christian Eriksen", MIDFIELDER, SpecificPlayerPosition.LEFT_CENTRAL_MIDFIELDER, 82, 0.73, 0.85),
                        new Player("Anthony Elanga", FORWARD, SpecificPlayerPosition.RIGHT_WINGER, 74, 0.70, 0.63),
                        new Player("Marcus Rashford", FORWARD, SpecificPlayerPosition.STRIKER, 81, 0.81, 0.78),
                        new Player("Alejandro Garnacho", FORWARD, SpecificPlayerPosition.LEFT_WINGER, 66, 0.64, 0.58)
                )),
                new Team("Liverpool", FOUR_THREE_THREE, Arrays.asList(
                        new Player("Allison", GOALKEEPER, SpecificPlayerPosition.GOALKEEPER, 89, 0, 0),
                        new Player("Trent Alexander-Arnold", DEFENDER, SpecificPlayerPosition.RIGHT_BACK, 87, 0.62, 0.75),
                        new Player("Joel Matip", DEFENDER, SpecificPlayerPosition.RIGHT_CENTRAL_BACK, 84, 0.36, 0.48),
                        new Player("Virgil van Dijk", DEFENDER, SpecificPlayerPosition.LEFT_CENTRAL_BACK, 90, 0.52, 0.64),
                        new Player("Andrew Robertson", DEFENDER, SpecificPlayerPosition.LEFT_BACK, 87, 0.55, 0.65),
                        new Player("Fabinho", MIDFIELDER, SpecificPlayerPosition.CENTRAL_DEFENSIVE_MIDFIELDER, 87, 63, 0.70),
                        new Player("Naby Keita", MIDFIELDER, SpecificPlayerPosition.RIGHT_CENTRAL_MIDFIELDER, 81, 0.74, 0.75),
                        new Player("Thiago Alcantara", MIDFIELDER, SpecificPlayerPosition.LEFT_CENTRAL_MIDFIELDER, 86, 0.68, 0.73),
                        new Player("Mohamed Salah", FORWARD, SpecificPlayerPosition.RIGHT_WINGER, 90, 0.93, 0.85),
                        new Player("Darwin Núnez", FORWARD, SpecificPlayerPosition.STRIKER, 82, 0.83, 0.75),
                        new Player("Luis Díaz", FORWARD, SpecificPlayerPosition.LEFT_WINGER, 84, 0.80, 0.82),
                        new Player("Caoimhin Kelleher", GOALKEEPER, SpecificPlayerPosition.GOALKEEPER, 73, 0, 0),
                        new Player("James Milner", DEFENDER, SpecificPlayerPosition.RIGHT_BACK, 78, 0.62, 0.70),
                        new Player("Joe Gomez", DEFENDER, SpecificPlayerPosition.RIGHT_CENTRAL_BACK, 81, 0.26, 0.26),
                        new Player("Ibrahima Konaté", DEFENDER, SpecificPlayerPosition.LEFT_CENTRAL_BACK, 81, 0.29, 0.31),
                        new Player("Konstantinos Tsimikas", DEFENDER, SpecificPlayerPosition.LEFT_BACK, 77, 0.49, 0.64),
                        new Player("Jordan Henderson", MIDFIELDER, SpecificPlayerPosition.CENTRAL_DEFENSIVE_MIDFIELDER, 83, 0.73, 0.75),
                        new Player("Arthur Melo", MIDFIELDER, SpecificPlayerPosition.RIGHT_CENTRAL_MIDFIELDER, 80, 0.56, 0.73),
                        new Player("Alex Oxlade-Chamberlain", MIDFIELDER, SpecificPlayerPosition.LEFT_CENTRAL_MIDFIELDER, 77, 0.70, 0.78),
                        new Player("Cody Gakpo", FORWARD, SpecificPlayerPosition.RIGHT_WINGER, 83, 0.82, 0.83),
                        new Player("Roberto Firmino", FORWARD, SpecificPlayerPosition.STRIKER, 83, 0.76, 0.76),
                        new Player("Diogo Jota", FORWARD, SpecificPlayerPosition.LEFT_WINGER, 85, 0.86, 0.75)
                )),
                new Team("Chelsea", THREE_FOUR_THREE, Arrays.asList(
                        new Player("Édouard Mendy", GOALKEEPER, SpecificPlayerPosition.GOALKEEPER, 86, 0, 0),
                        new Player("Kepa Arrizabalaga", GOALKEEPER, SpecificPlayerPosition.GOALKEEPER, 80, 0, 0),
                        new Player("Kalidou Koulibaly", DEFENDER, SpecificPlayerPosition.LEFT_CENTRAL_BACK, 87, 0.25, 0.20),
                        new Player("Thiago Silva", DEFENDER, SpecificPlayerPosition.CENTRAL_BACK, 86, 0.40, 0.65),
                        new Player("César Azpilicueta", DEFENDER, SpecificPlayerPosition.RIGHT_CENTRAL_BACK, 82, 0.46, 0.60),
                        new Player("Wesley Fofana", DEFENDER, SpecificPlayerPosition.LEFT_CENTRAL_BACK, 79, 0.29, 0.37),
                        new Player("Benoit Badiashile", DEFENDER, SpecificPlayerPosition.CENTRAL_BACK, 77, 0.38, 0.47),
                        new Player("Trevor Chalobah", DEFENDER, SpecificPlayerPosition.RIGHT_CENTRAL_BACK, 76, 0.44, 0.50),
                        new Player("Ben Chillwell", MIDFIELDER, SpecificPlayerPosition.LEFT_WINGER, 82, 0.58, 0.47),
                        new Player("Marc Cucurella", MIDFIELDER, SpecificPlayerPosition.LEFT_WINGER, 81, 0.68, 0.65),
                        new Player("Reece James", MIDFIELDER, SpecificPlayerPosition.RIGHT_WINGER, 84, 0.66, 0.69),
                        new Player("Lewis Hall", MIDFIELDER, SpecificPlayerPosition.RIGHT_WINGER, 61, 0.49, 0.52),
                        new Player("Jorginho", MIDFIELDER, SpecificPlayerPosition.RIGHT_CENTRAL_MIDFIELDER, 85, 0.64, 0.62),
                        new Player("Mateo Kovacic", MIDFIELDER, SpecificPlayerPosition.LEFT_CENTRAL_MIDFIELDER, 84, 0.61, 0.75),
                        new Player("Mason Mount", MIDFIELDER, SpecificPlayerPosition.RIGHT_CENTRAL_MIDFIELDER, 84, 0.81, 0.83),
                        new Player("Ngolo Kanté", MIDFIELDER, SpecificPlayerPosition.LEFT_CENTRAL_MIDFIELDER, 89, 0.65, 0.65),
                        new Player("Hakim Ziyech", FORWARD, SpecificPlayerPosition.RIGHT_STRIKER, 83, 0.73, 0.80),
                        new Player("Raheem Sterling", FORWARD, SpecificPlayerPosition.RIGHT_STRIKER, 86, 0.82, 0.80),
                        new Player("Joao Felix", FORWARD, SpecificPlayerPosition.LEFT_STRIKER, 83, 0.79, 0.81),
                        new Player("Christian Pulisic", FORWARD, SpecificPlayerPosition.LEFT_STRIKER, 82, 0.74, 0.57),
                        new Player("Pierre-Emerick Aubameyang", FORWARD, SpecificPlayerPosition.STRIKER, 84, 0.86, 0.79),
                        new Player("Kai Havertz", FORWARD, SpecificPlayerPosition.STRIKER, 84, 0.81, 0.78)
                ))
                /*
                new Team("Chelsea", THREE_FOUR_THREE, Arrays.asList(
                        new Player("Édouard Mendy", GOALKEEPER, SpecificPlayerPosition.GOALKEEPER, 86, 0, 0),
                        new Player("Reece James", DEFENDER, SpecificPlayerPosition.RIGHT_BACK, 84, 0.66, 0.69),
                        new Player("Thiago Silva", DEFENDER, SpecificPlayerPosition.RIGHT_CENTRAL_BACK, 86, 0.40, 0.65),
                        new Player("Kalidou Koulibaly", DEFENDER, SpecificPlayerPosition.LEFT_CENTRAL_BACK, 87, 0.25, 0.20),
                        new Player("Ben Chillwell", DEFENDER, SpecificPlayerPosition.LEFT_BACK, 82, 0.58, 0.47),
                        new Player("Jorginho", MIDFIELDER, SpecificPlayerPosition.CENTRAL_DEFENSIVE_MIDFIELDER, 85, 0.64, 0.62),
                        new Player("Mateo Kovacic", MIDFIELDER, SpecificPlayerPosition.RIGHT_CENTRAL_MIDFIELDER, 84, 0.61, 0.75),
                        new Player("Mason Mount", MIDFIELDER, SpecificPlayerPosition.LEFT_CENTRAL_MIDFIELDER, 84, 0.81, 0.83),
                        new Player("Hakim Ziyech", FORWARD, SpecificPlayerPosition.RIGHT_WINGER, 83, 0.73, 0.80),
                        new Player("Pierre-Emerick Aubameyang", FORWARD, SpecificPlayerPosition.STRIKER, 84, 0.86, 0.79),
                        new Player("Christian Pulisic", FORWARD, SpecificPlayerPosition.LEFT_WINGER, 82, 0.74, 0.57),
                        new Player("Kepa Arrizabalaga", GOALKEEPER, SpecificPlayerPosition.GOALKEEPER, 80, 0, 0),
                        new Player("César Azpilicueta", DEFENDER, SpecificPlayerPosition.RIGHT_BACK, 82, 0.46, 0.60),
                        new Player("Wesley Fofana", DEFENDER, SpecificPlayerPosition.RIGHT_CENTRAL_BACK, 79, 0.29, 0.37),
                        new Player("Benoit Badiashile", DEFENDER, SpecificPlayerPosition.LEFT_CENTRAL_BACK, 77, 0.38, 0.47),
                        new Player("Marc Cucurella", DEFENDER, SpecificPlayerPosition.LEFT_BACK, 81, 0.68, 0.65),
                        new Player("Ngolo Kanté", MIDFIELDER, SpecificPlayerPosition.CENTRAL_DEFENSIVE_MIDFIELDER, 89, 0.65, 0.65),
                        new Player("Conor Gallagher", MIDFIELDER, SpecificPlayerPosition.RIGHT_CENTRAL_MIDFIELDER, 79, 0.77, 0.78),
                        new Player("Kai Havertz", MIDFIELDER, SpecificPlayerPosition.LEFT_CENTRAL_MIDFIELDER, 84, 0.81, 0.78),
                        new Player("Raheem Sterling", FORWARD, SpecificPlayerPosition.RIGHT_WINGER, 86, 0.82, 0.80),
                        new Player("Armando Broja", FORWARD, SpecificPlayerPosition.STRIKER, 75, 0.77, 0.61),
                        new Player("Joao Felix", FORWARD, SpecificPlayerPosition.LEFT_WINGER, 83, 0.79, 0.81)
                ))

                 */
        ));
    }

}
