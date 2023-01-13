package seasons;

import data.Player;
import data.Season;
import data.Team;

import java.util.Arrays;

import static data.PlayerPosition.*;

public class SerieA2006Season {

        /*
    public static Season create() {
        return new Season("Serie A 2005-2006", Arrays.asList(
                new Team("Milan", Arrays.asList(
                        new Player("Dida", GOALKEEPER, 92, 0, 0),
                        new Player("Stam", DEFENDER, 90, 0.26, 0.21),
                        new Player("Nesta", DEFENDER, 90, 0.36, 0.41),
                        new Player("Maldini", DEFENDER, 91, 0.34, 0.22),
                        new Player("Cafu", DEFENDER, 87, 0.22, 0.61),
                        new Player("Gattuso", MIDFIELDER, 87, 0.78, 0.21),
                        new Player("Pirlo", MIDFIELDER,  86, 0.47, 0.84),
                        new Player("Seedorf", MIDFIELDER, 90, 0.84, 0.88),
                        new Player("Kaka", FORWARD, 90, 0.88, 0.87),
                        new Player("Shevchenko", FORWARD, 93, 0.95, 0.77),
                        new Player("Gilardino", FORWARD, 87, 0.93, 0.94)
                )),
                new Team("Juventus", Arrays.asList(
                        new Player("Buffon", GOALKEEPER, 95, 0, 0),
                        new Player("Zebina", DEFENDER, 74, 0.37, 0.67),
                        new Player("Thuram", DEFENDER, 90, 0.21, 0.39),
                        new Player("Cannavaro", DEFENDER, 89, 0.44, 0.71),
                        new Player("Zambrotta", DEFENDER, 91, 0.33, 0.92),
                        new Player("Camoranesi", MIDFIELDER, 84, 0.82, 0.92),
                        new Player("Viera", MIDFIELDER, 89, 0.72, 0.52),
                        new Player("Nedved", MIDFIELDER, 90, 0.85, 0.97),
                        new Player("Ibrahimovic", FORWARD, 91, 0.90, 0.91),
                        new Player("Del Piero", FORWARD, 89, 0.89, 0.89),
                        new Player("Trezeguet", FORWARD, 92, 0.95, 0.77)
                )),
                new Team("Internazionale", Arrays.asList(
                        new Player("Toldo", GOALKEEPER, 90, 0, 0),
                        new Player("Ze Maria", DEFENDER, 71, 0.32, 0.41),
                        new Player("Cordoba", DEFENDER,  79, 0.44, 0.38),
                        new Player("Samuel", DEFENDER, 87, 0.42, 0.63),
                        new Player("Zanetti", DEFENDER, 85, 0.30, 0.24),
                        new Player("Cambiasso", MIDFIELDER, 85, 0.59, 0.58),
                        new Player("Solari", MIDFIELDER, 84, 0.84, 0.82),
                        new Player("Figo", MIDFIELDER, 89, 0.89, 0.82),
                        new Player("Martins", FORWARD, 85, 0.89, 0.88),
                        new Player("Adriano", FORWARD, 94, 0.96, 0.89),
                        new Player("Recoba", FORWARD, 86, 0.80, 0.89)
                )),
                new Team("Roma", Arrays.asList(
                        new Player("Curci", GOALKEEPER, 75, 0, 0),
                        new Player("Panucci", DEFENDER, 78, 0.47, 0.39),
                        new Player("Kuffour", DEFENDER, 80, 0.42, 0.34),
                        new Player("Chivu", DEFENDER, 81, 0.23, 0.78),
                        new Player("Mexes", DEFENDER, 84, 0.28, 0.35),
                        new Player("De Rossi", MIDFIELDER, 78, 0.79, 0.76),
                        new Player("Mancini", MIDFIELDER, 81, 0.78, 0.56),
                        new Player("Perrotta", MIDFIELDER, 81, 0.74, 0.43),
                        new Player("Totti", FORWARD, 89, 0.82, 0.85),
                        new Player("Montella", FORWARD, 83, 0.80, 0.78),
                        new Player("Cassano", FORWARD, 89, 0.88, 0.81)
                )),
                new Team("Lazio", Arrays.asList(
                        new Player("Peruzzi", GOALKEEPER, 85, 0, 0),
                        new Player("Oddo", DEFENDER, 84, 0.28, 0.41),
                        new Player("Stendardo", DEFENDER, 71, 0.26, 0.60),
                        new Player("Emilson", DEFENDER, 74, 0.47, 0.23),
                        new Player("Zauri", DEFENDER, 73, 0.33, 0.53),
                        new Player("Liverani", MIDFIELDER, 81, 0.67, 0.33),
                        new Player("Behrami", MIDFIELDER, 70, 0.63, 0.74),
                        new Player("Cesar", MIDFIELDER, 85, 0.80, 0.60),
                        new Player("Di Canio", FORWARD, 81, 0.81, 0.62),
                        new Player("Rocchi", FORWARD, 76, 0.81, 0.44),
                        new Player("Inzaghi", FORWARD, 84, 0.90, 0.39)
                )),
                new Team("Fiorentina", Arrays.asList(
                        new Player("Frey", GOALKEEPER, 83, 0, 0),
                        new Player("Pancaro", DEFENDER, 72, 0.32, 0.23),
                        new Player("Ujfalusi", DEFENDER, 83, 0.31, 0.64),
                        new Player("Viali", DEFENDER, 76, 0.37, 0.57),
                        new Player("Maggio", DEFENDER, 69, 0.41, 0.68),
                        new Player("Fiore", MIDFIELDER, 76, 0.76, 0.89),
                        new Player("Brocchi", MIDFIELDER, 74, 0.53, 0.61),
                        new Player("Jorgensen", MIDFIELDER, 81, 0.78, 0.79),
                        new Player("Bojinov", FORWARD, 81, 0.91, 0.79),
                        new Player("Toni", FORWARD, 80, 0.87, 0.46),
                        new Player("Pazzini", FORWARD, 73, 0.77, 0.68)
                )),
                new Team("Siena", Arrays.asList(
                        new Player("Mirante", GOALKEEPER, 67, 0, 0),
                        new Player("Colonnese", DEFENDER, 71, 0.44, 0.53),
                        new Player("Negro", DEFENDER, 72, 0.27, 0.66),
                        new Player("Legrottaglie", DEFENDER, 81, 0.40, 0.43),
                        new Player("Falsini", DEFENDER, 66, 0.36, 0.39),
                        new Player("Vergassola", MIDFIELDER, 67, 0.40, 0.66),
                        new Player("Alberto", MIDFIELDER, 77, 0.47, 0.48),
                        new Player("Cozza", MIDFIELDER, 79, 0.81, 0.81),
                        new Player("Locatelli", FORWARD, 67, 0.48, 0.78),
                        new Player("Chiesa", FORWARD, 73, 0.79, 0.74),
                        new Player("Nanni", FORWARD, 78, 0.86, 0.73)
                )),
                new Team("Parma", Arrays.asList(
                        new Player("Lupatelli", GOALKEEPER, 69, 0, 0),
                        new Player("Bonera", DEFENDER, 81, 0.30, 0.36),
                        new Player("Cannavaro", DEFENDER, 68, 0.47, 0.41),
                        new Player("Cardone", DEFENDER, 66, 0.21, 0.37),
                        new Player("Pasquale", DEFENDER, 70, 0.24, 0.43),
                        new Player("Simplicio", MIDFIELDER, 76, 0.68, 0.77),
                        new Player("Grella", MIDFIELDER, 70, 0.60, 0.46),
                        new Player("Bresciano", MIDFIELDER, 73, 0.72, 0.44),
                        new Player("Dedic", FORWARD, 59, 0.66, 0.67),
                        new Player("Corradi", FORWARD, 80, 0.82, 0.61),
                        new Player("Grieco", FORWARD, 64, 0.60, 0.57)
                )),
                new Team("Sampdoria", Arrays.asList(
                        new Player("Antonioli", GOALKEEPER, 67, 0, 0),
                        new Player("Zenoni", DEFENDER, 68, 0.60, 0.71),
                        new Player("Sala", DEFENDER, 75, 0.25, 0.51),
                        new Player("Pavan", DEFENDER, 72, 0.48, 0.55),
                        new Player("Pisano", DEFENDER, 67, 0.32, 0.68),
                        new Player("Doni", MIDFIELDER, 72, 0.69, 0.82),
                        new Player("Volpi", MIDFIELDER, 70, 0.43, 0.82),
                        new Player("Tonetto", MIDFIELDER, 71, 0.61, 0.79),
                        new Player("Bazzani", FORWARD, 77, 0.87, 0.69),
                        new Player("Flachi", FORWARD, 77, 0.70, 0.81),
                        new Player("Bonazzoli", FORWARD, 76, 0.70, 0.48)
                )),
                new Team("Lecce", Arrays.asList(
                        new Player("Sicignano", GOALKEEPER, 77, 0, 0),
                        new Player("Angelo", DEFENDER, 70, 0.49, 0.79),
                        new Player("Stovini", DEFENDER, 69, 0.54, 0.41),
                        new Player("Diamoutene", DEFENDER, 67, 0.47, 0.31),
                        new Player("Rullo", DEFENDER, 50, 0.57, 0.42),
                        new Player("Giacomazzi", MIDFIELDER, 73, 0.67, 0.71),
                        new Player("Cassetti", MIDFIELDER, 72, 0.67, 0.73),
                        new Player("Valdes", MIDFIELDER, 72, 0.65, 0.62),
                        new Player("Konan", FORWARD, 79, 0.72, 0.71),
                        new Player("Vucinic", FORWARD, 75, 0.81, 0.57),
                        new Player("Eremenko", FORWARD, 62, 0.63, 0.59)
                )),
                new Team("Palermo", Arrays.asList(
                        new Player("Santoni", GOALKEEPER, 69, 0, 0),
                        new Player("Zaccardo", DEFENDER, 63, 0.48, 0.23),
                        new Player("Biava", DEFENDER, 72, 0.21, 0.23),
                        new Player("Barzagli", DEFENDER, 76, 0.31, 0.21),
                        new Player("Grosso", DEFENDER, 65, 0.21, 0.69),
                        new Player("Corini", MIDFIELDER, 77, 0.72, 0.81),
                        new Player("Barone", MIDFIELDER, 73, 0.44, 0.79),
                        new Player("Santana", MIDFIELDER, 70, 0.68, 0.81),
                        new Player("Pepe", FORWARD, 53, 0.40, 0.56),
                        new Player("Makinwa", FORWARD, 71, 0.73, 0.57),
                        new Player("Caracciolo", FORWARD, 67, 0.70, 0.68)
                )),
                new Team("Udinese", Arrays.asList(
                        new Player("De Sanctis", GOALKEEPER, 82, 0, 0),
                        new Player("Motta", DEFENDER, 62, 0.23, 0.20),
                        new Player("Sensini", DEFENDER, 81, 0.39, 0.25),
                        new Player("Juarez", DEFENDER, 69, 0.23, 0.47),
                        new Player("Candela", DEFENDER, 75, 0.42, 0.44),
                        new Player("Pinzi", MIDFIELDER, 64, 0.48, 0.23),
                        new Player("Vidigal", MIDFIELDER, 73, 0.47, 0.52),
                        new Player("Zenoni", MIDFIELDER, 66, 0.62, 0.31),
                        new Player("Di Michele", FORWARD, 74, 0.70, 0.79),
                        new Player("Iaquinta", FORWARD, 70, 0.68, 0.89),
                        new Player("Di Natale", FORWARD, 76, 0.75, 0.90)
                )),
                new Team("Chievo", Arrays.asList(
                        new Player("Fontana", GOALKEEPER, 71, 0, 0),
                        new Player("Mantovani", DEFENDER, 64, 0.32, 0.51),
                        new Player("Mandelli", DEFENDER, 70, 0.28, 0.44),
                        new Player("D'Anna", DEFENDER, 73, 0.32, 0.23),
                        new Player("Marchese", DEFENDER, 62, 0.41, 0.56),
                        new Player("Zanchetta", MIDFIELDER, 65, 0.32, 0.79),
                        new Player("Brighi", MIDFIELDER, 78, 0.71, 0.61),
                        new Player("Luciano", MIDFIELDER, 62, 0.62, 0.64),
                        new Player("Cossato", FORWARD, 72, 0.70, 0.67),
                        new Player("Amauri", FORWARD, 72, 0.70, 0.79),
                        new Player("Pellissier", FORWARD, 62, 0.60, 0.78)
                )),
                new Team("Reggina", Arrays.asList(
                        new Player("Pelizzoli", GOALKEEPER, 79, 0, 0),
                        new Player("Zoppetti", DEFENDER, 61, 0.41, 0.32),
                        new Player("Cannarsa", DEFENDER, 63, 0.50, 0.57),
                        new Player("Franceschini", DEFENDER, 63, 0.43, 0.57),
                        new Player("De Rosa", DEFENDER, 73, 0.46, 0.63),
                        new Player("Mesto", MIDFIELDER, 72, 0.41, 0.68),
                        new Player("Mozart", MIDFIELDER, 67, 0.56, 0.62),
                        new Player("Paredes", MIDFIELDER, 70, 0.57, 0.58),
                        new Player("Cavalli", FORWARD, 52, 0.50, 0.61),
                        new Player("Dionigi", FORWARD, 76, 0.80, 0.74),
                        new Player("Bianchi", FORWARD, 60, 0.60, 0.61)
                )),
                new Team("Cagliari", Arrays.asList(
                        new Player("Campagnolo", GOALKEEPER, 62, 0, 0),
                        new Player("Lopez", DEFENDER, 61, 0.44, 0.61),
                        new Player("Bega", DEFENDER, 60, 0.42, 0.52),
                        new Player("Pisano", DEFENDER, 56, 0.43, 0.58),
                        new Player("Agostini", DEFENDER, 60, 0.59, 0.59),
                        new Player("Gobbi", MIDFIELDER, 63, 0.48, 0.61),
                        new Player("Abeijon", MIDFIELDER, 61, 0.44, 0.71),
                        new Player("Budel", MIDFIELDER, 64, 0.53, 0.64),
                        new Player("Esposito", FORWARD, 71, 0.71, 0.63),
                        new Player("Suazo", FORWARD, 78, 0.77, 0.71),
                        new Player("Langella", FORWARD, 69, 0.70, 0.77)
                )),
                new Team("Messina", Arrays.asList(
                        new Player("Gazzoli", GOALKEEPER, 80, 0, 0),
                        new Player("Rafael", DEFENDER, 72, 0.23, 0.56),
                        new Player("Zoro", DEFENDER, 59, 0.39, 0.47),
                        new Player("Cristante", DEFENDER, 64, 0.34, 0.54),
                        new Player("Razaei", DEFENDER, 72, 0.48, 0.68),
                        new Player("Donati", MIDFIELDER, 65, 0.41, 0.57),
                        new Player("D'Agostino", MIDFIELDER, 67, 0.54, 0.48),
                        new Player("Morelli", MIDFIELDER, 61, 0.44, 0.42),
                        new Player("Cucciari", FORWARD, 60, 0.62, 0.57),
                        new Player("Sculli", FORWARD, 71, 0.70, 0.59),
                        new Player("Zampagna", FORWARD, 72, 0.80, 0.61)
                )),
                new Team("Livorno", Arrays.asList(
                        new Player("Amelia", GOALKEEPER, 73, 0, 0),
                        new Player("A. Lucarelli", DEFENDER, 76, 0.71, 0.66),
                        new Player("Belleri", DEFENDER, 77, 0.53, 0.66),
                        new Player("Malera", DEFENDER, 74, 0.43, 0.37),
                        new Player("Grandoni", DEFENDER, 76, 0.38, 0.67),
                        new Player("Grauso", MIDFIELDER, 66, 0.57, 0.48),
                        new Player("Ruotolo", MIDFIELDER, 68, 0.62, 0.47),
                        new Player("Licka", MIDFIELDER, 66, 0.64, 0.68),
                        new Player("Palladino", FORWARD, 67, 0.84, 0.65),
                        new Player("C. Lucarelli", FORWARD, 68, 0.54, 0.89),
                        new Player("Paulinho", FORWARD, 59, 0.61, 0.66)
                )),
                new Team("Empoli", Arrays.asList(
                        new Player("Berti", GOALKEEPER, 74, 0, 0),
                        new Player("Busce", DEFENDER, 65, 0.54, 0.42),
                        new Player("Pratali", DEFENDER, 73, 0.43, 0.27),
                        new Player("Lucchini", DEFENDER, 66, 0.43, 0.39),
                        new Player("Bonetto", DEFENDER, 53, 0.41, 0.57),
                        new Player("Ascoli", MIDFIELDER, 72, 0.70, 0.58),
                        new Player("Almiron", MIDFIELDER, 65, 0.60, 0.43),
                        new Player("Vannucchi", MIDFIELDER, 65, 0.47, 0.78),
                        new Player("Gasparetto", FORWARD, 61, 0.42, 0.42),
                        new Player("Tavano", FORWARD, 69, 0.74, 0.36),
                        new Player("Pozzi", FORWARD, 68, 0.64, 0.43)
                )),
                new Team("Treviso", Arrays.asList(
                        new Player("Handanovic", GOALKEEPER, 76, 0, 0),
                        new Player("Galeoto", DEFENDER, 55, 0.43, 0.44),
                        new Player("Dellafiore", DEFENDER, 68, 0.48, 0.44),
                        new Player("Zaninelli", DEFENDER,71, 0.52, 0.48),
                        new Player("Di Venanzio", DEFENDER, 51, 0.48, 0.61),
                        new Player("De Martino", MIDFIELDER, 65, 0.57, 0.56),
                        new Player("Anderson", MIDFIELDER, 66, 0.66, 0.71),
                        new Player("Filippini", MIDFIELDER, 69, 0.51, 0.51),
                        new Player("Begheto", FORWARD, 52, 0.47, 0.56),
                        new Player("Piovaccari", FORWARD, 68, 0.77, 0.66),
                        new Player("Bagnara", FORWARD, 65, 0.71, 0.62)
                )),
                new Team("Ascoli", Arrays.asList(
                        new Player("Coppola", GOALKEEPER, 60, 0, 0),
                        new Player("Carbone", DEFENDER, 59, 0.44, 0.59),
                        new Player("Martinelli", DEFENDER, 54, 0.39, 0.49),
                        new Player("Corallo", DEFENDER, 56, 0.36, 0.41),
                        new Player("Modesto", DEFENDER, 55, 0.43, 0.44),
                        new Player("Cordova", MIDFIELDER, 57, 0.56, 0.58),
                        new Player("Giampaolo", MIDFIELDER, 63, 0.61, 0.69),
                        new Player("Agomeri", MIDFIELDER, 53, 0.53, 0.51),
                        new Player("Fini", FORWARD, 54, 0.51, 0.42),
                        new Player("Ferrante", FORWARD, 73, 0.80, 0.69),
                        new Player("Ascenzi", FORWARD, 47, 0.44, 0.52)
                ))
        ));
    }

         */

}
