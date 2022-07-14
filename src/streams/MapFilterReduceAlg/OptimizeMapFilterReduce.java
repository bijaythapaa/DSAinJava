package streams.MapFilterReduceAlg;

import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;
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

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}

public class OptimizeMapFilterReduce {
    public static void main(String[] args) {
        List<City> cities = List.of(new City("Kathmandu", 1200000),
                new City("Dhading", 15000), new City("Pokhara", 800000));

        /* Classic way */
        int sum = 0;
        for (City city : cities) {
            int population = city.getPopulation();
            if (population > 100_000) {
                sum += population;
            }
        }
        System.out.println("Sum: " + sum);

        /* Let's suppose Stream API doesnot exist, and map(), filter() and sum() method exists on Collection */
//        int sum = cities.map(city -> city.getPopulation())
//                .filter(population -> population > 100_000)
//                .sum();

        /* above code seems legit, but lets see in details */
//        Collection<Integer> populations = cities.map(city -> city.getPopulation());
//        Collection<Integer> filteredPopulation = populations.filter(population -> population > 100_000);
//        int sum = filteredPopulation.sum();

//        Now let us analyze this code.
//        first step (mapping) : You saw that if you have to process 1,000 cities,
//        then this mapping step produces 1,000 integers and put them in a collection.
//        second step (filtering) : It goes through all the elements and removes some of them following the given criterion.
//        That's another 1,000 elements to test and another collection to create, probably smaller.

//        For obvious performances reasons,
//        creating a map() method that would return a Collection on the Collection interface is not the right way to go.
//        You would end up creating unnecessary intermediate structures with a high overhead on both the memory and the CPU.


        /* The right pattern is: */
        Stream<City> cityStream = cities.stream();
        Stream<Integer> populations = cityStream.map(City::getPopulation);
        /* so in Stream interface, we have to do boxing/unboxing the data, to get in primitive type.
        * Solution is: IntStream, DoubleStream, LongStream interfaces. */
//        Stream<Integer> filteredPopulations = populations.filter(population -> population > 100_000);
//        int totalPopulation = filteredPopulations.mapToInt(Integer::intValue).sum();

//        IntStream filteredPopulations = /*need this cast, since populations is not IntStream*/ (IntStream) populations.filter(population -> population > 100_000);
//        int totalPopulation = filteredPopulations.sum();
//        System.out.println("Total Population: " + totalPopulation);
    }
}
