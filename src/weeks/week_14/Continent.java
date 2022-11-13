package weeks.week_14;

public class Continent {
    protected String name;
    protected double area;
    protected int population;
    protected String climate;
    private int numberOfCountry;

    public Continent() {
        this("", 0, 0, "");
    }

    public Continent(String name, double area, int population, String climate) {
        this.name = name;
        this.area = area;
        this.population = population;
        this.climate = climate;
    }

    public Continent(String name, double area, int population, String climate, int numberOfCountry) {
        this.name = name;
        this.area = area;
        this.population = population;
        this.climate = climate;
        this.numberOfCountry = numberOfCountry;
    }


    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public int getPopulation() {
        return population;
    }

    public String getClimate() {
        return climate;
    }

    public int getNumberOfCountry() {
        return numberOfCountry;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public void setNumberOfCountry(int numberOfCountry) {
        this.numberOfCountry = numberOfCountry;
    }


    @Override
    public String toString() {
        return "Continent name: " + getName() + "\nContinent area: " + getArea() + "\nContinent's climate: " + getClimate()
                + "\nContinent's population: " + getPopulation() + "\nContinent has " + getNumberOfCountry() + " conutry";
    }
}

