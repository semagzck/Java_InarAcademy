package chapters.chapter_09;

public class Stock {
    public String symbol;
    public String name;
    double previousClosingPrice;
    double currentPrice;


    public Stock() {
    }

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) * 100) / previousClosingPrice;
    }

}

