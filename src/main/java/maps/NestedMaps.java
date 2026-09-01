package maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NestedMaps {
    /**
     * Take a list of City-objects, and for each City, place it in the map so that
     * the key is the continent, and the value is another map, where the key is the country name
     * and the value is yet another map, mapping each city to it's population
     * @param cities
     */
    public static void buildWorld(List<City> cities) {
        Map<String, Map<String, Map<String, Integer>>> world = new HashMap<>();

        /* Example: (including only some continents, a couple of countries/cities per continent)
        world = {
                Europe -> {
                    France -> { Paris -> 2148327, Lyon -> 515695 },
                    Germany -> { Berlin -> 3769000, Munich -> 1488000 }
                },
                Asia -> {
                    China -> { Beijing -> 21540000, Shanghai -> 24240000 },
                    India -> { Delhi -> 30290000, Mumbai -> 20411000 }
                },
                Africa -> {
                    Nigeria -> { Lagos -> 14000000, Abuja -> 3600000 },
                    South Africa -> { Johannesburg -> 5635000, Cape Town -> 4800000 }
                },
                North America -> {
                    United States -> { New York City -> 8336817, Los Angeles -> 3979576 },
                    Canada -> { Toronto -> 2930000, Vancouver -> 675218 }
                },
                South America -> {
                    Brazil -> { São Paulo -> 12325232, Rio de Janeiro -> 6747815 },
                    Argentina -> { Buenos Aires -> 3075646, Córdoba -> 1391000 }
                }
        }
        */

        // FILL IN CODE:
        // Fill the map

        // Display the map
        System.out.println(world);
    }


}
