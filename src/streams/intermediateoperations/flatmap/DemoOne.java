package streams.intermediateoperations.flatmap;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

class City {
    private String name;
    private int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}

class State {
    private String name;
    private List<City> cities;

    public State(String name, List<City> cities) {
        this.name = name;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}

public class DemoOne {
    public static void main(String[] args) {
        List<City> citiesOfBagmati = List.of(new City("Kathmandu", 1200000),
                new City("Dhading", 500000), new City("Hetauda", 700000));

        List<City> citiesOfGandaki = List.of(new City("Pokhara", 1200000),
                new City("Butwal", 500000), new City("Tansen", 700000));

        List<City> citiesOfNarayani = List.of(new City("Lumbini", 1200000),
                new City("Janakpur", 500000), new City("Nijgadh", 700000));

        List<State> states = List.of(new State("Bagmati", citiesOfBagmati),
                new State("Gandaki", citiesOfGandaki), new State("Narayani", citiesOfNarayani));

//        int totalPopulation = 0;
//        for (State state : states) {
//            for (City city : state.getCities()) {
//                totalPopulation += city.getPopulation();
//            }
            /* the above inner loop is in the map-filter-reduce form. so we can stream it.*/
//            totalPopulation += state.getCities().stream().mapToInt(City::getPopulation).sum();
            /* The connection between the loop on the states and this stream does not fit well in the map/reduce pattern,
             and putting a stream in a loop is not a very nice pattern of code. */
//        }

//        Function<State, Stream<City>> stateToCity = state -> state.getCities().stream();

        int totalPopulation = states.stream().flatMap(state -> state.getCities().stream())
                .mapToInt(City::getPopulation).sum();
        System.out.println("Total population: " + totalPopulation);


    }
}
