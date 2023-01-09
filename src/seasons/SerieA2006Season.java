package seasons;

import teams.Player;
import teams.Team;

import java.util.Arrays;

public class SerieA2006Season {

    public static Season create() {
        return new Season("Serie A 2005-2006", Arrays.asList(
                new Team("Milan", Arrays.asList(
                        new Player("Dida", "GKP", 92, 0, 0),
                        new Player("Stam", "DEF", 90, 0.26, 0.21),
                        new Player("Nesta", "DEF", 90, 0.36, 0.41),
                        new Player("Maldini", "DEF", 91, 0.34, 0.22),
                        new Player("Cafu", "DEF", 87, 0.22, 0.61),
                        new Player("Gattuso", "MID", 87, 0.78, 0.21),
                        new Player("Pirlo", "MID",  86, 0.47, 0.84),
                        new Player("Seedorf", "MID", 90, 0.84, 0.88),
                        new Player("Kaka", "FOR", 90, 0.88, 0.87),
                        new Player("Shevchenko", "FOR", 93, 0.95, 0.77),
                        new Player("Gilardino", "FOR", 87, 0.93, 0.94)
                )),
                new Team("Juventus", Arrays.asList(
                        new Player("Buffon", "GKP", 95, 0, 0),
                        new Player("Zebina", "DEF", 74, 0.37, 0.67),
                        new Player("Thuram", "DEF", 90, 0.21, 0.39),
                        new Player("Cannavaro", "DEF", 89, 0.44, 0.71),
                        new Player("Zambrotta", "DEF", 91, 0.33, 0.92),
                        new Player("Camoranesi", "MID", 84, 0.82, 0.92),
                        new Player("Viera", "MID", 89, 0.72, 0.52),
                        new Player("Nedved", "MID", 90, 0.85, 0.97),
                        new Player("Ibrahimovic", "FOR", 91, 0.90, 0.91),
                        new Player("Del Piero", "FOR", 89, 0.89, 0.89),
                        new Player("Trezeguet", "FOR", 92, 0.95, 0.77)
                )),
                new Team("Internazionale", Arrays.asList(
                        new Player("Toldo", "GKP", 90, 0, 0),
                        new Player("Ze Maria", "DEF", 71, 0.32, 0.41),
                        new Player("Cordoba", "DEF",  79, 0.44, 0.38),
                        new Player("Samuel", "DEF", 87, 0.42, 0.63),
                        new Player("Zanetti", "DEF", 85, 0.30, 0.24),
                        new Player("Cambiasso", "MID", 85, 0.59, 0.58),
                        new Player("Solari", "MID", 84, 0.84, 0.82),
                        new Player("Figo", "MID", 89, 0.89, 0.82),
                        new Player("Martins", "FOR", 85, 0.89, 0.88),
                        new Player("Adriano", "FOR", 94, 0.96, 0.89),
                        new Player("Recoba", "FOR", 86, 0.80, 0.89)
                )),
                new Team("Roma", Arrays.asList(
                        new Player("Curci", "GKP", 75, 0, 0),
                        new Player("Panucci", "DEF", 78, 0.47, 0.39),
                        new Player("Kuffour", "DEF", 80, 0.42, 0.34),
                        new Player("Chivu", "DEF", 81, 0.23, 0.78),
                        new Player("Mexes", "DEF", 84, 0.28, 0.35),
                        new Player("De Rossi", "MID", 78, 0.79, 0.76),
                        new Player("Mancini", "MID", 81, 0.78, 0.56),
                        new Player("Perrotta", "MID", 81, 0.74, 0.43),
                        new Player("Totti", "FOR", 89, 0.82, 0.85),
                        new Player("Montella", "FOR", 83, 0.80, 0.78),
                        new Player("Cassano", "FOR", 89, 0.88, 0.81)
                )),
                new Team("Lazio", Arrays.asList(
                        new Player("Peruzzi", "GKP", 85, 0, 0),
                        new Player("Oddo", "DEF", 84, 0.28, 0.41),
                        new Player("Stendardo", "DEF", 71, 0.26, 0.60),
                        new Player("Emilson", "DEF", 74, 0.47, 0.23),
                        new Player("Zauri", "DEF", 73, 0.33, 0.53),
                        new Player("Liverani", "MID", 81, 0.67, 0.33),
                        new Player("Behrami", "MID", 70, 0.63, 0.74),
                        new Player("Cesar", "MID", 85, 0.80, 0.60),
                        new Player("Di Canio", "FOR", 81, 0.81, 0.62),
                        new Player("Rocchi", "FOR", 76, 0.81, 0.44),
                        new Player("Inzaghi", "FOR", 84, 0.90, 0.39)
                )),
                new Team("Fiorentina", Arrays.asList(
                        new Player("Frey", "GKP", 83, 0, 0),
                        new Player("Pancaro", "DEF", 72, 0.32, 0.23),
                        new Player("Ujfalusi", "DEF", 83, 0.31, 0.64),
                        new Player("Viali", "DEF", 76, 0.37, 0.57),
                        new Player("Maggio", "DEF", 69, 0.41, 0.68),
                        new Player("Fiore", "MID", 76, 0.76, 0.89),
                        new Player("Brocchi", "MID", 74, 0.53, 0.61),
                        new Player("Jorgensen", "MID", 81, 0.78, 0.79),
                        new Player("Bojinov", "FOR", 81, 0.91, 0.79),
                        new Player("Toni", "FOR", 80, 0.87, 0.46),
                        new Player("Pazzini", "FOR", 73, 0.77, 0.68)
                )),
                new Team("Siena", Arrays.asList(
                        new Player("Mirante", "GKP", 67, 0, 0),
                        new Player("Colonnese", "DEF", 71, 0.44, 0.53),
                        new Player("Negro", "DEF", 72, 0.27, 0.66),
                        new Player("Legrottaglie", "DEF", 81, 0.40, 0.43),
                        new Player("Falsini", "DEF", 66, 0.36, 0.39),
                        new Player("Vergassola", "MID", 67, 0.40, 0.66),
                        new Player("Alberto", "MID", 77, 0.47, 0.48),
                        new Player("Cozza", "MID", 79, 0.81, 0.81),
                        new Player("Locatelli", "FOR", 67, 0.48, 0.78),
                        new Player("Chiesa", "FOR", 73, 0.79, 0.74),
                        new Player("Nanni", "FOR", 78, 0.86, 0.73)
                )),
                new Team("Parma", Arrays.asList(
                        new Player("Lupatelli", "GKP", 69, 0, 0),
                        new Player("Bonera", "DEF", 81, 0.30, 0.36),
                        new Player("Cannavaro", "DEF", 68, 0.47, 0.41),
                        new Player("Cardone", "DEF", 66, 0.21, 0.37),
                        new Player("Pasquale", "DEF", 70, 0.24, 0.43),
                        new Player("Simplicio", "MID", 76, 0.68, 0.77),
                        new Player("Grella", "MID", 70, 0.60, 0.46),
                        new Player("Bresciano", "MID", 73, 0.72, 0.44),
                        new Player("Dedic", "FOR", 59, 0.66, 0.67),
                        new Player("Corradi", "FOR", 80, 0.82, 0.61),
                        new Player("Grieco", "FOR", 64, 0.60, 0.57)
                )),
                new Team("Sampdoria", Arrays.asList(
                        new Player("Antonioli", "GKP", 67, 0, 0),
                        new Player("Zenoni", "DEF", 68, 0.60, 0.71),
                        new Player("Sala", "DEF", 75, 0.25, 0.51),
                        new Player("Pavan", "DEF", 72, 0.48, 0.55),
                        new Player("Pisano", "DEF", 67, 0.32, 0.68),
                        new Player("Doni", "MID", 72, 0.69, 0.82),
                        new Player("Volpi", "MID", 70, 0.43, 0.82),
                        new Player("Tonetto", "MID", 71, 0.61, 0.79),
                        new Player("Bazzani", "FOR", 77, 0.87, 0.69),
                        new Player("Flachi", "FOR", 77, 0.70, 0.81),
                        new Player("Bonazzoli", "FOR", 76, 0.70, 0.48)
                )),
                new Team("Lecce", Arrays.asList(
                        new Player("Sicignano", "GKP", 77, 0, 0),
                        new Player("Angelo", "DEF", 70, 0.49, 0.79),
                        new Player("Stovini", "DEF", 69, 0.54, 0.41),
                        new Player("Diamoutene", "DEF", 67, 0.47, 0.31),
                        new Player("Rullo", "DEF", 50, 0.57, 0.42),
                        new Player("Giacomazzi", "MID", 73, 0.67, 0.71),
                        new Player("Cassetti", "MID", 72, 0.67, 0.73),
                        new Player("Valdes", "MID", 72, 0.65, 0.62),
                        new Player("Konan", "FOR", 79, 0.72, 0.71),
                        new Player("Vucinic", "FOR", 75, 0.81, 0.57),
                        new Player("Eremenko", "FOR", 62, 0.63, 0.59)
                )),
                new Team("Palermo", Arrays.asList(
                        new Player("Santoni", "GKP", 69, 0, 0),
                        new Player("Zaccardo", "DEF", 63, 0.48, 0.23),
                        new Player("Biava", "DEF", 72, 0.21, 0.23),
                        new Player("Barzagli", "DEF", 76, 0.31, 0.21),
                        new Player("Grosso", "DEF", 65, 0.21, 0.69),
                        new Player("Corini", "MID", 77, 0.72, 0.81),
                        new Player("Barone", "MID", 73, 0.44, 0.79),
                        new Player("Santana", "MID", 70, 0.68, 0.81),
                        new Player("Pepe", "FOR", 53, 0.40, 0.56),
                        new Player("Makinwa", "FOR", 71, 0.73, 0.57),
                        new Player("Caracciolo", "FOR", 67, 0.70, 0.68)
                )),
                new Team("Udinese", Arrays.asList(
                        new Player("De Sanctis", "GKP", 82, 0, 0),
                        new Player("Motta", "DEF", 62, 0.23, 0.20),
                        new Player("Sensini", "DEF", 81, 0.39, 0.25),
                        new Player("Juarez", "DEF", 69, 0.23, 0.47),
                        new Player("Candela", "DEF", 75, 0.42, 0.44),
                        new Player("Pinzi", "MID", 64, 0.48, 0.23),
                        new Player("Vidigal", "MID", 73, 0.47, 0.52),
                        new Player("Zenoni", "MID", 66, 0.62, 0.31),
                        new Player("Di Michele", "FOR", 74, 0.70, 0.79),
                        new Player("Iaquinta", "FOR", 70, 0.68, 0.89),
                        new Player("Di Natale", "FOR", 76, 0.75, 0.90)
                )),
                new Team("Chievo", Arrays.asList(
                        new Player("Fontana", "GKP", 71, 0, 0),
                        new Player("Mantovani", "DEF", 64, 0.32, 0.51),
                        new Player("Mandelli", "DEF", 70, 0.28, 0.44),
                        new Player("D'Anna", "DEF", 73, 0.32, 0.23),
                        new Player("Marchese", "DEF", 62, 0.41, 0.56),
                        new Player("Zanchetta", "MID", 65, 0.32, 0.79),
                        new Player("Brighi", "MID", 78, 0.71, 0.61),
                        new Player("Luciano", "MID", 62, 0.62, 0.64),
                        new Player("Cossato", "FOR", 72, 0.70, 0.67),
                        new Player("Amauri", "FOR", 72, 0.70, 0.79),
                        new Player("Pellissier", "FOR", 62, 0.60, 0.78)
                )),
                new Team("Reggina", Arrays.asList(
                        new Player("Pelizzoli", "GKP", 79, 0, 0),
                        new Player("Zoppetti", "DEF", 61, 0.41, 0.32),
                        new Player("Cannarsa", "DEF", 63, 0.50, 0.57),
                        new Player("Franceschini", "DEF", 63, 0.43, 0.57),
                        new Player("De Rosa", "DEF", 73, 0.46, 0.63),
                        new Player("Mesto", "MID", 72, 0.41, 0.68),
                        new Player("Mozart", "MID", 67, 0.56, 0.62),
                        new Player("Paredes", "MID", 70, 0.57, 0.58),
                        new Player("Cavalli", "FOR", 52, 0.50, 0.61),
                        new Player("Dionigi", "FOR", 76, 0.80, 0.74),
                        new Player("Bianchi", "FOR", 60, 0.60, 0.61)
                )),
                new Team("Cagliari", Arrays.asList(
                        new Player("Campagnolo", "GKP", 62, 0, 0),
                        new Player("Lopez", "DEF", 61, 0.44, 0.61),
                        new Player("Bega", "DEF", 60, 0.42, 0.52),
                        new Player("Pisano", "DEF", 56, 0.43, 0.58),
                        new Player("Agostini", "DEF", 60, 0.59, 0.59),
                        new Player("Gobbi", "MID", 63, 0.48, 0.61),
                        new Player("Abeijon", "MID", 61, 0.44, 0.71),
                        new Player("Budel", "MID", 64, 0.53, 0.64),
                        new Player("Esposito", "FOR", 71, 0.71, 0.63),
                        new Player("Suazo", "FOR", 78, 0.77, 0.71),
                        new Player("Langella", "FOR", 69, 0.70, 0.77)
                )),
                new Team("Messina", Arrays.asList(
                        new Player("Gazzoli", "GKP", 80, 0, 0),
                        new Player("Rafael", "DEF", 72, 0.23, 0.56),
                        new Player("Zoro", "DEF", 59, 0.39, 0.47),
                        new Player("Cristante", "DEF", 64, 0.34, 0.54),
                        new Player("Razaei", "DEF", 72, 0.48, 0.68),
                        new Player("Donati", "MID", 65, 0.41, 0.57),
                        new Player("D'Agostino", "MID", 67, 0.54, 0.48),
                        new Player("Morelli", "MID", 61, 0.44, 0.42),
                        new Player("Cucciari", "FOR", 60, 0.62, 0.57),
                        new Player("Sculli", "FOR", 71, 0.70, 0.59),
                        new Player("Zampagna", "FOR", 72, 0.80, 0.61)
                )),
                new Team("Livorno", Arrays.asList(
                        new Player("Amelia", "GKP", 73, 0, 0),
                        new Player("A. Lucarelli", "DEF", 76, 0.71, 0.66),
                        new Player("Belleri", "DEF", 77, 0.53, 0.66),
                        new Player("Malera", "DEF", 74, 0.43, 0.37),
                        new Player("Grandoni", "DEF", 76, 0.38, 0.67),
                        new Player("Grauso", "MID", 66, 0.57, 0.48),
                        new Player("Ruotolo", "MID", 68, 0.62, 0.47),
                        new Player("Licka", "MID", 66, 0.64, 0.68),
                        new Player("Palladino", "FOR", 67, 0.84, 0.65),
                        new Player("C. Lucarelli", "FOR", 68, 0.54, 0.89),
                        new Player("Paulinho", "FOR", 59, 0.61, 0.66)
                )),
                new Team("Empoli", Arrays.asList(
                        new Player("Berti", "GKP", 74, 0, 0),
                        new Player("Busce", "DEF", 65, 0.54, 0.42),
                        new Player("Pratali", "DEF", 73, 0.43, 0.27),
                        new Player("Lucchini", "DEF", 66, 0.43, 0.39),
                        new Player("Bonetto", "DEF", 53, 0.41, 0.57),
                        new Player("Ascoli", "MID", 72, 0.70, 0.58),
                        new Player("Almiron", "MID", 65, 0.60, 0.43),
                        new Player("Vannucchi", "MID", 65, 0.47, 0.78),
                        new Player("Gasparetto", "FOR", 61, 0.42, 0.42),
                        new Player("Tavano", "FOR", 69, 0.74, 0.36),
                        new Player("Pozzi", "FOR", 68, 0.64, 0.43)
                )),
                new Team("Treviso", Arrays.asList(
                        new Player("Handanovic", "GKP", 76, 0, 0),
                        new Player("Galeoto", "DEF", 55, 0.43, 0.44),
                        new Player("Dellafiore", "DEF", 68, 0.48, 0.44),
                        new Player("Zaninelli", "DEF",71, 0.52, 0.48),
                        new Player("Di Venanzio", "DEF", 51, 0.48, 0.61),
                        new Player("De Martino", "MID", 65, 0.57, 0.56),
                        new Player("Anderson", "MID", 66, 0.66, 0.71),
                        new Player("Filippini", "MID", 69, 0.51, 0.51),
                        new Player("Begheto", "FOR", 52, 0.47, 0.56),
                        new Player("Piovaccari", "FOR", 68, 0.77, 0.66),
                        new Player("Bagnara", "FOR", 65, 0.71, 0.62)
                )),
                new Team("Ascoli", Arrays.asList(
                        new Player("Coppola", "GKP", 60, 0, 0),
                        new Player("Carbone", "DEF", 59, 0.44, 0.59),
                        new Player("Martinelli", "DEF", 54, 0.39, 0.49),
                        new Player("Corallo", "DEF", 56, 0.36, 0.41),
                        new Player("Modesto", "DEF", 55, 0.43, 0.44),
                        new Player("Cordova", "MID", 57, 0.56, 0.58),
                        new Player("Giampaolo", "MID", 63, 0.61, 0.69),
                        new Player("Agomeri", "MID", 53, 0.53, 0.51),
                        new Player("Fini", "FOR", 54, 0.51, 0.42),
                        new Player("Ferrante", "FOR", 73, 0.80, 0.69),
                        new Player("Ascenzi", "FOR", 47, 0.44, 0.52)
                ))
        ));
    }

}
