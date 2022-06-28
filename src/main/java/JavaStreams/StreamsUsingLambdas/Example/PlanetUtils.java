package JavaStreams.StreamsUsingLambdas.Example;

import java.util.List;
public class PlanetUtils {
    public List<Planet> getPlanetsBeginningWithM(List<Planet> planets) {
        return planets.stream().filter(s -> s.getName().startsWith("M")).toList();
    }
    public List<Planet> getPlanetsWithRings(List<Planet> planets) {
        return planets.stream().filter(Planet::getHasRings).toList();
    }
    public List<Planet> getPlanetsWithMoreThanThreeMoons(List<Planet> planets) {
        return planets.stream().filter(s->s.getNumberOfMoons() > 3).toList();
    }
    public List<Planet> getPlanetsWithDensityGreaterThanFive(List<Planet> planets) {
        return planets.stream().filter(s->s.getDensity() > 5).toList();
    }
}