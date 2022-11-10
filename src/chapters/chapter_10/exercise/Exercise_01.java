package chapters.chapter_10.Exercise;

public class Exercise_01 {
    public static void main(String[] args) {
        Time time = new Time(555550000);
        System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());

    }

}

class Time {
    private long hour;
    private long minute;
    private long second;

    public Time(){
        long totalSeconds = System.currentTimeMillis() / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        this.hour = totalHours % 24;
        this.minute = totalMinutes % 60;
        this.second = totalSeconds % 60;
    }
    public Time(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        this.hour = totalHours % 24;
        this.minute = totalMinutes % 60;
        this.second = totalSeconds % 60;

    }
    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

}

