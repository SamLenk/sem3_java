import java.util.ArrayList;
import java.util.HashMap;

public class Planet {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");

        ArrayList<String> randomPlanets = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomIndex = (int) (Math.random() * planets.size());
            randomPlanets.add(planets.get(randomIndex));
        }

        HashMap<String, Integer> planetCounts = new HashMap<>();
        for (String planet : randomPlanets) {
            planetCounts.put(planet, planetCounts.getOrDefault(planet, 0) + 1);
        }

        for (String planet : planetCounts.keySet()) {
            int count = planetCounts.get(planet);
            System.out.println(planet + ": " + count);
        }
    }
}
