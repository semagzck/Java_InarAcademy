package chapters.chapter_09;

public class TestStock {
    public static void main(String[] args) {
        Stock s = new Stock("ORCL", "Oracle Corporation");
        s.previousClosingPrice = 34.5;
        s.setCurrentPrice(34.35);

        System.out.printf("The price-change percent of the stock s is %%%.2f", s.getChangePercent());
    }

}

