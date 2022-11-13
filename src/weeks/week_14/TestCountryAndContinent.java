package weeks.week_14;

public class TestCountryAndContinent {
    public static void main(String[] args) {
        Country turkiye = new Country("Turkiye", 783562, 83_000_000, "mediterranean climate",
                "Turkce", new String[]{"Kebap", "Kunefe", "Lahmacun", "Doner", "Baklava"});


        System.out.println(turkiye.toString());
        turkiye.countryBreadth();
        turkiye.formOfGovernment(3);

        System.out.println("------------");
        Continent europe = new Continent("Europe", 10530000, 750_000_000, "Temperate climate", 64);
        System.out.println(europe);
    }
}

