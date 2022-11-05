package chapters.chapter_09;

public class Location {
    public int row;
    public int column;
    public double maxValue;
    public Location(){
        maxValue =0;
        row=0;
        column=0;

    }
    public Location(int row ,int column, double maxValue){
        this.row =row;
        this.column=column;
        this.maxValue=maxValue;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public double getMaxValue() {
        return maxValue;
    }

}

~

