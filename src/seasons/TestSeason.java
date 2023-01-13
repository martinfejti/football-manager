package seasons;

import data.*;

import java.util.Arrays;

import static data.PlayerPosition.*;
import static data.TeamFormation.FOUR_THREE_THREE;

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
                        new Player("Cristiano Ronaldo", FORWARD, SpecificPlayerPosition.STRIKER, 90, 0.93, 0.90),
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
                        new Player("Allison", GOALKEEPER, SpecificPlayerPosition.GOALKEEPER, 90, 0, 0),
                        new Player("Arnold", DEFENDER, SpecificPlayerPosition.RIGHT_BACK, 85, 0.56, 0.70),
                        new Player("Gomez", DEFENDER, SpecificPlayerPosition.RIGHT_CENTRAL_BACK, 82, 0.26, 0.26),
                        new Player("Van Dijk", DEFENDER, SpecificPlayerPosition.LEFT_CENTRAL_BACK, 91, 0.52, 0.64),
                        new Player("Robertson", DEFENDER, SpecificPlayerPosition.LEFT_BACK, 86, 0.57, 0.65),
                        new Player("Henderson", MIDFIELDER, SpecificPlayerPosition.CENTRAL_DEFENSIVE_MIDFIELDER, 85, 69, 0.72),
                        new Player("Thiago", MIDFIELDER, SpecificPlayerPosition.RIGHT_CENTRAL_MIDFIELDER, 96, 0.63, 0.65),
                        new Player("Wijnaldum", MIDFIELDER, SpecificPlayerPosition.LEFT_CENTRAL_MIDFIELDER, 90, 0.74, 0.71),
                        new Player("Salah", FORWARD, SpecificPlayerPosition.RIGHT_WINGER, 90, 0.90, 0.84),
                        new Player("Firmino", FORWARD, SpecificPlayerPosition.STRIKER, 88, 0.84, 0.79),
                        new Player("Mane", FORWARD, SpecificPlayerPosition.LEFT_WINGER, 90, 0.90, 0.78),
                        new Player("Allison2", GOALKEEPER, SpecificPlayerPosition.GOALKEEPER, 90, 0, 0),
                        new Player("Arnold2", DEFENDER, SpecificPlayerPosition.RIGHT_BACK, 85, 0.56, 0.70),
                        new Player("Gomez2", DEFENDER, SpecificPlayerPosition.RIGHT_CENTRAL_BACK, 82, 0.26, 0.26),
                        new Player("Van Dijk2", DEFENDER, SpecificPlayerPosition.LEFT_CENTRAL_BACK, 91, 0.52, 0.64),
                        new Player("Robertson2", DEFENDER, SpecificPlayerPosition.LEFT_BACK, 86, 0.57, 0.65),
                        new Player("Henderson2", MIDFIELDER, SpecificPlayerPosition.CENTRAL_DEFENSIVE_MIDFIELDER, 85, 69, 0.72),
                        new Player("Thiago2", MIDFIELDER, SpecificPlayerPosition.RIGHT_CENTRAL_MIDFIELDER, 96, 0.63, 0.65),
                        new Player("Wijnaldum2", MIDFIELDER, SpecificPlayerPosition.LEFT_CENTRAL_MIDFIELDER, 90, 0.74, 0.71),
                        new Player("Salah2", FORWARD, SpecificPlayerPosition.RIGHT_WINGER, 90, 0.90, 0.84),
                        new Player("Firmino2", FORWARD, SpecificPlayerPosition.STRIKER, 88, 0.84, 0.79),
                        new Player("Mane2", FORWARD, SpecificPlayerPosition.LEFT_WINGER, 90, 0.90, 0.78)
                )),
                new Team("Chelsea", FOUR_THREE_THREE, Arrays.asList(
                        new Player("EMendy", GOALKEEPER, SpecificPlayerPosition.GOALKEEPER, 76, 0, 0),
                        new Player("James", DEFENDER, SpecificPlayerPosition.RIGHT_BACK, 73, 0.41, 0.36),
                        new Player("Thiago Silva", DEFENDER, SpecificPlayerPosition.RIGHT_CENTRAL_BACK, 72, 0.35, 0.55),
                        new Player("Christensen", DEFENDER, SpecificPlayerPosition.LEFT_CENTRAL_BACK, 71, 0.30, 0.36),
                        new Player("Chillwell", DEFENDER, SpecificPlayerPosition.LEFT_BACK, 72, 0.59, 0.60),
                        new Player("Jorginho", MIDFIELDER, SpecificPlayerPosition.CENTRAL_DEFENSIVE_MIDFIELDER, 71, 0.56, 0.68),
                        new Player("Kante", MIDFIELDER, SpecificPlayerPosition.RIGHT_CENTRAL_MIDFIELDER, 45, 0.66, 0.69),
                        new Player("Kovacic", MIDFIELDER, SpecificPlayerPosition.LEFT_CENTRAL_MIDFIELDER, 47, 0.69, 0.64),
                        new Player("Mount", FORWARD, SpecificPlayerPosition.RIGHT_WINGER, 74, 0.71, 0.62),
                        new Player("Werner", FORWARD, SpecificPlayerPosition.STRIKER, 76, 0.76, 0.68),
                        new Player("Hudson-Odoi", FORWARD, SpecificPlayerPosition.LEFT_WINGER, 80, 0.8, 0.64),
                        new Player("EMendy2", GOALKEEPER, SpecificPlayerPosition.GOALKEEPER, 76, 0, 0),
                        new Player("James2", DEFENDER, SpecificPlayerPosition.RIGHT_BACK, 73, 0.41, 0.36),
                        new Player("Thiago Silva2", DEFENDER, SpecificPlayerPosition.RIGHT_CENTRAL_BACK, 72, 0.35, 0.55),
                        new Player("Christensen2", DEFENDER, SpecificPlayerPosition.LEFT_CENTRAL_BACK, 71, 0.30, 0.36),
                        new Player("Chillwell2", DEFENDER, SpecificPlayerPosition.LEFT_BACK, 72, 0.59, 0.60),
                        new Player("Jorginho2", MIDFIELDER, SpecificPlayerPosition.CENTRAL_DEFENSIVE_MIDFIELDER, 71, 0.56, 0.68),
                        new Player("Kante2", MIDFIELDER, SpecificPlayerPosition.RIGHT_CENTRAL_MIDFIELDER, 45, 0.66, 0.69),
                        new Player("Kovacic2", MIDFIELDER, SpecificPlayerPosition.LEFT_CENTRAL_MIDFIELDER, 47, 0.69, 0.64),
                        new Player("Mount2", FORWARD, SpecificPlayerPosition.RIGHT_WINGER, 74, 0.71, 0.62),
                        new Player("Werner2", FORWARD, SpecificPlayerPosition.STRIKER, 76, 0.76, 0.68),
                        new Player("Hudson-Odoi2", FORWARD, SpecificPlayerPosition.LEFT_WINGER, 80, 0.8, 0.64)
                ))
        ));
    }

}
