package chapters.chapter_12.exercise;

public class Exercise_14 {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate();
        MyDate myDate2 = new MyDate(34355555133101L);
        System.out.println(myDate1.getDay()+"/"+myDate1.getMonth()+"/"+myDate1.getYear()+" (for myDate1)");
        System.out.println(myDate2.getDay()+"/"+myDate2.getMonth()+"/"+myDate2.getYear()+" (for myDate2)");

    }


}

